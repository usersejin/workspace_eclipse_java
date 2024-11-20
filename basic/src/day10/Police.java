package day10;

// 상속 = A is a B 일경우 성립 
// 포함관계 = A has a B 
// 참조변수 3가지 : 배열, 클래스, 인터페이스
// 포함관계일 때 클래스를 멤버변수로 선언해줘 

public class Police {

	String name, rank;
	Gun g; // 클래스의 참조변수 선언, 경찰의 멤버변수로 사용할 수 있음
	TaserGun t; 
	SlingShot ss;

	Police() {
		name = "포순이";
		rank = "순경";
		g = null; 
		t = null;
	}

	// setter, getter
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getRank() {
		return this.rank;
	}

	public Gun getG() {
		if (g != null) {
			System.out.println("총기 있음");
		} else {
			System.out.println("총기 없음");
		}
		return g;
	}

	public void setG(Gun g) {
		System.out.println("총기 지급");
		this.g = g;
	}

	public TaserGun getT() {
		return t;
	}

	public void setT(TaserGun t) {
		this.t = t;
	}
	

	public SlingShot getSs() {
		return ss;
	}

	public void setSs(SlingShot ss) {
		this.ss = ss;
	}
	
	// 멤버 메서드
	public void eating() {
		System.out.println("경찰이 도넛을 먹어요");
	}

	public void arrest() {
		System.out.println("경찰의 미란다법칙 설명");
	}
	
//	public void use() {
//		t.fire();
//	}
	
	public void use() {
		ss.throwStone();
	}
}
