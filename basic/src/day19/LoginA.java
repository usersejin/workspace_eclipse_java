package day19;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
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

public class LoginA extends Frame implements ActionListener {

	Button btnLogin, btnExit;
	Label lbId, lbPw;
	TextField tfId, tfPw;

	LoginA() {
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
		btnLogin = new Button("LOGIN");
		btnExit = new Button("EXIT");
		lbId = new Label("ID");
		lbPw = new Label("PW");
		tfId = new TextField();
		tfPw = new TextField();

		// 컴포넌트의 크기와 위치를 지정
		btnLogin.setBounds(200, 370, 150, 100); // setSize(150, 100), setLocation(200, 370)
		btnExit.setBounds(500, 370, 150, 100);

		lbId.setBounds(150, 80, 200, 70);
//		lbId.setBackground(Color.gray); 
		lbPw.setBounds(150, 200, 200, 70);
//		lbPw.setBackground(Color.gray);

		tfId.setBounds(400, 80, 200, 70);
		tfPw.setBounds(400, 200, 200, 70);
//		tfPw.setEchoChar('*'); // 비밀번호 입력시 *로 숨겨줌
		// 이벤트 처리

		// 이벤트 소스: btnExit, btnLogin
		// 감지기 추가: ActionListener
		// 핸들러 정의: 현재 클래스에서 ActionListener 인터페이스 구현하면 내 객체가 핸들러 객체
		btnLogin.addActionListener(this);
		btnExit.addActionListener(this);

		// 컴포넌트를 컨테이너에 부착
		add(btnLogin);
		add(btnExit);
		add(lbId);
		add(lbPw);
		add(tfId);
		add(tfPw);

		setSize(800, 600);
		setLocation(300, 300);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// e.getSource(); // 어떤 대상이냐 obj로 구분
		Object obj = e.getSource();
		if (obj == btnLogin) {
			System.out.println("로그인버튼 눌림");
			// 사용자가 입력한 ID와 PW 가져오기 -> 콘솔에 출력
			String id = tfId.getText().trim(); // 사용자가 입력한 공백 제거

			String pw = tfPw.getText().trim();

//			System.out.println("입력한 값은 ID : " + id + ", PW : " + pw);

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

			try {
				// 2. 드라이버 로딩
				Class.forName(driver);
				// 3. 연결
				conn = DriverManager.getConnection(ulr, user, password);
				// 4. SQL 문 작성
				sb.append("SELECT ID, PW, NAME, AGE FROM MEMBER WHERE ID = ? and pw = ?"); // ? : 바인드(BIND) 변수
				// 5. 문장 객체 생성
//				stmt = conn.createStatement();
				pstmt = conn.prepareStatement(sb.toString());
				pstmt.setString(1, id); // 바인딩
				pstmt.setString(2, pw); // 바인딩
				// 6. 실행
//				rs = stmt.executeQuery(sb.toString());
				rs = pstmt.executeQuery();
				// 7. 레코드별 로직 처리
				boolean result = rs.next();
				if (result == true) {
					System.out.println("로그인 성공");
				} else {
					System.out.println("로그인 실패");
				}
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
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
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		} else if (obj == btnExit) {
			System.out.println("종료합니다.");
			System.exit(0);
		}

	}

	public static void main(String[] args) {
		LoginA li = new LoginA();
	}

}
