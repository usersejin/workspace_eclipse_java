package day09;

public class Horse extends Mamma {
	
	Horse(){
		eye = 2;
		nose = 1;
		ear = 2;
		name = "말";
		species = "적토마";
		
	}
	
	public void run() {
		System.out.println("말 달리기");
	}
	
	public void eating() {
		System.out.println("말이 먹어요");
	}
	
	public void sleeping() {
		System.out.println("말이 자요");
	}

}
