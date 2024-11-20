package day20;

import java.util.ArrayList;

import dao.MemberDAO;
import vo.MemberVO;

public class TestMain2 {
	public static void main(String[] args) {

		// 아래의 코드가 정상적으로 실행될 수 있도록 MemberDAO, MemberVO 클래스 작성
		// MemberDAO 는 dao 패키지, MemberVO 는 vo 패키지 아래에 있음
		// Memeber 테이블을 참고로 CRUD 할 수 있는 MemeberDAO 완성하기

		MemberDAO dao = new MemberDAO();

		MemberVO vo = dao.getOne(1);

		System.out.println(vo.getMemno() + " : " + vo.getName() + " :" + vo.getId());

		dao.addOne(new MemberVO(0, "둘리", "bbb", "ccc", 102));

		ArrayList<MemberVO> list = dao.selectAll();
		for (MemberVO vo3 : list) {
			System.out.println(vo3.getMemno() + " : " + vo3.getName() + " : " + vo3.getId());
		}

//		dao.updateOne();

		dao.deleteOne(23);

		dao.close();
	}

}
