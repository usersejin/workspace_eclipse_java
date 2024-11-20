package day15;

// 메모장 만들기
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import day22.Login;

public class MemoJJang extends JFrame implements ActionListener {

	JTextArea jta;
	JScrollPane jsp;
	JMenuBar jmb; // 메뉴 아이템은 메뉴에 붙이고 메뉴는 메뉴바에 붙이고 메뉴바는 화면에 붙여야해 순서 중요!
	JMenu jmFile, jmHelp;
	JMenuItem jmiNew, jmiOpen, jmiSave, jmiExit, jmiHelp;
	Login in; // day 22의

	public MemoJJang() {

		// 초기화
		jta = new JTextArea();
		jsp = new JScrollPane(jta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jmiNew = new JMenuItem("NEW");
		jmiOpen = new JMenuItem("OPEN");
		jmiSave = new JMenuItem("SAVE");
		jmiExit = new JMenuItem("EXIT");
		jmiHelp = new JMenuItem("HELP");

		jmFile = new JMenu("FILE");
		jmHelp = new JMenu("HELP");

		jmb = new JMenuBar();

		Font f = new Font("휴먼아미체", Font.PLAIN, 30); // 폰트 모음 C:\Windows\Fonts // plain 은 보통 글씨체
		jta.setFont(f);
		// add(jta); // 얘는 jsp = new JScrollPane(jta, .. ) 에 넣었으면 안 넣어도 돼
		add(jsp); // jsp를 넣어줘야 해

		// 메뉴에 메뉴 아이템을 부착
		// 메뉴 아이템은 메뉴에 붙이고 메뉴는 메뉴바에 붙이고 메뉴바는 화면에 붙여야해 순서 중요!
		jmFile.add(jmiNew);
		jmFile.add(jmiOpen);
		jmFile.add(jmiSave);
		jmFile.addSeparator(); // 메뉴 사이를 구분해주는 구분선
		jmFile.add(jmiExit);

		jmHelp.add(jmiHelp);

		jmb.add(jmFile);
		jmb.add(jmHelp);

		// 메뉴를 현재 창에 부착
		setJMenuBar(jmb);

		// 이벤트 처리
		// 메뉴아이템을 클릭하면 이벤트 동작할 수 있도록..

		jmiNew.addActionListener(this);
		jmiOpen.addActionListener(this);
		jmiSave.addActionListener(this);
		jmiExit.addActionListener(this);
		jmiHelp.addActionListener(this);

		// 현재 창 설정
		setTitle("제목 없음  - Windows 메모장");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		setVisible(true);
	}

	public MemoJJang(Login in) {
		this();
		this.in = in;

	}

	public static void main(String[] args) {
		MemoJJang memo = new MemoJJang();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == jmiNew) {
//			System.out.println("새로 만들기");

			// 기존에 남아있던 글자를 지우기 -> 그냥 이게 새 창인가봐...
//			jta.setText(""); // 이거 여기있으면 그냥 리셋인거임... -> 밑에 기존에 남아있던 글자가 있다면~ 이 안되는거

			// 기존에 남아있던 글자가 있으면 저장할 것인지 묻는 창을 띄우자
			String data = jta.getText(); // JTextArea 에 있는 글자를 받아
			if (data.length() > 0) { // data.length() > 0 = 글자가 있다면
				int result = JOptionPane.showConfirmDialog(this, "변경 내용을 제목 없음에 저장하시겠습니까?", "메모장",
						JOptionPane.YES_NO_CANCEL_OPTION);
				System.out.println("result : " + result);

				if (result == JOptionPane.YES_OPTION) {
					// 저장 .. -> 아직 안 배움
					System.out.println("저장되었음");
					jta.setText("");
				} else if (result == JOptionPane.NO_OPTION) {
					jta.setText("");
				}
			}

		} else if (obj == jmiOpen) {
//			System.out.println("열기");

			JFileChooser jfc = new JFileChooser(); // 파일을 선택하는 애 (그냥 갖다 씀)
			int result = jfc.showOpenDialog(this);
			System.out.println("result : " + result); // 열기는 result : 0, 취소는 result : 1

			if (result == JFileChooser.APPROVE_OPTION) { // 파일의 승인 옵션을 선택했다면~ -> if(result == 0) 대신에 사용 가독성을 높이기 위해
				File f = jfc.getSelectedFile();
				System.out.println("파일의 절대 경로 : " + f.getAbsolutePath()); // 나중에 할 때 이걸 이용하나봐
				// 열기버튼을 눌렀다면 파일을 읽어오기 -> jta에 붙이기를 해줘야 해 -> but 이 부분은 IO를 배워야지 할 수 있음
			}

		} else if (obj == jmiSave) {
			System.out.println("저장");
			JFileChooser jfc = new JFileChooser();
			int result = jfc.showSaveDialog(this);
			System.out.println("result : " + result);

			if (result == JFileChooser.APPROVE_OPTION) {
				File f = jfc.getSelectedFile();
				System.out.println("파일의 절대 경로 : " + f.getAbsolutePath());
				// 저장버튼을 눌렀다면 파일을 jta에 있는 내용을 저장 -> 이것도 IO 배우고 나서
			}

		} else if (obj == jmiExit) {
			System.out.println("종료");
//			System.exit(0);

			// 현재창 안보이게
			this.setVisible(false);
			in.setVisible(true);

		} else if (obj == jmiHelp) {
			// System.out.println("도움말");
			// 도움말을 클릭하면 다른 창을 불러서 실행
			Chatting ct = new Chatting();

		}

	}

}
