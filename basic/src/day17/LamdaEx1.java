package day17;

// 람다 ==> 메서드 (함수)를 하나의 식으로 표현한 것

interface Oper {

	public int addOne(int a);
}

// Oper 인터페이스를 구현한 TestOper 클래스 만들기 => 클래스를 만드는 이유: 여기저기 쓸 때 객체를 생성하기 쉽게하기 위해서
// but 클래스를 한번밖에 안 쓸건데 굳이 만들어야 할까? -> 익명 이너클래스 형태로 만들어 놓고 사용 (재활용 불가)

// class TestOper implements Oper {
//	@Override
//	public int addOne(int a) {
//		System.out.println("Oper 인터페이스를 구현한 클래스");
//		return 2*a;
//	}
//}

public class LamdaEx1 {
	public static void main(String[] args) {
//		Oper oper = new TestOper(); // 부모자식관계가 성립하므로

//		Oper oper = Oper 인터페이스를 구현한 객체
		// 익명 이너 클래스를 사용해서 (시작)
		Oper oper = new Oper() {

			@Override
			public int addOne(int a) {
				System.out.println("Oper 인터페이스를 구현한 클래스");
				return 2 * a;
			}

		}; // Oper oper = new Oper() 만하면 안돼 왜? 인터페이스이기 때문에 -> 인터페이스를 객체로 구현하기 위해선 {};를 해줘야 함
			// 익명 이너 클래스 끝

		System.out.println(oper.addOne(100));
		System.out.println("-------------------------------------");

		// 람다식 이용 => 익명 이너클래스를 간단한 식으로 바꿈
		Oper add2 = (a) -> a * 2;
		System.out.println(add2.addOne(100));

	}

}
