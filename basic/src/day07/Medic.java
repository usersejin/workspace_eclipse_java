package day07;

public class Medic {

	int hp, x, y, 치료력;

	public Medic(){
		x = 0;
		y = 0;
		hp = 100;
		치료력 = 4;
	}

	void 이동하기() {
		System.out.println("이동");
	}

	void 치료하기() {
		if (hp <= 90) {
			System.out.println("체력증가");
			hp += 10;
		}

	}
	// 오버로딩 
	void 치료하기(Marine m2) {
		m2.hp += 치료력;
		System.out.println("치료");
	}

	void 패트롤() {
		System.out.println("정찰");
	}

	void status() {
		System.out.println("체력 : " + hp);
		System.out.println("x : " + x + ", y : " + y);
	}
	

}
