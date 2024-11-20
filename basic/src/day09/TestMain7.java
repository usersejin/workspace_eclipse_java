package day09;

public class TestMain7 {
	public static void main(String[] args) {
		
	
		// Parent 의 참조변수를 Child 클래스를 참조하게 해 -> 상속관계일 때만 가능한 것
		// 1번 방법
		Parent p1 = new Child(); 
		
		// 2번 방법
//		Parent p1 = null;
//		p1 = new Child(); 
		
		// 3번 방법
//		Parent p1 = null;
//		Child c1 = new Child();
//		p1 = c1; 
		
		
		System.out.println(p1.name);
		p1.singing();
		p1.eating();
		
//		p1 에 child 객체의 참조값 담기
	}

}
