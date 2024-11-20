package day19;

// jdbc: java.sql 패키지 하위에 있음
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// JDBC(Java Database Connectivity)
// 인터페이스 

// DB 제조사에서 jdbc 기술을 구현해 놓은 클래스의 모음 => jdbc driver

public class JDBCEx1 {
	public static void main(String[] args) {

		// 1. 변수 선언
		String driver = "oracle.jdbc.driver.OracleDriver"; // jar 에서 사용할 클래스 가져오기
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // url(uniform resource locator) : 규격화된 자원의 위치 -> 내가 연결할 서버의
															// 위치
															// jdbc:oracle 에 thin(경량 드라이버)방식으로 연결
															// @접속서버의 아이피(@localhost:내 컴퓨터를 지칭하는 별칭), 1521번 통신포트(통로)를 수신
															// xe(db 이름임)라는 db에 연결
		String user = "scott";
		String password = "tiger";
		Connection conn = null; // 5번에서도 사용할 수 있도록 전역변수로 선언

		// 2. JDBC 드라이버가 로딩되어 있는지 여부 체크 Class.forName(driver);
		try {
			Class.forName(driver);

			// 3. DB 연결 (Connection) DriverManager.getConnection(url, user, password);
			conn = DriverManager.getConnection(url, user, password);

			System.out.println("conn : " + conn);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("DB 연결 실패");
			e.printStackTrace();
		}

		// 4. SQL 문 작성 -> Java 에서 sql 이 실행됨
		String sql = "SELECT * FROM DEPT";
		ResultSet rs = null; // 8번에서도 사용할 수 있도록 전여변수로 선언
		PreparedStatement pstmt = null;

		try {
			// 5. sql을 실행하기 위해서 문장객체 생성해야 함 PreparedStatement pstmt =
			// conn.prepareStatement(sql);
			pstmt = conn.prepareStatement(sql);

			// 6. 실행(select ==> ResultSet : sql문을 실행해서 나온 결과 )
			rs = pstmt.executeQuery(); // 내가 만든 sql문을 db에서 실행해줘
			System.out.println("rs : " + rs);

			// 7. 레코드별 로직 처리 : db row, 프로그램 레코드
			while (rs.next()) { // next() 가 false가 될 때까지 (칼럼의 끝을 만날 때 까지) 반복
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				System.out.println(deptno + " : " + dname + " : " + loc);
			}

//			// 10번 부서
//			rs.next(); // next(); 커서를 다음행으로 이동시키는 메서드
//			// 그냥 변수명을 컬럼명이랑 똑같이 지은것 뿐 (int deptno)
//			int deptno = rs.getInt("deptno");
//			String dname = rs.getString("dname");
//			String loc = rs.getString("loc");
//			System.out.println(deptno + " : " + dname + " : " + loc);
//
//			// 20번 부서
//			rs.next();
//			deptno = rs.getInt("deptno");
//			dname = rs.getString("dname");
//			loc = rs.getString("loc");
//			System.out.println(deptno + " : " + dname + " : " + loc);
//
//			// 30번 부서
//			rs.next();
//			deptno = rs.getInt("deptno");
//			dname = rs.getString("dname");
//			loc = rs.getString("loc");
//			System.out.println(deptno + " : " + dname + " : " + loc);
//
//			// 40번 부서
//			rs.next();
//			deptno = rs.getInt("deptno");
//			dname = rs.getString("dname");
//			loc = rs.getString("loc");
//			System.out.println(deptno + " : " + dname + " : " + loc);


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 8. 자원 반납 (자원을 사용하는 작업 io, network, db 은 사용 후 반납 필수)
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
