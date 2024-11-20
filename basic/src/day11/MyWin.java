package day11;

import java.awt.Button;
import java.awt.Frame;

public class MyWin extends Frame {

	Button btn;

	MyWin() {
		// 생성자에서 멤버면수의 초기화를 해줘야 함
		btn = new Button("중앙"); // 버튼 기본생성자

		setTitle("샘플 윈도우");
		setSize(300, 300);
		setLocation(150, 150);
		// 창에 버튼 부착
		add(btn);

		setVisible(true);

	}

}
