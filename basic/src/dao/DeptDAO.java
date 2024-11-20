package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.DeptVO;

public class DeptDAO {
	// DAO의 기능
	// 1. 전체조회, 1건 조회, 추가, 변경, 삭제, 자원 반납 => CRUD 라고 함
	// CRUD : Create Read Update Delete
	
	// 1. 변수 선언
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "scott";
	String password = "tiger";
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	StringBuffer sb = new StringBuffer();

	// 생성자에 구현
	public DeptDAO() {
		try {
			// 2. 드라이버에 로딩
			Class.forName(driver);
			// 3. 연결
			conn = DriverManager.getConnection(url, user, password);
//			System.out.println("conn : " + conn);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB 연결 실패");
			e.printStackTrace();
		}
	}

// DEPT 테이블의 모든 데이터 가져오기 : selectAll()
	public ArrayList<DeptVO> selectAll() {
		// ArrayList 에 담기: 리턴 갯수만큼 받게 됨
		// DeptVO 전용 ArrayList
		ArrayList<DeptVO> list = new ArrayList<DeptVO>();
		// 4. SQL 문 작성
		sb.setLength(0); // StringBuffer 을 초기화해줘야지 sql 문의 명령어가 새롭게 초기화 됨
		sb.append("SELECT DEPTNO, DNAME, LOC FROM DEPT");
		System.out.println("SQL 문 : " + sb.toString());
		try {
			// 5. 문장 객체 생성
			pstmt = conn.prepareStatement(sb.toString());
			// 6. 실행
			rs = pstmt.executeQuery();
			// 7. 레코드별 로직처리
			while (rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				DeptVO vo = new DeptVO(deptno, dname, loc);
				// ArrayList 객체 생성하면
				list.add(vo); // 로 나타낼 수 있음
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list; // list로(ArrayList) 리턴값을 갖음

	}

// DEPT 테이블의 데이터 하나 가져오기 : selectOne(10)
	// 결과 한 행씩 가져와야 해
	public DeptVO selectOne(int deptno) {

		// 하나의 값으로 리턴해야 하는데
		// 부서번호, 부서명, 부서위치 세개의 정보를 갖고 있어서 객체로 리턴하게 해야해
		// 그 객체가 vo: vo 만들기 // 리턴타입이 DeptVO 가 됨

		// 4. SQL 문 작성
		sb.setLength(0); // StringBuffer 을 초기화해줘야지 sql 문의 명령어가 새롭게 초기화 됨
		sb.append("SELECT DEPTNO, DNAME, LOC " + "FROM DEPT " + "WHERE DEPTNO = ?");

		DeptVO vo = null; 
		try {
			// 5. 문장객체 생성
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, deptno);
			// 6. 실행
			rs = pstmt.executeQuery();
			// 7. 레코드별 로직 처리
			while (rs.next()) {
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
//				System.out.println(deptno + " : " + dname + " : " + loc);
				vo = new DeptVO(deptno, dname, loc); 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return vo; 
	}

	// 추가
	public void insertOne(DeptVO vo) {
		// 4. SQL 문 작성
		sb.setLength(0);
		sb.append("INSERT INTO DEPT VALUES (DEPT_DEPTNO.NEXTVAL, ?, ? )");

		try {
			// 5. 문장 객체
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getDname());
			pstmt.setString(2, vo.getLoc());
			// 6. 실행
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 변경
	public void updateOne(DeptVO vo) {
		sb.setLength(0);
		sb.append("UPDATE DEPT SET DNAME = ?, LOC = ? WHERE DEPTNO = ? ");

		try {
			// 5. 문장객체
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getDname());
			pstmt.setString(2, vo.getLoc());
			pstmt.setInt(3, vo.getDeptno());

			// 6. 실행
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 삭제
	public void deleteOne(int deptno) {
		sb.setLength(0);
		sb.append("DELETE FROM DEPT WHERE DEPTNO = ? ");

		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, deptno);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// 8. 자원반납 close 메서드로 
	public void close(){
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
