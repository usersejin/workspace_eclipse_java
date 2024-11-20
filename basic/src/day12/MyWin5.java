package day12;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Frame : 기본적인 배치관리자 BorderLayout -> 안 쓸거면 setLayout(null)해줘야해
public class MyWin5 extends Frame implements ActionListener {

	Button btn1, btn2;
	Label lb;

	MyWin5(String title) {
		super(title);

		// 컴포넌트 초기화
		btn1 = new Button("RandomColor");
		btn2 = new Button("EXIT");
		lb = new Label("오늘은 무슨 요일일까요?");

		setLayout(null); // 이거 없으면 밑에서 배치 설정해도 배치 이상하게 됨

		// 버튼 사이즈 설정
		btn1.setSize(100, 100);
		btn2.setSize(100, 100);

		// 버튼 위치 설정
		btn1.setLocation(200, 400);
		btn2.setLocation(400, 400);

		lb.setSize(250, 50);
		lb.setLocation(150, 80);

		// 컴포넌트를 컨테이너에 부착 = 버튼 추가 (화면에 나오게 함)
		add(btn1);
		add(btn2);
		add(lb);

		// 2. 감지기 부착 = 버튼 클릭시 수행할 동작 설정
		// 3. 핸들러 정의
//		Handler3 hd = new Handler3();
//		btn1.addActionListener(hd); // 굳이 따로 class Handler3 만들지 말고 MyWin5가 ActionListener를 구현하게끔 하면 돼
		btn1.addActionListener(this);
		btn2.addActionListener(this);

		// 창 크기, 위치, 띄우기 설정
		setSize(800, 600);
		setLocation(300, 300);
		setVisible(true);
	}

	// 창이름 설정
	public static void main(String[] args) {
//		MyWin5 mw5 = new MyWin5("메시지 and 종료버튼"); 
		new MyWin5("메시지 and 종료버튼"); // 으로만해도 돼, 참조하려고 변수 선언하는 건데 안하면 굳이 선언할 필요 없으니까
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		String cmd = e.getActionCommand(); // 버튼의 라벨을 가져와서 cmd 에 저장

		Object obj = e.getSource(); // 여기서부터 시작, 다국어를 지원하기 위해서 글자 그자체를 equals로 비교하는 것이 아닌 obj 와 btn을 비교해서 경우를 나눔
		System.out.println(" obj : " + obj);
		if (obj == btn1) { 
			int red = 0;
			int blue = 0;
			int green = 0;

			red = (int) (Math.random() * 255);
			blue = (int) (Math.random() * 255);
			green = (int) (Math.random() * 255);

			Color randomColor = new Color(red, green, blue); // 여기에 rgb 값을 직접 넣어도 돼

			lb.setBackground(randomColor);
		} else if (obj == btn2) {
			System.exit(0);
		}
//		if (cmd.equals("RandomColor")) {
//			System.out.println("라벨의 배경색을 변경합니다.");
//			int red = 0;
//			int blue = 0;
//			int green = 0;
//
//			red = (int) (Math.random() * 255);
//			blue = (int) (Math.random() * 255);
//			green = (int) (Math.random() * 255);
//
//			Color randomColor = new Color(red, green, blue); // 여기에 rgb 값을 직접 넣어도 돼 
//
//			lb.setBackground(randomColor);
//
////			lb.setBackground(Color.green); // 이런식으로 색을 지정할 수 있음
//
//		} else if (cmd.equals("EXIT")) {
//			System.exit(0);
//		}

	}
}

// 버튼 클릭시 수행할 동작 Handler3 클래스 선언
//class Handler3 implements ActionListener {
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		String cmd = e.getActionCommand();
//		if (cmd.equals("RandomColor")) {
//			System.out.println("RandomColor");
//		} else if (cmd.equals("EXIT")) {
//			System.exit(0);
//		}
//
//	}
//}
