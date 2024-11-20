package day20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCEx4 {
	public static void main(String[] args) {

		// 1. 변수선언
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		Connection conn = null;
		PreparedStatement pstmt = null;
		StringBuffer sb = new StringBuffer();

		
		try {
			// 2. 드라이버에 로딩
			Class.forName(driver);
			// 3. 연결
			conn = DriverManager.getConnection(url, user, password);
			// 4. SQL 문 작성
			sb.append("UPDATE EMP SET SAL = SAL*1.1 WHERE JOB = 'MANAGER'");			
			
			// 5. 문장객체 생성
			pstmt = conn.prepareStatement(sb.toString());
			int result = pstmt.executeUpdate();
			System.out.println(result);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
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
