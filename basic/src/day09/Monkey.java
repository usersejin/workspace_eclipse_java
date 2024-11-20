package day09;

public class Monkey extends Mamma {
	
//	int eye, nose, ear;
//	String name, species;
	
	Monkey(){
		eye = 2;
		nose = 1;
		ear = 2;
		name = "손오공";
		species = "개코원숭이";
		
	}
	
	
	@Override
	public void eating() {
		System.out.println("바나나 먹기");
	}
	
	@Override
	public void sleeping() {
		System.out.println("원숭이가 잠자요");
	}
	
	void climbing() {
		System.out.println("나무 오르기");
	}

	
	


}
