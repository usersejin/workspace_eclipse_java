package day08;

public class Marine {
	// 멤버변수, 멤버 필드 : 전역 변수로 취급
	int x, y, hp, 사거리, 공격력, 방어력;
	int 공격속도, 이동속도;

	// 생성자 특징 정리
	public Marine() {
		// 생성자 : 멤버 변수의 초기화 담당
		// 1. 클래스명과 동일한 이름을 갖는 특수메서드
		// 2. 객체의 초기화 담당 (default)
		// 3. return 타입이 없으면서 void 사용하지 않음 -> 사용하면 일반메서드가 됨 void 없어야 함
		// 4. 생성자 여러개 가질 수 있음(오버로딩이 가능)
		// 5. 생성자가 한개도 없다면 실행 시 JVM은 기본생성자(매개변수가 없는 생성자)는 존재하는 것으로 간주
		// 6. 자동으로 선언되는 생성자는 멤버변수의 값을 자료형의 기본값으로 초기화
		System.out.println("여기는 생성자");
		// 자료형의 기본값을 할당 => 기본생성자
		x = 0;
		y = 0;
		hp = 100;
		사거리 = 6;
		공격력 = 3;
		방어력 = 4;
		공격속도 = 5;
		이동속도 = 2;

	}

	// 멤버 메서드
	void 공격하기() {
		System.out.println("뚜뚜");
	}
	
	void 공격하기(Marine x) { // 매개변수가 있음
//		System.out.println("공격하기 메서드 x : " + x);
		// 대상의 체력을 약간 감소
		x.hp -= 공격력;
	}

	void 정지() {
//		int a = 100;a // 얘는 지역변수
		System.out.println("정지");
	}

	void 패트롤() {
		System.out.println(hp); // 멤버변수는 전역변수이므로 어떤 메서드에서든 사용가능
		System.out.println("정찰 중 ..");
	}

	void 스팀팩() {
		// 체력을 약간 저하시키고 공격속도, 이동속도를 증가시킴
		if (hp >= 3) {
			hp -= 3;
			// 공격속도 향상, 이동속도 향상
			공격속도 += 3;
			이동속도 += 2;
			System.out.println("예~");
		} else {
			System.out.println("체력이 부족합니다.");
		}
	}

	void status() {
		System.out.println("체력 : " + hp);
		System.out.println("x: " + x + ", y: " + y);
		System.out.println("공격속도 : " + 공격속도);
	}
}
