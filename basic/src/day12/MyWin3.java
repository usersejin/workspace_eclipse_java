package day12;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

// 일반적으로 하나의 자바파일에는 하나의 클래스(public 클래스)를 두는 것이 원칙 => 예외 존재, 그게 지금 이 클래스임
// MyWin3.java

// 이벤트 처리 순서
// 1. 이벤트 소스 결정 : 버튼 그 자체
// 2. 이벤트 소스에 감지기를 부착 : 어떤걸 감지할 것인지에 따라 XXXListener 설정 (동작 감지기 = ActionListener)
// 3. 이벤트 핸들러 정의 : 처리할 코드를 가지고 있는 객체 : 핸들러

public class MyWin3 extends Frame {
	Button btn;

	MyWin3(String title) {
		// 창 이름 지정하는 방법 3가지
		// 1. setTitle("이벤트 처리"); 사용하기
		// 2. super("이벤트 처리"); 사용하기
		// 3. MyWin3(String title){super(title);...} MyWin3 = new MyWin3("이벤트 처리"); 으로
		// 사용하기

//		setTitle("이벤트 처리");
		super(title); // -> setTitle을 써도 되지만 super를 사용해서도 할 수 있음
		btn = new Button("click");
		add(btn);

		// addXXXListener();
		// addActionListener(ActionListener l){}
		// ActionListener 인터페이스임 즉 인터페이스를 구현한 객체를 매개변수로 갖는다.
		Handler hd = new Handler(); 
		btn.addActionListener(hd); // ()안에 인터페이스를 구현한 객체의 매개변수인 핸들러가 오면 된다, 액션을 감지하면 hd를 불러서 처리해줘라는 의미

		setSize(300, 300);
		setLocation(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		MyWin3 mw3 = new MyWin3("이벤트 처리용 2");
	} // end of main method
} // end of class

class Handler implements ActionListener {// default class 가 아니므로 public은 안됨

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("흠"); // 버튼을 클릭할 때마다 자동으로 호출 됨

		MyWin mw = new MyWin(); // 클릭할 때마다 MyWin에 있는 창이 뜬다

		System.exit(0); // 0 정상 종료
	}

}
