package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.MemberVO1;

public class MemberDAO1 {

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "scott";
	String password = "tiger";

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	StringBuffer sb = new StringBuffer();

	public MemberDAO1() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Create -> insert
	public void insertOne(MemberVO1 vo) {

		sb.setLength(0);
		sb.append("INSERT INTO MEMBER VALUES (?, ?, MEMBER_MEMNO.NEXTVAL, ?)");

		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPw());
			pstmt.setString(3, vo.getName());

			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Read -> selectOne
	public MemberVO1 selectOne(int memno) {

		sb.setLength(0);
		sb.append("SELECT ID, PW, NAME, MEMNO FROM MEMBER WHERE MEMNO = ?");

		MemberVO1 vo = null;

		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, memno);

			pstmt.executeQuery();

			while (rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				vo = new MemberVO1(id, pw, name, memno);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return vo;
	}

	// Read -> SelectAll
	public ArrayList<MemberVO1> selectAll() {

		ArrayList<MemberVO1> list = new ArrayList<MemberVO1>();

		sb.setLength(0);
		sb.append("SELECT ID, PW, NAME, MEMNO FROM MEMBER");

		try {
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();

			while (rs.next()) {

				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				int memno = rs.getInt("memno");

				MemberVO1 vo = new MemberVO1();
				list.add(vo);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	// Update -> updateOne
	public void updateOne(MemberVO1 vo) {

		sb.setLength(0);
		sb.append("UPDATE MEMBER SET ID = ?, PW = ?, NAME = ? WHERE MEMNO = ? ");

		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPw());
			pstmt.setString(3, vo.getName());
			pstmt.setInt(4, vo.getMemno());

			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// Delete -> deleteOne
	public void deleteOne(String id) {

		sb.setLength(0);
		sb.append("DELETE FROM MEMBER WHERE ID = ?");

		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// close()
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
