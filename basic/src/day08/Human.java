package day08;

public class Human {
	
	
	String name, job, tel, gender;
	int age;
	
	// this: 설계단계에서 자기자신을 가리키는 참조변수
	Human(){
		// 멤버변수를 초기화
		// 자료형의 기본값으로 초기화
		// 참조형 변수들은 null
		// int => 0
		System.out.println("기본 생성자");
		this.name = "홍길동";
		this.age = 20;
		this.job = "의적";
		this.gender = "남";
		this.tel = "010-1111-1222"; 
		// 원래는 this 써줘야하는데, 헷갈리지 않았어서 안써줬던 거임
		// this 생략은 가능함
	}
	// 뽀로로
	Human(String name, String job, int age){
		// name : 멤버변수 name, 지역변수 name 똑같은 애가 두개
		// 자바는 제일 가까운애(지역변수)를 찾아
		// 지역변수를 지역변수에 담아, 멤버변수 안 담음
		// 클래스는 설계도  this 사용 -> 멤버변수 지칭
		// this는 자기 자신을 가리키는 참조변수임
		
		this.name = name;  
		this.job = job;
		this.age = age;
		
		// 지정하지 않은 모든 멤버변수는 자료형의 기본값으로 자동초기화
		
	}
	// 루피
	Human(String name, String job, int age, String tel){
//		this.name = "홍길동";
//		this.age = 20;
//		this.job = "의적";
//		this.gender = "남";
//		this.tel = "010-1111-1222"; 
		// 기본 생성자를 실행
//		this(); // 다른 생성자에 불러서 사용 가능
		// 지정하지 않은 모든 멤버변수는 자료형의 기본값으로 자동초기화됨
		
		this(name, job, age);
		
		this.name = name;
		this.job = job;
		this.age = age;
		this.tel = tel;
		// 지정되지 않은 모든 멤버변수는 자료형의 기본값
	}
	void eating() {
		System.out.println("밥을 먹어요");
	}
	
	void talking() {
		System.out.println("쏙닥");
	}
	
	void status() {
		System.out.println("이름 : " + name);
		System.out.println("직업 : " + job);
		System.out.println("전화번호 : " + tel);
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
	}
	

}
