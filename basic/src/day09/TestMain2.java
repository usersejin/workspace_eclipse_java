package day09;
// class SuperMan을 호출하는 TestMain

// import java.awt.Frame;

public class TestMain2 {
	public static void main(String[] args) {
		
//		SuperMan sm = new SuperMan();
		SuperMan sm = new SuperMan("클라크", "사진기자", 20, 190.0f, 70.7f);
		
		System.out.println("이름 : " + sm.name);
		System.out.println("키 : " + sm.height);
		System.out.println("몸무게 : " + sm.weight);
		System.out.println("직업 : " + sm.job);
		
		sm.eating();
		sm.thinking();
		sm.firelaser();
		sm.fly();
		
		System.out.println("-------------------");
		
//		// 윈도우 창 생성
//		Frame f = new Frame();
//		f.setSize(500, 500);
//		f.setVisible(true);
	}
	

}
