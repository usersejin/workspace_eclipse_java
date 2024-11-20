package day09;
// 토끼, 원숭이, 고래의 조상 클래스 포유류 
// 객체 지향언어의 특징
// 1. 캡슐화	(Encapsulation)
// 2. 상속	(Inheritance)
// 3. 추상화	(Abstraction)

// 추상 클래스
// 실체(구현) 클래스의 공통적인 부분을 추출해서 상위의 개념으로 만들어 놓은 것
// 인스턴스화 할 수 없음(new 연산자와 함께 사용 불가능)
// 주로 상속 목적으로 만들어 놓은 것

// 추상 메서드
// 미구현 메서드 : method body 가 존재하지 않음
// 반드시 추상메서드를 override 해서 사용해야 함
public abstract class Mamma {

	// 멤버 변수
	int eye, nose, ear;
	String name, species;
	
	// 메서드를 미완성 메서드로 작성 -> 메서드 바디가 없는 메서드
	// 추상 메서드
	// method body 가 존재하는 메서드 : 구현 메서드
	// method body 가 없는 메서드 : 미구현 메서드
	public abstract void eating();

	// 추상 메서드가 1개라도 있으면 그 클래스는 추상클래스여야 함
	
	public abstract void sleeping();
}
