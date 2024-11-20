package day20;

import java.util.ArrayList;

import dao.MemberDAO1;
import vo.MemberVO1;

public class TestMain3 {
	public static void main(String[] args) {
		
		MemberDAO1 dao = new MemberDAO1();
		
		// insert
//		dao.insertOne(new MemberVO1("ccc", "ddd", "hj", 3));
		
		// selectOne
		dao.selectOne(1);
		
		// selectAll
		ArrayList<MemberVO1> list = new ArrayList<MemberVO1>();
		
		for (MemberVO1 vo : list) {
			System.out.println("ID : " + vo.getId() + ", PW : " + vo.getPw() + ", NAME : " + vo.getName() + ", MEMNO : " + vo.getName());
		}
		
		// update
		dao.updateOne(new MemberVO1("fff", "ggg", "ui", 2));
		
		// delete
		dao.deleteOne("fff");
		
		// close
		dao.close();
	
	}

}
