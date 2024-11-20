package day09;

public class Child extends Parent {
	String snsid;

	Child() {
		System.out.println("Child의 기본생성자");
	}

	public void goClub() {
		System.out.println("춤추기");
	}

	// 메서드 오버라이딩 : 부모가 상속한 메서드를 다시 새롭게 정의해서 사용
	// 오버라이딩: 재정의 -> 내가 새롭게 정의해서 다시 쓰는 것
	// 메서드명은 동일/ 매개변수의 순서, 자료형, 개수까지 모두 일치
	// 부모의 접근지정자보다 동일하거나 더 넓은 범위(더 허용적)
	
	// 이 메서드는 오버라이드 메서드라 주석.. .
	// @키워드 : annotation -> 약속된 키워드만
	@Override // 컴파일러에게 이 메서드는 override 된 메서드라고 알려줌 -> 우리에게 미리 상속된 메서드인지 아닌지 알려줘
	public void singing() { // 이름이 같아야지 부모로부터 상속한걸로 알아
		System.out.println("자식의 최신 노래 부르기 -> 오버라이딩 한 것");
	}

}
