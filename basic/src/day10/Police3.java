package day10;
// 최종 인터페이스 참조변수로 
public class Police3 {

	String name, rank;
	Weapon w; // 인터페이스명 

	Police3() {
		name = "포순이";
		rank = "순경";
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

	public Weapon getW() {
		return w;
	}

	public void setW(Weapon w) {
		this.w = w;
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
	
//	public void use() {
//		ss.throwStone();
//	}
}
