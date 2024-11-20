package day24;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LamdaEx extends JFrame {
	JButton jbtn;

	LamdaEx() {
		setLayout(null);
		jbtn = new JButton("클릭");
		jbtn.setBounds(300, 350, 100, 100);
		add(jbtn);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		setVisible(true);

//		jbtn.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("버튼 눌림");
//			}
//		});

		ActionListener al = e -> {
			System.out.println("버튼 눌림");
		};
		
		jbtn.addActionListener(al);
	

	
	}

	public static void main(String[] args) {
		new LamdaEx();
	}

}
