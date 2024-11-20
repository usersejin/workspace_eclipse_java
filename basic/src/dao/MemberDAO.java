package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.DeptVO;
import vo.MemberVO;

public class MemberDAO {

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "scott";
	String password = "tiger";
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	StringBuffer sb = new StringBuffer();

	public MemberDAO() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB 연결 실패");
			e.printStackTrace();
		}

	}

	// 한건 조회
	public MemberVO getOne(int memno) {

		sb.setLength(0);
		sb.append("SELECT ID, PW, NAME, AGE FROM MEMBER WHERE MEMNO = ? ");

		MemberVO vo = null;

		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, memno);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				vo = new MemberVO(memno, id, pw, name, age);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return vo;

	}

	// 여러건 조회
	public ArrayList<MemberVO> selectAll() {

		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		sb.setLength(0);
		sb.append("SELECT ID, PW, NAME, AGE, MEMNO FROM MEMBER ");

		try {
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				int memno = rs.getInt("memno");
				MemberVO vo = new MemberVO(memno, name, id, pw, age);
				list.add(vo);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	// 추가
	public void addOne(MemberVO vo) {
		// 4. SQL 문 작성
		sb.setLength(0);
		sb.append("INSERT INTO MEMBER VALUES (?, ?, ?, ?, MEMBER_MEMNO.NEXTVAL )");
//		sb.append("INSERT INTO MEMBER (MEMNO, ID, PW, NAME, AGE) VALUES (MEMBER_MEMNO.NEXTVAL, ?, ?, ?, ?, ?)");
		// values 순서 정해주면 돼
		try {
			// 5. 문장 객체
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPw());
			pstmt.setString(3, vo.getName());
			pstmt.setInt(4, vo.getAge());

			// 6. 실행
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 변경
	public void updateOne(MemberVO vo) {
		sb.setLength(0);
		sb.append("UPDATE MEMBER SET NAME = ?, ID = ?, PW = ?, AGE = ? WHERE MEMNO = ?");

		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getId());
			pstmt.setString(1, vo.getPw());
			pstmt.setInt(1, vo.getAge());
			pstmt.setInt(2, vo.getMemno());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// 삭제
	public void deleteOne(int memno) {
		sb.setLength(0);
		sb.append("DELETE FROM MEMBER WHERE MEMNO = ?");

		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, memno);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void close() {
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
