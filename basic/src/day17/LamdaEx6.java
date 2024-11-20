package day17;

// 런타임시에 자료형을 결정하도록 제네릭 이용하기
@FunctionalInterface
interface MathUtil<T> {
	T cal(T a, T b);
}

//interface MathUtil {
//	Integer cal(Integer a, Integer b);
//}
//
//interface StringUtil {
//	String concat(String a, String b);
//}
//
//interface FloatUtil {
//	Float add(float a, float b);
//}

public class LamdaEx6 {
	public static void main(String[] args) {

		MathUtil<Integer> mu;
		mu = (a, b) -> a + b;

		System.out.println(mu.cal(100, 200));

		MathUtil<String> str = (a, b) -> a + b;
//		System.out.println(str.concat("푸른하늘", "은하수")); // 푸른하늘은하수
		System.out.println(str.cal("푸른하늘", "은하수")); // 푸른하늘은하수

		MathUtil<Float> f;
		f = (a, b) -> a + b;
//		System.out.println(f.add(100.0f, 200.0f));
		System.out.println(f.cal(100.0f, 200.0f));
	}

}
