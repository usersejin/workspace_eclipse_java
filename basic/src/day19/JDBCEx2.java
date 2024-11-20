package day19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// 사원의 급여가 1500 이상인 사원의 사번, 이름 급여 이클립스 콘솔에 출력
public class JDBCEx2 {
	public static void main(String[] args) {

		// 1. 변수선언
		String driver = "oracle.jdbc.driver.OracleDriver";
		String ulr = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		StringBuffer sb = new StringBuffer();

		// 2. 드라이버 로딩
		try {
			Class.forName(driver);
			// 3. 연결 (Connection)
			conn = DriverManager.getConnection(ulr, user, password);

			// 4. SQL 문 작성
			sb.append("SELECT EMPNO, ENAME, SAL ");
			sb.append("FROM EMP ");
			sb.append("WHERE JOB = 'MANAGER' ");

			// 5. 문장 객체 생성
			pstmt = conn.prepareStatement(sb.toString());

			// 6. 실행 (select ===> Re)
			rs = pstmt.executeQuery();

			// 7. 레코드별 로직 처리
			while (rs.next()) { // next() 가 false가 될 때까지 (칼럼의 끝을 만날 때 까지) 반복
				int empno = rs.getInt(1);
				String ename = rs.getString(2);
				int sal = rs.getInt(3);
				System.out.println(empno + " : " + ename + " : " + sal);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 8. 자원 반납
			try {
				if (rs != null)
					rs.close();
				else if (pstmt != null)
					pstmt.close();
				else if (conn != null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
