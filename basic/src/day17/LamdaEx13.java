package day17;

import java.lang.reflect.Array;
import java.util.function.Supplier;

interface ArrayUtil {
	int count(int[] m); // 배열 갯수 갖고와
}

class Person {
	int[] m = { 10, 20, 30 };

	ArrayUtil util;

	public void action(ArrayUtil util) {
		System.out.println(util.count(m));
	}

}

class Member {
	String name;
	int score;

	public Member() {

	}

	public Member(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}

public class LamdaEx13 {
	public static void main(String[] args) {

		Person p = new Person();

		// ArrayUtil util => 인터페이스를 구현한 객체
		// ArrayUtil util = 람다식으로 표현

		ArrayUtil util0 = new ArrayUtil() {
			public int count(int[] m) {
				return Array.getLength(m);
			}
		};

		ArrayUtil util = m -> Array.getLength(m); // 위의 다섯줄을 한 줄로 줄여
		ArrayUtil util2 = Array::getLength; // 위의 한 줄을 또 줄여
		

		p.action(util);
		System.out.println("--------------------");

		p.action(m -> Array.getLength(m)); // new 하지 않고 쓸 수 있는 것은 static 메서드
		System.out.println("--------------------");

		// 메서드 참조
		// 메서드 참조해서 매개변수의 정보 및 리턴 타입을 알아내
		// 람다식에서 불필요한 매개변수를 제거하려고 함=> 람다의 축약형 (불필요하다 = 어차피 다 아는 것)

		// 클래스명::메서드명
		// 참조변수::메서드명

		// 1. 정적 메서드 참조일 경우 (static 메서드를 참조하기 때문에)
		p.action(Array::getLength); // Array 클래스에 있는 getLength 메서드 참조해
		System.out.println("--------------------");

		// 2. 동적 메서드 참조일 경우 (인스턴스 메서드(new 해야함)를 참조하기 때문에)
		Member m1 = new Member();

//		Supplier<Integer> s = () -> m1.getScore();
		Supplier<Integer> s = m1::getScore; // 위랑 같은 말, 어차피 매개변수, 리턴값 다 아니까..

		System.out.println("--------------------");

		// 3. 생성자 참조

//		 Supplier<Member> s2 = () -> new Member();
		Supplier<Member> s2 = Member::new; // Member 클래스에 있는 new라는 메서드(생성자도 특수 메서드이므로)
		System.out.println(s2.get());

	}

}
