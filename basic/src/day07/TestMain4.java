package day07;
// 생성자 오버로딩

public class TestMain4 {
	public static void main(String[] args) {
		
		Human h1 = new Human ();
		
		h1.eating();
		h1.talking();
		h1.status();
		
		System.out.println("----------------");
		
		Human h2 = new Human("짱구", 5, "유치원생");
		
		h2.status();
		
		System.out.println("-----------------");
		
		Human h3 = new Human("IU", 32, "여성", "가수"); 
		
		h3.status();
		
		System.out.println("-----------------");
		
		// 보스베이비, 2살, 남성, 010-2222-3333, 아기
		
		Human h4 = new Human("보스베이비", 2, "남성", "010-2222-3333", "아기");
		h4.status();
		
				
		
		}

}
