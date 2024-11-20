package day17;
// 람다식을 다양하게 표현하기 

interface Printable {
	void print(String msg);
}

public class LamdaEx4 {
	public static void main(String[] args) {

		Printable p = (String s) -> System.out.println(s);

		p.print("람다표현식 1번");

		System.out.println("-------------------");
		p = (String s) -> {
			System.out.println(s);
		};
		p.print("람다표현식 2번");

		System.out.println("-------------------");
		// 매개변수의 정보가 있어서 타입을 추론(유추)할 수 있으므로 자료형 생략 가능
		p = (s) -> System.out.println(s);
		p.print("람다표현식 3번");

		System.out.println("-------------------");
		// 매개변수가 한개만 존재한다면 () 생략가능
		p = s -> System.out.println(s);
		p.print("람다표현식 4번");
	}

}
