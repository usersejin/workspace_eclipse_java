package day15;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

// JFrame으로 채팅창 만들기

public class Chatting extends JFrame implements ActionListener, KeyListener {

	JPanel jp;
	JButton jbtn;
	JTextField jtf;
	JTextArea jta;
	JScrollPane jsp; // 스크롤 넣기
	String[] msg = { "밥 먹었어", "졸리지..", "집 가자", "멍멍멍멍", "냥냥냥냥", "ㅎㅎ" };
	Random rnd = new Random();

	Chatting() {

		// 글꼴과 크기 설정
		Font f = new Font("고딕", Font.BOLD, 20);

		jp = new JPanel(); // 컨테이너 (다른 컴포넌트 부착 가능)
		jtf = new JTextField(15); // 15글자 입력되는 크기로 설정
		jbtn = new JButton("SEND");
		jta = new JTextArea();
//		jsp = new JScrollPane(중앙에 배치할 컴포넌트, 수직 스크롤바 형태, 수평 스크롤바 형태); // needed 필요하면 스크롤바 생겨
		jsp = new JScrollPane(jta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		jta.setFont(f);
		jtf.setFont(f);

		// 패널에 버튼을 붙이기
		jp.add(jtf); // JPanel의 기본 배치관리자는 Flowlayout 차례대로 붙음 -> 순서 중요
		jp.add(jbtn);

		// 이벤트 처리
		// SEND 버튼 누르면 현재 JTextField의 값을 갖고와서 JTextArea에 붙이기

		jbtn.addActionListener(this);
		jtf.addKeyListener(this);

		// JTextField 에서 엔터를 누르면 현재 JTextField 의 값을 가지고 와서 JTextArea 붙이기

		// 프레임의 중앙에 부착
		add(jsp, "Center");

		// 패널을 화면에 붙이기
		add(jp, "South"); // 화면창의 Borderlayout 의 위치에 따라 패널이 붙음

		// 창 타이틀
		setTitle("채팅 version 0.001");
		// 창 종료
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 창의 위치, 크기
		setBounds(100, 100, 400, 600);
		// 화면에 보이게 설정
		setVisible(true);

		// 키보드 입력을 편하게 하기 위해
		jtf.requestFocus(true);

		// 심심이 대화
		jta.append("심심이: 안녕 반가워~ \n");

	}

	public static void main(String[] args) {
		Chatting ch = new Chatting();

	}

	@Override
	public void actionPerformed(ActionEvent e) { // send 버튼 클릭하면
		sendData();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) { // enter 버튼 누르면
		// 엔터키가 눌렸는지 판단
		int code = e.getKeyCode();
		if (code == KeyEvent.VK_ENTER) {
			sendData();
		}

	}

	private void sendData() { // 메서드 리팩토링 함 (alt + shift + m)
		String data = jtf.getText(); // 텍스트 가져오기
		// jta.setText(data); // 이걸로 하면 기존에 있던 글자위에 덮어쓰게 돼
		jta.append("me : " + data + "\n"); // 이걸로 해야지 뒤에 붙어서 이어져
		jtf.setText(""); // send 보내고 textfield 칸 지우기

		// 심심이가 문자열 배열 중 한개를 랜덤하게 골라서 jta에 append
		// msg.lngth // 배열의 길이
		// rnd.nextInt(6); // 0~5까지의 값을 랜덤하게 뽑기

		int idx = rnd.nextInt(msg.length);
		String m = msg[idx]; // 심심이의 랜덤 대화 선택

		// jta 출력
		try { // 심심이가 생각하는 거처럼 약간 지연됐다가 말하도록 함
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		jta.append("심심이 : " + m + "\n");
		jtf.requestFocus(true);// 이거 하면 send 버튼 클릭 후 textfeild 클릭안하고 바로 텍스트 칠 수 있어
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
