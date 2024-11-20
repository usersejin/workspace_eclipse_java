package day17;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

// 정리하기
public class LamdaEx11 {
	public static void main(String[] args) {
		// Supplier<T>
		// 인자는 받지 않으며 리턴타입만 존재하는 메서드
		// 순수함수에서 결과를 바꾸는 것 오직 input 뿐

		Supplier<String> s = () -> "Hello Supplier";

		String result = s.get();
		System.out.println(result);

		System.out.println("----------------------------");

		// Consumer<T>
		// 리턴을 하지 않고 (void) 인자를 받는 메서드를 갖고 있다.
		// 인자를 받아 소모함

		Consumer<String> c = str -> System.out.println(str);
		c.accept("Hello Lamda");

		System.out.println("----------------------------");

//		Function<T, R> <인자, 리턴타입>
		Function<String, Integer> f = str -> Integer.parseInt(str); // String을 Integer로 이게 apply()

		int result2 = f.apply("1");
		System.out.println(result2 + 100); // 100을 더하면 101 숫자인지 확인, 문자1이 리턴되었다면 1100이 됨

//		Predicate<T> : 하나의 인자와 리턴타입을 갖음, 리턴타입을 지정하는 타입 파라미터가 안보임(boolean이라서) -> Function<T, Boolean> 형태와 동일
		Predicate<String> p = str -> str.isEmpty(); // 비어있는지

		boolean result3 = p.test("Hello");

		System.out.println(result3); // 안비어있으므로 false 반환

	}

}
