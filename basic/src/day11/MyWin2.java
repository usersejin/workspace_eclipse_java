package day11;

import java.awt.Button;
import java.awt.Frame;

public class MyWin2 extends Frame {

	Button btn;

	MyWin2() {
		// 생성자에서 멤버면수의 초기화를 해줘야 함
		btn = new Button("종료할래"); // 버튼 기본생성자

		setTitle("내가 만든 창");
		setSize(800, 600);
		setLocation(700, 300);
		// 창에 버튼 부착
		add(btn);

		setVisible(true);

	}

}
