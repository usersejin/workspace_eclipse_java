package day07;

public class TestMain2 {
	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1.name);
		System.out.println(p1.age);
		
		// 20 홍길동
		p1.name = "홍길동";
		p1.age = 20;
		p1.eye = 2;
		p1.nose = 1;
		p1.mouth = 1;
		p1.gender = "man";
		p1.job = "도적";
		
		System.out.println(p1.name); // 참조값이 출력됨 like c의 포인터
		
		// 호빵맨 20 동네백수 남자
		Person p2 = new Person();
		
		p2.name = "호빵맨";
		p2.age = 20;
		p2.job = "백수";
		p2.gender = "남자";
		
		System.out.println(p2.name);
		
		System.out.println("=--------------------------");
		Person p3 = new Person();
		// 하츄핑
		// 3살
		System.out.println(p3.name);
		
		
	}
	

}
