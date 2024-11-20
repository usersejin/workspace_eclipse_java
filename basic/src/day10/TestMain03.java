package day10;

public class TestMain03 {

	public static void main(String[] args) {

		Police p = new Police();

		p.eating();
		p.arrest();

		Gun g = new Gun();
		p.setG(g); // 값을 지정해줘야지 해

		p.g.fire(); // p는 참조변수, g는 p가 가진 멤버변수, 그 멤버변수가 갖고있는 (클래스니까) 멤버메서드(fire()) 실행
		p.g.reload();
		

		TaserGun t = new TaserGun();
		p.setT(t); // 경찰에 테이저건 지정
		
//		p.use(); // 테이저건 발사
	}

}
