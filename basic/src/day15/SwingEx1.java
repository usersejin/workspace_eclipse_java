package day15;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

// AWT ==> SWING (JXXXX) => Swing 컴포넌트 ==> XML로도 나중ㅇㅔ...

public class SwingEx1 extends JFrame {

	JButton btn;

	SwingEx1() {
//		super();

		// ImageIcon Icon 인터페이스를 구현한 클래스
		// src에 images 패키지 생성 후 바탕화면에 저장한 이미지 drag and drop
		ImageIcon img1 = new ImageIcon("src/images/loopy.png"); // 그 이미지가 있는 경로 (확장자 jpg, png..)

		btn = new JButton(img1);

		add(btn);

		setDefaultCloseOperation(EXIT_ON_CLOSE); // close 버튼을 누를 때 어떻게 작동할래? (상수가 들어감)
		setVisible(true);
		setBounds(100, 100, 800, 600);

	}

	public static void main(String[] args) {
		SwingEx1 se1 = new SwingEx1();
	}
}
