package day11;

public class Test {
	static int no1; // static 변수
	int no2; // instance 변수

	static { // static block
		System.out.println("static block이 실행");
		int a = 10;
		System.out.println("a : " + a);
	}

	Test() {
		System.out.println("기본 생성자");
	}

	public static void show() {
		System.out.println("static method : show() ");
	}

	public void show2() {
		System.out.println("instance method : show2() ");
	}
}
