package day09;
// Person 클래스의 상속을 받은 calss SuperMan
// Person 의 업그레이드 버전
// extends 상속받을 클래스

// this : 자기자신을 가리키는 참조변수 
// this(); : 내 클래스의 기본생성자

// super : 부모를 가리키는 참조변수
// super(); : 부모 클래스의 기본생성자


public class SuperMan extends Person{
	
	float height; // 자동 초기화 : 0.0f
	float weight;
	
	public SuperMan(){
		// 이 생성자의 상단에는 부모의 기본생성자를 호출해
		// 부모의 생성자 부르기 super();
		super(); // super(); 안써도 암묵적으로 이 키워드는 항상 존재
		// 그래서 실행결과에 "이건 Person 클래스의 기본생성자"가 먼저 출력됨
		System.out.println("슈퍼맨 클래스의 기본생성자");
		
	}
	
	public SuperMan(String name, String job, int age, float height, float weight){
//		super(); 가 생략되어 있는 것, 안 써도 있는 것
		super(name); // 부모의 String 매개변수가 있는 생성자를 호출
		// 부모의 생성자 호출은 항상 첫번째 라인에 와야해 
		
		this.name = name;
		this.job = job;
		this.age = age;
		this.height = height;
		this.weight = weight;
		System.out.println("superman 매개변수 있는 생성자 호출");
	}
	
	public void firelaser() {
		System.out.println("눈에서 레이저 뿅뿅");
	}
	
	public void fly() {
		System.out.println("날기 쓩~");
	}

}
