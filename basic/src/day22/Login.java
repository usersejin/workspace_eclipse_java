package day22;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import day15.MemoJJang;

public class Login extends JFrame implements ActionListener {

	JButton btnLogin, btnRegister;
	JLabel lbId, lbPw;
	JTextField tfId, tfPw;
	JOptionPane jop;

	Login() {
		// super();
		setTitle("로그인");

		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		// 배치관리자 사용하지 않음
		setLayout(null);

		// 컴포넌트 초기화
		btnLogin = new JButton("LOGIN");
		btnRegister = new JButton("RESISTER");
		lbId = new JLabel("ID");
		lbPw = new JLabel("PW");
		tfId = new JTextField();
		tfPw = new JTextField();

		// 컴포넌트의 크기와 위치를 지정
		btnLogin.setBounds(50, 170, 90, 40);
		btnRegister.setBounds(160, 170, 90, 40);

		lbId.setBounds(50, 50, 100, 40);
		lbPw.setBounds(50, 100, 100, 50);

		tfId.setBounds(100, 50, 150, 40);
		tfPw.setBounds(100, 100, 150, 40);

		// 이벤트 처리
		btnLogin.addActionListener(this);
		btnRegister.addActionListener(this);

		// 컴포넌트를 컨테이너에 부착
		add(btnLogin);
		add(btnRegister);
		add(lbId);
		add(lbPw);
		add(tfId);
		add(tfPw);

		setSize(320, 300);
		setLocation(400, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();

		// 1. 변수 선언
		String driver = "oracle.jdbc.driver.OracleDriver";
		String ulr = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		StringBuffer sb = new StringBuffer();
		Statement stmt = null;

		if (obj == btnLogin) {
			System.out.println("로그인버튼 눌림");
			// 사용자가 입력한 ID와 PW 가져오기 -> 콘솔에 출력
			String id = tfId.getText().trim(); // 사용자가 입력한 공백 제거

			String pw = tfPw.getText().trim();

			try {
				// 2. 드라이버 로딩
				Class.forName(driver);
				// 3. 연결
				conn = DriverManager.getConnection(ulr, user, password);
				// 4. SQL 문 작성
				sb.append("SELECT ID, PW, NAME, AGE FROM MEMBER WHERE ID = ? and pw = ?");
				// 5. 문장 객체 생성
				pstmt = conn.prepareStatement(sb.toString());
				pstmt.setString(1, id);
				pstmt.setString(2, pw);
				// 6. 실행
				rs = pstmt.executeQuery();
				// 7. 레코드별 로직 처리
				boolean result = rs.next();
				if (result == true) {
					System.out.println("로그인 성공");
					// 로그인 성공하면 메모장 실행하고
					StudentManage sm = new StudentManage(); // 생성자로 현재 로그인창의 참조값 전달

				} else {
					System.out.println("로그인 실패");
					JOptionPane.showConfirmDialog(btnLogin, "회원정보가 존재하지 않습니다.");
				}
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (SQLException e1) {
				e1.printStackTrace();
			} finally {
				// 8. 자원 반납
				try {
					if (rs != null)
						rs.close();
					else if (pstmt != null)
						pstmt.close();
					else if (conn != null)
						conn.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}

			}
		} else if (obj == btnRegister) {

			Register rg = new Register(this); // 생성자로 현재 로그인창의 참조값 전달
			// 현재 화면은 보이지 않게 설정 -> 로그인 성공하면 등록창이 실행되고 로그인 창은 보이지 않게 됨
			this.setVisible(false);

			// 로그인 창을 보이게 설정

		}

	}

	public static void main(String[] args) {
		new Login();
	}

}
