package day11;

import java.awt.Frame;

public class TestMain05 {
	public static void main(String[] args) {

		// Frame 객체 생성
		Frame f = new Frame();
		f.setSize(1000, 600); // 창의 크기(넓이) 설정 (가로, 세로)

		f.setLocation(700, 300); // 화면에 띄울 창의 위치를 결정 (가로, 세로)

		f.setVisible(true); // 화면에 보이게 만들어줘
	}
}
