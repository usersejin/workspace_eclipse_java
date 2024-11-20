package day07;

public class TestMain3 {
	public static void main(String[] args) {

		// 클래스명 참조변수 = new 생성자
		Marine m1 = new Marine();
		// 생성자는
		// 객체의 초기화를 담당하는 특수 메서드

		System.out.println(m1.hp);
		System.out.println(m1.공격력);
		m1.status(); // 현재 캐릭터의 상태정보
		for (int i = 1; i <= 100; i++) {
			m1.스팀팩();
		}
		System.out.println("--------------------------");

		m1.status(); // 스팀팩() 이후 상태정보

		System.out.println("--------------------------");

		Marine m2 = new Marine();

		System.out.println("m2.hp : " + m2.hp);
		
		
		System.out.println("--------------------------");
		
		// m1 ==> m2 공격하기
		System.out.println("m2 : " + m2); // 참조값이 출력됨
		m1.공격하기(m2); // (m2) 메서드의 매개변수
		m1.공격하기(m2);
		m1.공격하기(m2);
		m1.공격하기(m2);
		m1.공격하기(m2);		
		m1.공격하기(m2);
		
		System.out.println("m2.hp : " + m2.hp); //
		
		System.out.println("--------------------------");
		
		Medic m = new Medic();
		
		m.hp = 50;
		m.치료하기();
		m.status();
		
		// 특정 대상만 치료하기
		//  m2 치료
		m.치료하기(m2); // 오버로딩된 멤버 메서드
		
		
		System.out.println("m2 체력 : " + m2.hp);
	}

}
