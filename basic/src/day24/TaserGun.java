package day24;

public class TaserGun implements Weapon { // weapon 으로 묶어줘

	int battery;

	TaserGun() {
		battery = 100;
	}

	public void fire() {
		System.out.println("테이저건 발사");
		battery = 0;
	}

	public void reload() {
		System.out.println("테이저건 충전 중");
		this.battery = 100;
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
