package day12;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// YES 버튼을 클릭하면 콘솔에 Hello World를 출력

public class MyWin4 extends Frame {
	Button btn1, btn2;
	// btn1 : yes, btn2: no

	MyWin4(String title) {
		super(title);

		// 컴포넌트 초기화
		btn1 = new Button("yes");
		btn2 = new Button("no");

		// 컴포넌트를 컨테이너에 부착
		// frame은 기본 배치관리자 : BorderLayout
		// FlowLayout : 순차적으로 배치해 줌
		FlowLayout fl = new FlowLayout();
//		setLayout(fl); // 배치관리자 변경시켜주는 명령어
		// 기본적으로 배치관리자에는 정해진 위치가 존재함 -> 내 맘대로 배치하고 싶다면 setLayout(null);
		setLayout(null); // 내가 직접 정의 -> 위치가 고정되어 창의 크기가 조절됨에 따른 버튼의 위치가 움직이지 않음

		// yes 버튼 사이즈와 위치 설정
		btn1.setSize(100, 100);
		btn1.setLocation(200, 250); // 창을 기준으로 한 위치(좌표)

		// no 버튼 사이즈와 위치 설정
		btn2.setSize(100, 100);
		btn2.setLocation(500, 250); // 창을 기준으로 한 위치(좌표)

		add(btn1); // add한 순서대로 FlowLayout이 순차적으로 배치해줌
		add(btn2);

		// 감지기 부착
		Handler2 hd = new Handler2(); // Handler hd = new Handler(); MyMain3의 핸들러를 불러오게 됨
		btn1.addActionListener(hd);
		btn2.addActionListener(hd); // Yes를 누르든 No를 누르든 Hello World가 출력됨

		setSize(800, 600);
		setLocation(800, 300);
		setVisible(true);

	}

	public static void main(String[] args) {
		MyWin4 mw4 = new MyWin4("YES or NO");

	}
} // end of class

class Handler2 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("e : " + e);
		String cmd = e.getActionCommand();
		if (cmd.equals("yes")) {
			System.out.println("YES 버튼 눌림");
		} else if (cmd.equals("no")) {
			System.out.println("NO 버튼 눌림");
		}
//		System.out.println("cmd : " + cmd);
//		System.out.println("Hello World");
	}

}
