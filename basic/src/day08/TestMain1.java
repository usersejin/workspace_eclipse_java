package day08;


// 1. 기본형 변수 : 
// 2. 참조형 변수

public class TestMain1 {
	public static void main(String[] args) {
		Human h1 = new Human();
		
		// 자료형 참조변수 = new 생성자()
//		h1.name = "홍길동";
//		h1.age = 20;
//		h1.job = "의적";
//		h1.gender = "남";
//		h1.tel = "010-1111-1222";
		
		h1.status();
		System.out.println(h1.age);
		System.out.println(h1.name);
		
		Human h2 = new Human("뽀로로", "취준생", 24);
//		h2.name = "뽀로로";
//		h2.job = "취준생";
//		h2.age = 24;
		h2.status();
		
		System.out.println("----------------------------");
		
		Human h3 = new Human("루피","알바생", 23, "010-2222-3333");
		
		h3.status();
	}

}
