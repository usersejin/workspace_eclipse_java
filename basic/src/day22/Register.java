package day22;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

public class Register extends JFrame implements ActionListener {

	JButton jbtn;
	JLabel jlid, jlpw, jlname, jlage;
	JTextField jtfid, jtfpw, jtfname, jtfage;
	Login in;

	public Register() {
		setLayout(null);

		// 등록 버튼
		jbtn = new JButton("등록");
		jbtn.setBounds(50, 250, 180, 40);
		add(jbtn);
		jbtn.addActionListener(this);

		// id 라벨과 tf
		jlid = new JLabel("id");
		jtfid = new JTextField();
		jlid.setBounds(50, 50, 50, 40);
		jtfid.setBounds(130, 50, 100, 40);
		add(jlid);
		add(jtfid);

		// pw 라벨과 tf
		jlpw = new JLabel("pw");
		jtfpw = new JTextField();
		jlpw.setBounds(50, 100, 50, 40);
		jtfpw.setBounds(130, 100, 100, 40);
		add(jlpw);
		add(jtfpw);
		// name 라벨과 tf
		jlname = new JLabel("name");
		jtfname = new JTextField();
		jlname.setBounds(50, 150, 50, 40);
		jtfname.setBounds(130, 150, 100, 40);
		add(jlname);
		add(jtfname);

		// age 라벨과 tf
		jlage = new JLabel("age");
		jtfage = new JTextField();
		jlage.setBounds(50, 200, 50, 40);
		jtfage.setBounds(130, 200, 100, 40);
		add(jlage);
		add(jtfage);
		setBounds(400, 400, 300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public Register(Login in) {
		this();
		this.in = in;

	}

	public static void main(String[] args) {
		new Register();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// 1. 변수 선언
		String driver = "oracle.jdbc.driver.OracleDriver";
		String ulr = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		StringBuffer sb = new StringBuffer();

		try {
			// 2. 드라이버 로딩
			Class.forName(driver);
			// 3. 연결
			conn = DriverManager.getConnection(ulr, user, password);
			// 4. SQL 문 작성
			sb.setLength(0);
			sb.append("INSERT INTO MEMBER VALUES(?, ?, ?, ?, MEMBER_MEMNO.NEXTVAL)");
			// 5. 문장 객체 생성
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, jtfid.getText());
			pstmt.setString(2, jtfpw.getText());
			pstmt.setString(3, jtfname.getText());
			pstmt.setString(4, jtfage.getText());

			// 6. 실행
			pstmt.executeUpdate();

		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		JOptionPane.showConfirmDialog(jbtn, "회원가입이 완료되었습니다.");

		this.setVisible(false);
		in.setVisible(true);

	}

}
