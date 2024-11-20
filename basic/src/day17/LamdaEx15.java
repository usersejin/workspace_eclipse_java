package day17;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LamdaEx15 extends JFrame {

	JButton jbtn;

	LamdaEx15() {

		setLayout(null);

		jbtn = new JButton("^^");
		jbtn.setBounds(250, 250, 100, 100);
		add(jbtn);

		JButton jbtn2 = new JButton("ㅠㅠ"); // 얘는 지역변수라 생성자 벗어나면 사용 못 해
		// var jbtn2 = new JButton("ㅠㅠ"); 동적 타입도 가능해... 런타임시 결정되는 거징
		jbtn2.setBounds(450, 250, 100, 100);
		add(jbtn2);

		// ** 1번
		// ActionListener 인터페이스를 익명 이너 클래스로
//		ActionListener listener = new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("Hello Lamda!");
//				
//			}
//		};
//		jbtn.addActionListener(listener);
		
		// ** 2번 
//		ActionListener listener = (ActionEvent e) -> System.out.println("Hello Lamda!!");
//		jbtn.addActionListener(listener);
		
		// ** 3번 
//		ActionListener listener = e -> System.out.println("Hello Lamda!!");
//		// 액션리스터 인터페이스를 구현한 객체가 들어가는 것
//		jbtn.addActionListener(listener);
		
		// ** 4번
		jbtn.addActionListener(e -> System.out.println("Hello Lamda!!"));

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		setVisible(true);
	}

	public static void main(String[] args) {
		new LamdaEx15();
	}

}
