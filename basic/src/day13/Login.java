package day13;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Login extends Frame implements ActionListener {

	Button btn3, btn4;
	Label lb1, lb2;
	TextField tx1, tx2; // TextField 변수 선언

	Login(String title) {
		super(title);

		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		// Button 객체 생성
		lb1 = new Label("ID");
		lb2 = new Label("PW");
		btn3 = new Button("LOGIN");
		btn4 = new Button("EXIT");
		tx1 = new TextField();
		tx2 = new TextField();

		setLayout(null);

		lb1.setBounds(100, 150, 100, 50); // lb1.setSize(100, 50); , lb1.setLocation(200, 150);
		lb2.setBounds(100, 300, 100, 50);
		btn3.setBounds(100, 400, 100, 50);
		btn4.setBounds(300, 400, 100, 50);
		tx1.setBounds(300, 150, 100, 50);
		tx2.setBounds(300, 300, 100, 50);

		add(lb1);
		add(lb2);
		add(btn3);
		add(btn4);
		add(tx1);
		add(tx2);

		btn4.addActionListener(this);

		setSize(500, 500);
		setLocation(800, 300);
		setVisible(true);

	}

	public static void main(String[] args) {
		Login lg = new Login("로그인");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == btn4) {
			System.exit(0);

		}

	}
}
