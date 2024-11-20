package day12;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWin6 extends Frame implements WindowListener {
	// 이벤트 소스 : 윈도우창(MyWin6 클래스 그 자체)
	// XXX 리스너 : XXX => 감지할 대상
	MyWin6() {

		this.addWindowListener(this); // add + 인터페이스명(WindowListener) (this) -> 나 자신

		setSize(800, 600);
		setLocation(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		MyWin6 mw6 = new MyWin6();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("창이 열릴 때 호출");

	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("창이 종료중일 때");
		System.exit(0);

	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("창이 종료된 후에 호출");

	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("창이 아이콘화 되었을 때 호출"); // 아이콘화 : 작업표시줄로 가게하는 _ <=이거

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("창이 비아이콘화 되었을 때 호출");

	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("창이 활성화 되었을 때 호출");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("창이 비활성화되었을 때 호출");
	}

}
