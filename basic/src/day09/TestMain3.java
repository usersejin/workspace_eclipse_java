package day09;

import day07.Marine;

public class TestMain3 {
	public static void main(String[] args) {
		// class : 사용자정의 자료형
		
		Parent p1 = new Parent("홍판서", 41, "판서");
		
		System.out.println(p1.name);
		
		p1.eating();
		p1.sleeping();
		p1.singing();
		p1.nagging();
		System.out.println("------------------------");
		
		
		
		// 자바의 모든 변수는 반드시 초기화한 후 사용해야함
		// error : The local variable m1 may not have been initialized
		Marine m1 = new Marine();
		
		// m1 = p1; // p1이 가지고 있는 변수의 값을 m1에 대입
		// 서로 다른 클래스는 참조값을 줄 수 없음
		// System.out.println(m1);
		
		// 같은 클래스끼리는 참조값 할당이 가능 // Marine 과 Parent 는 다른 클래스이기에 값을 주고 받아도 의미가 없음
		// 다른 클래스는 불가능
		
		Parent p2;
		
		p2 = p1; // 같은 클래스를 참조하는 변수끼리는 복제가 가능(값의 교환가능)
		// heap에 있는 메모리에도 접근 가능
		// 읽기, 수정 가능
		// 인스턴스는 한개인데 열쇠가 2개야 (p1, p2)
		
		// 근데 이걸 왜, 언제 써?
		
		System.out.println(p1.name); // 홍판서
		System.out.println(p2.name); // 홍판서
		
		p1.name = "루피";
		
		System.out.println(p1.name); // 루피
		System.out.println(p2.name); // 루피
		
		
	}

}
