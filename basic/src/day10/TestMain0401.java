package day10;
// TestMain03 과 이어짐

public class TestMain0401 {
	public static void main(String[] args) {

		Police2 p = new Police2();

		SlingShot ss = new SlingShot();

		p.setSs(ss);

//		System.out.println(p.ss); // 참조값 출력

		p.ss.use(); // stack 에 있는 p 의 참조값(heap)에 존재하는 use() 출력됨

		p.ss.reuse();

	}

}
