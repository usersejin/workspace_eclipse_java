package day10;

public class Marine extends Terran implements Flyable {
	
	int 사거리, 공격력, 방어력;
	int 공격속도, 이동속도;


	public Marine() {
		x = 0;
		y = 0;
		hp = 100;
		사거리 = 6;
		공격력 = 3;
		방어력 = 4;
		공격속도 = 5;
		이동속도 = 2;

	}

	// 멤버 메서드
	void 공격하기() {
		System.out.println("뚜뚜");
	}
	void 공격하기(Terran x) { 
		x.hp -= 공격력;
	}
	
//	void 공격하기(Marine x) { // Marine 클래스의 x 를 공격 : 매개변수가 있음
//		x.hp -= 공격력;
//	}
//
//	void 공격하기(Medic x) { // Medic 클래스의 x 를 공격
//		x.hp -= 공격력;
//	}

	void 스팀팩() {
		if (hp >= 3) {
			hp -= 3;
			공격속도 += 3;
			이동속도 += 2;
			System.out.println("예~");
		} else {
			System.out.println("체력이 부족합니다.");
		}
	}
	
	public void fly() {
		System.out.println("제트팩으로 날아요");
	}
}
