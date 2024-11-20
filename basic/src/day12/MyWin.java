package day12;

import java.awt.Button;
import java.awt.Frame;

// 윈도우 창 <== 다양한 기능 추가
// 내가 만든 클래스가 윈도우창 기능을 수행하고 싶다면 
// Frame 은 컨테이너의 후손

public class MyWin extends Frame {
	// Frame 의 멤버변수와 조상의 모든 멤버변수
	Button btn; // button => 컴포넌트
	// 컴포넌트를 어떻게 배치하면 좋을까?
	// 컨테이너마다 전용 배치관리자가 존재
	// Frame의 배치관리자 => BorderLayout 배치관리자
	// 동서남북중앙에 배치를 할 수 있도록 설정(default: 정중앙)
	
	
	MyWin() {
		super(); // super() => Frame 클래스의 기본생성자

		// 멤버변수의 초기화
		btn = new Button("클릭");

		add(btn); // 다른 컴포넌트를 현재 컨테이너(나)에게 담기 => 우리 눈에 보여짐

		setTitle("윈도우 창"); // 창의 이름 설정
		setSize(800, 600); // 창의 크기 설정 (가로, 세로)
		setLocation(800, 300); // 창의 위치(좌표) 설정 (x, y)
		setVisible(true); // 화면에 창이 보이도록 설정

	}

	// Frame 의 메서드와 조상의 모든 메서드

	public static void main(String[] args) {

		MyWin mw = new MyWin();

	}

}
