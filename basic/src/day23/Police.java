package day23;

public class Police {

	String name, rank;
	Gun g;

	Police() {
		name = "포순이";
		rank = "순경";
		g= null;

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

	// 멤버 메서드
	public void eating() {
		System.out.println("경찰이 도넛을 먹어요");
	}

	public void arrest() {
		System.out.println("경찰의 미란다법칙 설명");
	}

}
