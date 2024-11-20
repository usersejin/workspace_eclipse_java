package day12;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWin7 extends Frame {

	WindowAdapter wa;

	MyWin7() {

//		WindowAdapter t = new Test(); // Test t = new Test(); 대신 부모의 참조변수가 자식의 참조값을 받게 해서 사용할 수 있음
//		Test t = new Test(); 

		// 방법 2. 인터페이스를 구현한 객체 방법 1을 줄 인 것
		this.addWindowListener(new WindowAdapter() {// new WindowAdapter()
													// => new 뒤에 이름없이 인터페이스를 구현한 객체(이름도 필요없고, 참조값도 필요없는 1회용 객체)
			@Override
			public void windowClosing(WindowEvent e) { // ctl + space써서 자동완성 이용해
				System.exit(0);
			}
		}); // 중괄호 열고 닫고 후 소괄호 + 세미콜론 // 방법 2 여기까지

		this.addWindowListener(new Test()); // this.addWindowListener(t); 대신에 이렇게 써도 돼

//		this.addWindowListener(this); // add + 인터페이스명(WindowListener)

		// 방법 1 : 클래스명이 없는 : 익명 이너 클래스 1회용
//		WindowAdapter t = new WindowAdapter() { // 부모자식인 관계 이용 (test 와 WindowAdapter)
//			@Override
//			public void windowClosing(WindowEvent e) {
//				System.exit(0);
//			}
//		}; // 방법 1	여기까지
//		

		setSize(800, 600);
		setLocation(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		MyWin7 mw6 = new MyWin7();
	}

}

// 클래스의 목적은 재사용 -> 한번만 쓰고 말거라면 굳이 필요 없음 => 이름도 필요없는 1회용 클래스(익명 이너 클래스)를 만들면 좋을 듯 
// -> WindowAdapter t = new WindowAdapter(){ }; -> 클래스명이 없는 익명 이너 클래스 1회용으로 사용
class Test extends WindowAdapter { // 가상의 Test class(핸들러 역할) 를 생성해서 WindowAdapter을 상속받게 해 (부모-자식관계)
	@Override
	public void windowClosing(WindowEvent e) { // 그래서 모든 메서드 override 하지말고 선택적으로 method 가져와
		System.exit(0);
	}
}
