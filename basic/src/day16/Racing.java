package day16;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Racing extends JFrame implements ActionListener {

	JButton jbtn1, jbtn2, jbtn3, jbtnStart;
	Horse h1, h2, h3;
	ImageIcon img1, img2;

	Racing() {

		img1 = new ImageIcon("src/images/horse.gif");
		img2 = new ImageIcon("src/images/horsestop.gif");
		jbtn1 = new JButton(img2);
		jbtn2 = new JButton(img2);
		jbtn3 = new JButton(img2);
		jbtnStart = new JButton("START");

		// 위치 지정
		setLayout(null);
		jbtn1.setBounds(50, 150, 120, 60);
		jbtn2.setBounds(50, 250, 120, 60);
		jbtn3.setBounds(50, 350, 120, 60);
		jbtnStart.setBounds(250, 660, 820, 50);

		// 부착
		add(jbtn1);
		add(jbtn2);
		add(jbtn3);
		add(jbtnStart);

		// 이벤트
		jbtnStart.addActionListener(this);

		// 창 설정
		setTitle("경마장");
		setBounds(400, 600, 1200, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {

		Racing r = new Racing();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		// 말 이동(단일 스레드)
//		for (int i = 0; i <= 50; i++) {
//			jbtn1.setLocation(jbtn1.getX() + 10, jbtn1.getY());
//			jbtn2.setLocation(jbtn2.getX() + 10, jbtn2.getY());
//			jbtn3.setLocation(jbtn3.getX() + 10, jbtn3.getY());
//		}
		if (h1 == null) {
			h1 = new Horse(jbtn1, img1, img2);
			h2 = new Horse(jbtn2, img1, img2);
			h3 = new Horse(jbtn3, img1, img2);

			h1.start();
			h2.start();
			h3.start();
		}
	}
}
