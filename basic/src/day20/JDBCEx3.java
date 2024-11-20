package day20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCEx3 {
	public static void main(String[] args) {

		// 1. 변수 선언
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
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
			// 4. SQL 문 작성
			sb.append("INSERT INTO DEPT VALUES(DEPT_DEPTNO.NEXTVAL, ?, ?)");
			// 5. 문장객체 생성
			pstmt = conn.prepareStatement(sb.toString());
			// 6. 실행
			// pstmt.executeQuery(); 은 select 문만
			// pstmt.executeUpdate(); 은 그 외 나머지 실행시킬 때
			pstmt.setString(1, "영업");
			pstmt.setString(2, "서울");
			int result = pstmt.executeUpdate();
			System.out.println("result : " + result);
			// 7. 레코드별 로직 처리

			// 8. 자원 반납
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
