package day10;

public class Police2 {

	String name, rank;
	SlingShot ss;
	

	Police2() {
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
	
	public void use() {
		ss.throwStone();
	}
}
