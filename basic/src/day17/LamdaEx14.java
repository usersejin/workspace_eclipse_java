package day17;

// 람다식을 더 줄인 것 예제임..

@FunctionalInterface
interface Operation {
	double oper(int a, int b);
}

public class LamdaEx14 {
	public static void main(String[] args) {

		System.out.println(Math.pow(2, 3)); // 2^3 -> double 타입
		System.out.println("-----------------------");
		
//		Operation op = (a, b) -> Math.pow(a, b); // 추상메서드이므로 여기서 그 메서드를 Math.pow로 오버라이딩한 것
		Operation op = Math::pow;

		System.out.println(op.oper(3, 3));

	}

}
