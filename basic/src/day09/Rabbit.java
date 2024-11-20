package day09;

public class Rabbit extends Mamma {
	
//	int eye, nose, ear;
//	private String name, species;
	
	Rabbit(){
		eye = 2;
		nose = 1;
		ear = 2;
		name = "토끼";
		species = "앙골라";
	}
	


	@Override
	public void eating() {
		System.out.println("당근 먹기");
	}
	
	@Override
	public void sleeping() {
		System.out.println("토끼가 잠자요");
	}
	
	public void jumping() {
		System.out.println("깡총");
	}

}
