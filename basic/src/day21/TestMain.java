package day21;

import vo.DeptVO;

public class TestMain {
	public static void main(String[] args) {

		DeptVO vo = new DeptVO();
		vo.setDeptno(1);
		vo.setDname("IT");
		vo.setLoc("서울");

		System.out.println(vo.getDeptno() + " : " + vo.getDname() + " : " + vo.getLoc());
		System.out.println(vo.toString());

		DeptVO vo2 = DeptVO.builder()
							.deptno(10)
							.dname("AI")
							.loc("부산")
							.build();

		System.out.println(vo2);
	}

}
