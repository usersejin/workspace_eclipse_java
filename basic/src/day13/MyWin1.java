package day13;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWin1 extends Frame implements MouseMotionListener {

	Button btnYes, btnNo;
	Label lb;

	MyWin1() {

		setLayout(null);

		btnYes = new Button("YES");
		btnNo = new Button("NO");
		lb = new Label("물음1");

		btnYes.setBounds(100, 200, 50, 50);
		btnNo.setBounds(200, 200, 100, 100);
		lb.setBounds(50, 100, 50, 50);

		add(btnYes);
		add(btnNo);
		add(lb);

		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		this.addMouseMotionListener(this);

		setBounds(800, 600, 1000, 1000);
		setVisible(true);
	} // end of contructor

	public static void main(String[] args) {

		MyWin1 mw1 = new MyWin1();

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int x = e.getX(); // 마우스의 위치 X 좌표 기준 창의 좌측상단이 (0,0)
		int y = e.getY();

		// 이벤트 발생 지점:
		// Yes 버튼의 위치:
		int btnX = btnYes.getX();
		int btnY = btnYes.getY();

//		System.out.println("마우스 움직이는 중 (" + x + ", " + y + ")"); // 마우스가 움직일 때마다 출력됨
//		System.out.println("Yes 버튼 위치 (" + btnX + ", " + btnY + ")"); // 마우스가 움직일 때마다 출력됨

		// 두 점과의 거리: 피타고라스 이용(마우스와 yes 버튼사이의 거리)
		double dis = Math.sqrt(((btnX + 25) - x) * ((btnX + 25) - x) + ((btnY + 25) - y) * ((btnY + 25) - y));

		System.out.println("YES 버튼과의 거리 : " + dis);

		if (dis < 80) {
			// Yes 버튼을 마우스 우측 하단쪽으로 좌표를 변경
//			btnYes.setLocation(x + 100, y - 100);

			// Yes 버튼을 랜덤 위치로 좌표를 변경d

			int bx = (int) (Math.random() * 750);
			int by = (int) (Math.random() * 550);

//			int btnX = (int)(Math.random() * getWidth()-getX()); // 창밖으로 나가지 않게 하기 위함
//			int btnY = (int)(Math.random()* getHeight()-getY());
//			btnYes.setLocation(btnX, btnY); // 이거 세줄이면 if 문 쓸필요 없이 가능

			btnYes.setLocation(bx, by); // 버튼 움직이게 해

		}

	}
}
