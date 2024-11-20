package day10;
// 얘네가 부모클래스

public class Terran {
	int x, y, hp;

	void 정지() {
		System.out.println("정지");
	}

	void 패트롤() {
		System.out.println(hp);
		System.out.println("정찰 중 ..");
	}

	void status() {
		System.out.println("체력 : " + hp);
		System.out.println("x: " + x + ", y: " + y);
	}
}
