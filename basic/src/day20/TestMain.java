package day20;

import java.util.ArrayList;

// TestMain - DeptDAO - DeptVO
import dao.DeptDAO;
import vo.DeptVO;

// DAO : Database Access Object(객체)
public class TestMain {
	public static void main(String[] args) {

		DeptDAO dao = new DeptDAO();

		DeptVO vo1 = dao.selectOne(20);
		System.out.println("부서번호 : " + vo1.getDeptno());
		System.out.println("부서명 : " + vo1.getDname());
		System.out.println("부서위치 : " + vo1.getLoc());

		// ArrayList로 DeptVO
		ArrayList<DeptVO> list = dao.selectAll();
		System.out.println(list);

		// 반복문으로 전체 데이터 꺼내서 출력하기 : XXX 부서명 : XXX 부서위치 : XXXX 형태로 출력)
		for (int i = 0; i < list.size(); i++) {
			DeptVO vo = list.get(i);
			System.out.println(vo.getDeptno() + " : " + vo.getDname() + " : " + vo.getLoc());
		}
		System.out.println("----- 향상된 for문 -----");
		for (DeptVO vo : list) {
			System.out.println(vo.getDeptno() + " : " + vo.getDname() + " : " + vo.getLoc());
		}
		System.out.println("----------------------");

//		DeptVO vo3 = new DeptVO(0, "전략", "부산");
//
//		dao.insertOne(vo3);

		System.out.println("----------------------");

		dao.updateOne(new DeptVO(10, "연구", "대전"));

		System.out.println("----------------------");

		dao.deleteOne(10);

		System.out.println("----------------------");

		dao.close();
	}

}
