package day10;
// TestMain03 과 이어짐
// 최종

public class TestMain0402 {
	public static void main(String[] args) {

		Police3 p = new Police3();

		// 1. Gun
		// 2. SlingShot

		// 1. Gun
		Gun g = new Gun();
				   // setter로 참조값을 전달하는 거야 
		p.setW(g); // 얘를 통해서 참조값 전달 setW에다가 g는 자식이고 w는 부모이잖아, 그러니까 자식의 참조값이 setW의 참조변수 w에 담기게 되는 것

		System.out.println(p.w);
		// 총의 참조값이 들어있음
		System.out.println(g);

		p.w.use();
		p.w.reuse();

		System.out.println("-------------");

		// 새총을 사용하도록 변경
		SlingShot ss = new SlingShot();

		p.setW(ss);
		p.w.use();
		p.w.reuse();

		System.out.println("-------------");

		TaserGun t = new TaserGun();

		p.setW(t); // setter로 테이저건의 참조값을 전달
		p.w.use(); // 경찰이 무기를 사용
		p.w.reuse(); // 경찰이 무기를 재사용

	}

}
