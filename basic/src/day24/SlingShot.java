package day24;

public class SlingShot implements Weapon{ // weapon 으로 묶어줘

	int stone;

	SlingShot() {
		stone = 1;
	}

	public void throwStone() {
		if (stone > 0) {
			System.out.println("새총 발사");
		} else {
			System.out.println("돌맹이가 없습니다.");
		}
	}

	@Override
	public void use() { // weapon 인터페이스에서 가져온 것
		throwStone();
		
	}

	@Override
	public void reuse() { // weapon 인터페이스에서 가져온 것
		System.out.println("돌맹이 충전중");
		
	}
}
