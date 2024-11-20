package day17;

// ** 인터페이스의 메서드가 2개 이상일 때 -> 람다식 사용 불가능

// Merge 인터페이스가 처음부터 람다식을 쓸 수 있는 인터페이스라는 것을 처음부터 정의하고 싶을 땐 @FunctionalInterface

@FunctionalInterface
interface Merge {
	public int add(int a, int b);

//	public int minus(int a, int b);
}

public class LamdaEx5 {
	public static void main(String[] args) {
		// ** 인터페이스에서 추상메서드는 단 하나만 가져야 람다식을 이용할 수 있음 -> 두 개 있으면 사용 불가능
		Merge m;

		// 1. 익명 이너 클래스로 만들기
//		Merge m = new Merge() {
//
//			@Override
//			public int add(int a, int b) {
//				return a + b;
//			}
//
//			@Override
//			public int minus(int a, int b) {
//				return a - b;
//			}
//
//		};
//				
//		System.out.println(m.add(100, 200));
//		System.out.println(m.minus(200, 50));

		// 2. 람다식으로 표현하기
//		m = (int a, int b) -> {return a + b;};
		m = (a, b) -> a + b;

		System.out.println(m.add(200, 300));

	}
}
