package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.StudentVO;

public class StudentDAO {

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "scott";
	String password = "tiger";
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	StringBuffer sb = new StringBuffer();

	public StudentDAO() {
		try {
			// 2 드라이버에 로딩
			Class.forName(driver);
			// 3. 연결
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// 이름 , 학번, 과목 , 성적 (StudentRegister)
	public void StudentRegister(StudentVO vo) {

		// 4. sql문 작성
		sb.setLength(0);
		sb.append("INSERT INTO STUDENTS VALUES(STU_NO_SEQ.NEXTVAL, ?, ?, ?)");

		try {
			// 5. 문장 객체
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getSubject());
			pstmt.setInt(3, vo.getScore());
			// 6. 실행
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// 학번 입력 후 학생 정보 조회 (selectOne)
	public StudentVO selectOne(int no) {
		StudentVO vo = null;
		String name = null;
		String subject = null;
		int score = 0;

		// 4. SQL 문 작성
		sb.setLength(0);
		sb.append("SELECT NO, NAME, SUBJECT, SCORE ");
		sb.append("FROM STUDENTS ");
		sb.append("WHERE NO = ? ");

		// 5. 문장객체
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, no);
			// 6. 실행
			rs = pstmt.executeQuery();
			// 7. 로직
			while (rs.next()) {
				name = rs.getString("name");
				subject = rs.getString("subject");
				score = rs.getInt("score");
				vo = new StudentVO(no, score, name, subject);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return vo;
	}

	// 전체 학생 성적 목록 조회 ( infoAllStudent)
	public ArrayList<StudentVO> infoAllstudent() {
		ArrayList<StudentVO> list = new ArrayList<StudentVO>();
		// 4. sql문 작성
		sb.setLength(0);
		sb.append("SELECT NO, NAME, SUBJECT, SCORE ");
		sb.append("FROM STUDENTS ");

		try {
			// 5. 문장객체
			pstmt = conn.prepareStatement(sb.toString());
			// 6. 실행
			rs = pstmt.executeQuery();
			// 7. 로직 처리
			while (rs.next()) {
				int no = rs.getInt("no");
				String name = rs.getString("name");
				String subject = rs.getString("subject");
				int score = rs.getInt("score");
				StudentVO vo = new StudentVO(no, score, name, subject);
				list.add(vo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	// 학번으로 검색후 성적 수정 ( ModifyStudentScore)
	public void ModifyStudentScore(int no, int score) {

		// 4. sql 문 작성
		sb.setLength(0);
		sb.append("UPDATE STUDENTS SET SCORE = ? ");
		sb.append("WHERE NO = ? ");
		try {
			// 5. 문장객체
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, score);
			pstmt.setInt(2, no);
			// 6. 실행
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// 학번으로 검색 후 학생정보 삭제 ( DeleteStudent)
	public void DeleteStudent(int no) {

		// 4. sql 문 작성
		sb.setLength(0);
		sb.append("DELETE FROM STUDENTS ");
		sb.append("WHERE NO = ? ");

		try {
			// 5. 문장객체
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, no);
			// 6. 실행
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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