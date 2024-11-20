package day13;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// 4. anonymous inner Class
// 이름이 없는 객체

public class MyWin2 extends Frame {

	MyWin2() {
		// 추상클래스든 인터페이스든 instance화 할 수 없음 (new 불가) 해주려면 자식 클래스를 만들고 자식의 참조값을 부모 참조변수에 담아
//		TestAdapter ta = new TestAdapter(); // 얘는 그냥 클래스이므로 new 가능
//		WindowAdapter wa = ta; 

//		WindowAdapter wa = new TestAdapter(); // 위 두 줄을 한줄로 표현 가능

		// 4. 자식 클래스를 만들지 않고 이름이 없는 자손 클래스(익명 이너클래스)를 만들어서 표현도 가능 -> 재사용 불가
//		WindowAdapter wa = new WindowAdapter() { // new WindowAdapter() 만하면 객체 생성이므로 {..} 을 꼭 붙여줘야 해 -> 그래야지
//													// WindowAdapter 객체 생성
//			// 후손 객체 ==> 오버라이드
//			
//		}; // out of WindowListener 객체

		addWindowListener( new WindowAdapter() {
			// 후손객체  ==> 오버라이드
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("종료합니다");
				System.exit(0);
			}
		});    // WindowListener 인터페이스를 구현한 객체

		
		
		setBounds(300, 300, 800, 600);
		setVisible(true);
	}

	public static void main(String[] args) {
		MyWin2 mw = new MyWin2();
	}

}

// 			자식					부모
class TestAdapter extends WindowAdapter {

}
