package day21;

import java.util.ArrayList;

import vo.EmpVO;
import dao.EmpDAO;

public class TestMain2 {
	public static void main(String[] args) {

		EmpDAO dao = new EmpDAO();

		EmpVO vo = dao.selectOne(7788); // 7788 번 사원의 정보 리턴

		System.out.println(vo);

		ArrayList<EmpVO> list = dao.selectAll();

		for (EmpVO vo2 : list) {
//			System.out.println(vo2);
			System.out.println(vo2.getEname() + " : " + vo2.getHiredate());
			;
		}
		
		// 사원정보 1개 만들고 이것을 DB에 저장
		EmpVO vo3 = new EmpVO("홍길동", "영업", "2024/10/22", 7788, 1111, 3000, 0, 10);

//		dao.insertOne(vo3);
		
		EmpVO vo4 = dao.findEmpnoByName("길"); // 첫번째 홍길동만 찾기
		System.out.println(vo4);
		
		
		vo4.setJob("과장");
		
		dao.updateOne(vo4);
		
		EmpVO vo5 = dao.selectOne(vo4.getEmpno());
		
		dao.deleteOne(vo5.getEmpno());
		
		dao.close();

	}
}
