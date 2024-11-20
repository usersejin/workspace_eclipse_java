package day24;

public class Horse extends Mamma implements Flyable {

	Horse() {
		eye = 2;
		nose = 1;
		ear = 2;
		name = "말";
		species = "적토마";

	}

	public void run() {
		System.out.println("말 달리기");
	}

	@Override
	public void eating() {
		System.out.println("말이 먹어요");
	}

	@Override
	public void sleeping() {
		System.out.println("말이 자요");
	}

	@Override
	public void fly() {
		System.out.println("말이 날아요");
	}

}
