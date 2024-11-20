package day09;

import day07.Marine;

public class TestMain5 {
	public static void main(String[] args) {

		Parent p1 = new Parent();

		Child c1 = new Child();

		System.out.println("p1 : " + p1);
		System.out.println("c1 : " + c1);

//		Marine m1;
//		m1 = p1;  다른 클래스이므로 안돼

		p1 = c1;
		// 부모의 참조변수 = 자식의 참조값 할당 가능 ! 
		
//		부모-자식간은 (클래스가 다르지) 서로의 참조값 복제 가능
		// 부모가 모르는 메서드는 호출 불가능 (Ex. goClub())

		// 부모의 참조변수 = 자식의 참조값 할당 Ok

		System.out.println(p1.name);

		p1.eating();
		System.out.println("-----------------------");

//		p1.goClub(); // 이건 부모가 모르는 메서드이기 때문에 사용불가

		Child c2;

		c2 = c1; // 같은 클래스끼리는 참조값 주고받기 가능
		System.out.println(c2.name);
		c2.eating();
		c2.goClub();

		System.out.println("-------------------------");
		
		Child c3;
//		c3 = p1; // 부모의 참조변수에 자식의 참조값을 담는건 가능하지만
				 // 자식의 참조변수에 부모의 참조값을 담는건 불가능(c1 = p1;)
		c3 = (Child)p1; // 객체 형변환, p1에는 c1의 참조값을 가지고 있기 때문에
						// 아주 예외적으로 형변환을 통해서 부모의 참조값을 자식의 참조변수에 담음
		System.out.println(c3.name);
		
		c3.goClub();
	}
}
