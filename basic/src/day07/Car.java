package day07;
// 객체 설명
// 클래스 : 객체를 생성하기 위한 설계도
// 구성요소
// 1. member 변수, member field
// 2. member method
// it ==> 컴퓨터에서 무언가의 이름을 정할 때는 한글을 사용하지 않음

public class Car {
	// 속성, 특징 정리
	// 멤버변수
	int 핸들, 바퀴, 엔진, 문, 속도;  // default : 0
	String 차종, 제조사;  // default : null
	
	
	// 동작, 행위
	// 멤버 메소드
	void 전진() {
		System.out.println("부릉부릉");
	}
	
	void 후진() {
		System.out.println("띠리리");
		
	}
	
	void 정지() {
		System.out.println("끼익");
	}

	void 감속() {
		System.out.println("감속");
	}

}
