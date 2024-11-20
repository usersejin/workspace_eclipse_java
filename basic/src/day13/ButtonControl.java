package day13;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonControl extends Frame implements KeyListener {
	// 멤버변수, 멤버 필드 --> 전역변수
	Button btn;

	ButtonControl() {
		setLayout(null);
		// 컴포넌트 초기화
		btn = new Button("^^"); // Button btn = new Button("^^"); 여기서 자료형인 Button을 또 쓰면 지역변수가 됨
								// 위의 Button과 다른 자료형, 따라서 10번 라인의 Button은 null이 출력

		// event source : btn
		// btn에 키감지기 부착
		btn.addKeyListener(this);

		// 컴포넌트의 크기와 위치
		btn.setBounds(150, 250, 60, 60);

		add(btn);

		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("종료합니다.");
				System.exit(0);
			}
		});

		setBounds(100, 100, 800, 600);
		setVisible(true);
	} // out of constructor

	public static void main(String[] args) {
		ButtonControl bc = new ButtonControl();
		System.out.println(bc.btn);

	} // out of main

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override // e -> event 객체의 참조변수
	public void keyPressed(KeyEvent e) {
//		System.out.println(e);
//		System.out.println("키가 눌릴 때 호출");
		int code = e.getKeyCode(); // 눌린 키의 아스키 코드값을 리턴 받음
		System.out.println(code);

		int x = btn.getX();
		int y = btn.getY();

		if (code == 37 || code == 65) { // 왼쪽 방향 화살표키
//			System.out.println("버튼의 좌표 (" + x + ", " + y + ")");
			x -= 3;
		} else if (code == 38 || code == 87) {
			y -= 3;
		} else if (code == 39 || code == 68) {
			x += 3;
		} else if (code == 40 || code == 83) {
			y += 3;
		} else if (code == 32) { // 스페이스바 점프
			for (int i = 1; i <= 30; i++) { // 위로 올라가
				y -= 3; // 스페이스바 한번 누를때마다 -3이 30번 수행
				btn.setLocation(x, y);

				try {
					Thread.sleep(10); // 0.01초마다 한번씩 자 -> 이거에 따라서 빠르게/느리게 움직이게하는거 가능해
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			for (int i = 1; i <= 30; i++) { // 아래로 내려와
				y += 3;
				btn.setLocation(x, y);

				try {
					Thread.sleep(10); // 0.01초마다 한번씩 자
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		} else if (code == 27) {
			System.exit(0);
		}
		btn.setLocation(x, y);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("키에서 손을 땔 때 호출");

	}
}
