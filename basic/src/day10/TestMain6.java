package day10;

public class TestMain6 {
	
//	public static void main(String[] args)
//	public : 어디서든 접근가능
//	static : 정적인
//	void : 리턴값이 없는
//	main : main 이라는 이름의 메서드
//	(String[] args) : String[] 을 매개변수로 갖는 메서드, args = arguments
	
	public static void main(String[] args) {
		
		SmartPhone.company = "샤오미";
		System.out.println(SmartPhone.company);
		
		System.out.println("----------------------------");
		
		SmartPhone sp1 = new SmartPhone("갤럭시S24", "한국", "010-111-222", "삼성", 1800000); // 갤럭시
		SmartPhone sp2 = new SmartPhone("아이폰16", "미국", "010-2222-3333", "애플", 2000000); // 아이폰
		
		System.out.println(sp1.company); // 애플 -> 8번라인으로 static, method area 에 저장되어 둘 다 애플이 출력됨
		System.out.println(sp2.company); // 애플
		
		sp2.company = "삼성";
		
		System.out.println(sp1.company); // 삼성 -> 13번라인으로 static, method area 에 저장되어 둘 다 삼성이 됨
		System.out.println(sp2.company); // 삼성
		
		sp2.company = "LG";
		
		System.out.println(sp1.company); // LG 왜? 
		System.out.println(sp2.company); // LG
		
		System.out.println(SmartPhone.company); // sp1.company로 쓰지 않고 앞에 클래스명을 쓴다
		
		 // static 
		// static 변수, static method 는 instance화 하지 않음 -> new 할 필요없음 -> 참조변수 없음
		// 클래스의 공용변수로 사용될 때 쓴다
		// new 하기 전에 미리 static, method area에 미리 만들어짐
		// new 하면 stack에 참조변수 생기고, heap에 참조변수의 메모리의 주소값이 할당됨(stack의 참조변수에)
		// ex. Math.random(), Math.PI() new도 없는데 사용하잖아 static이어서 그래
	}

}
