package day09;
// 클래스 구성요소
// member 변수, member field
// 생성자(constructor)
// member method
public class Person {
	
	// 멤버 변수 (정보)
	String name;
	int age;
	int eye;
	int nose;
	int mouth;
	String gender;
	String job;
	
	// age 의 setter, getter
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	
	// 기본 생성자
	public Person(){
		name = "하츄핑";
		age = 3;
		eye = 0;
		nose = 0;
		mouth = 0;
		gender = null;
		job = null;
		
		System.out.println("Person클래스의 기본생성자");
	}
	
	public Person(String name) {
		this(); // 매개변수 없는 기본생성자 실행, 
		this.name = name;
		System.out.println("person의 매개변수 있는 생성자");
		
	}
	// 멤버 메서드(동작, 행위)
	void eating() {
		System.out.println("맛난걸 먹어여");
	}
	
	void sleeping() {
		System.out.println("쿨쿨..");
	}
	
	void thinking() {
		System.out.println("와 내일이 토요일이야");
	}
}




