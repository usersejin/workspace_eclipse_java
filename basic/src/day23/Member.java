package day23;

//TestMain3 - Member

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Setter
//@Getter
//@NoArgsConstructor
//@AllArgsConstructor

// 디자인 패턴 중 하나 SingleTon
// 디자인 패턴 : 여러가지 객체지향 설계와 관련된 문제점들을 해결해 놓은 것
// 이름을 부여 GoF
// Framwork ==> Spring

// SingleTon 패턴 : 오직 하나의 인스턴스만 생성하도록 보장 -> 자원을 많이 사용하는 객체를 한개만 사용할 수 있도록
// 1. private 생성자
// 2. 멤버변수로 자기 클래스를 갖음
// 3. 클래스에 접근 할 수 있게 getInstance 메서드 생성
public class Member {
	// 2. 정적변수로 멤버 필드를 갖음
	private static Member m = new Member();
	String id;
	String name;
	String pw;
	int grade;

	// 1. private 생성자 : private로 해서 생성자는 접근할 수 없게 됨
	private Member() {

	}

	// 3. 인스턴스를 반환하는 정적 메서드
	// getInstance 메서드를 만들어서 멤버 m 한가지에만 접근할 수 있도록 함
	// 실제 힙에 존재하는 애는 하나만 존재하게 됨
	public static Member getInstance() {
		// 1번 방법
		return m;

		// 2번 방법 (instance 변수명은 다르게 줄 수 있음)
//		if (instance == null) {
//			instance = new Member();
//	}
//		return instance;
	}

	public void print() {
		System.out.println("싱글톤객체 사용중");
	}

}
