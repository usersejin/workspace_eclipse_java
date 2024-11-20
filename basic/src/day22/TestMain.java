package day22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestMain {
	public static void main(String[] args) {

		// 1. 변수 선언
		String driver = "com.mysql.cj.jdbc.Driver";
//		String url = "jdbc:mysql://주소(아마존 db1의 엔드포인트):포트번호(mysql 포트번호)/xe";
		String url = "jdbc:mysql://db1.c5ouo6mk87wq.ap-northeast-2.rds.amazonaws.com:3306/xe";
		String user = "myadmin";
		String password = "tigerlion$$";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StringBuffer sb = new StringBuffer();

		try {
			// 2. 드라이버 로딩
			Class.forName(driver);
			// 3. 연결
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("conn : " + conn);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB 연결 실패");
			e.printStackTrace();
		}

		// 4. sql문 작성
		sb.setLength(0);
		sb.append("SELECT * FROM DEPT ");
		try {
			// 5. 문장 객체 생성
			pstmt = conn.prepareStatement(sb.toString());

			// 6. 실행
			rs = pstmt.executeQuery();

			// 7. 레코드별 로직 처리
			while (rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				System.out.println(deptno + " : " + dname + "\t: " + loc);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			// 8. 자원반납
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}


	}

}
