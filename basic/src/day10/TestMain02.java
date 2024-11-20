package day10;

public class TestMain02 {
	public static void main(String[] args) {

		Horse h1 = new Horse();

		h1.eating();
		h1.sleeping();
		h1.run();
		h1.fly();
		System.out.println("------------");

		Marine m1 = new Marine();

		m1.패트롤();
		m1.공격하기();
		m1.fly();

		Flyable f; // 인터페이스도 참조형 변수를 갖음
//		f = new Flyable(); // 추상메서드이기 때문에 new 로 인스턴스화 할 수 없음
		
		// 인터페이스도 상속과 같은 부모역할을 함
		f = h1;
		System.out.println("f : " + f);
		System.out.println("h1 : " + h1);
		
		// 인터페이스가 가지고 있는 것만 활용 가능
		f.fly(); // 이것만 가능
//		f.공격하기(); // 이건 안돼
		
		System.out.println("-------------");
		
		f = m1;
		
		f.fly(); // 같은 행동이지만 각 개인에 맞춰 실현 => 다형성
		
		// 다형성
		// 동일한 조작방법으로 동작시키지만 대상에 따라 다른 실행을 하게 하는 것
		
		// 객체지향언어의 특징
		// 1. 캡슐화 (Encapsulation): 정보의 은직
		// 데이터와 코드의 형태를 외부로부터 알 수 없게 하고
		// 데이터의 구조와 역할, 기능을 하나의 캡슐형태로 만드는 방법
		
		// 2. 상속 (Ingeritance) : extends
		// 상위 클래스의 모든 것을 하위 클래스가 이어 받는 것
		
		// 3. 추상화 (Abstraction) 
		// 객체의 공통적인 속성과 기능을 추출하여 정의하는 것을 말함
		
		// 4. 다형성 (Polymorphism)
		// 동일한 조작방법으로 동작시키지만 대상에 따라 다른 실행을 하게 함
		
		
	}

}
