package day10;

public class Whale extends Mamma {
	
//	int eye, nose, ear;
//	String name, species;
	
	Whale(){
		eye = 2;
		nose = 1;
		ear = 2;
		name = "고래";
		species = "흰수염고래";
	}
	
	// @ 골뱅이 : at
	@Override
	public void eating() {
		System.out.println("새우 먹기");
	}
	@Override
	public void sleeping() {
		System.out.println("고래가 잠자요");
	}
	
	void swimming() {
		System.out.println("수영하기");
	}


}
