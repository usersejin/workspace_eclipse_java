package day24;

public class Gun implements Weapon { // weapon 으로 묶어줘
	int bullet;

	Gun() {
		bullet = 6;
	}

	public void fire() {
		if (bullet > 0) {
			System.out.println("총 쏘기");
			bullet--;
		} else {
			System.out.println("틱 총알 없음");
		}
	}

	public void reload() {
		System.out.println("재장전");
		this.bullet = 6;
	}

	@Override
	public void use() { // weapon 인터페이스에서 가져온 것
		fire();
		
	}

	@Override
	public void reuse() { // weapon 인터페이스에서 가져온 것
		reload();
		
	}
}