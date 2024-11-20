package day11;

public class StringEx01 {
	public static void main(String[] args) {

		String str1 = new String("java");
		String str2 = new String("java"); // new 를 통해서 새로운 객체 선언 -> 둘이 다르게 선언

		if (str1 == str2) {
			System.out.println("동일 객체");
		} else {
			System.out.println("다른 객체");
		}

		if (str1.equals(str2)) {
			System.out.println("동일한 문자열");
		} else {
			System.out.println("다른 문자열");
		}

		// Object 클래스 : equals() 동일 객체인지 참조를 비교
		// String 클래스 : equals() override method 된 것으로 내용 비교

		System.out.println("-------------------------------------");

		System.out.println("str1 : " + str1);
		System.out.println("str1.toString() : " + str1.toString());

		// object 클래스의 toString() 처럼 쓰려면

		System.out.println(str1.getClass().getName() + '@' + Integer.toHexString(str1.hashCode()));

		System.out.println("-------------------------------------");

		// String 은 클래스여서 new 를 선언해야하지만 예외적으로 선언하지 않고 primitive type 처럼 사용할 수 있는 클래스

		// char[] ==>

		String str3 = "java";
		String str4 = "java"; // 객체를 선언한게 아니라 동일한 값을 할당했기 때문에 -> 결국엔 같은 객체(같은 주소값)를 가리키고 있는 것
								// 자바는 같은 문자열을 가리키게 하면 같은 참조값을 할당하게 함

		System.out.println(str3);
		System.out.println(str4);

		// String 은 불변(immutable)의 객체 -> 할당하면 새로 만들어
		// 만약 String str3 = "oracle";
		// str3 = "JSP"; 라고 하면 값을 바꾸는게 아니라 JSP를 저장하고 있는 새로운 공간을 만들어
		// 최초 한번 생성되면 그 값이 변하지 않는다.

		if (str3 == str4) {
			System.out.println("동일 객체");
		} else {
			System.out.println("다른 객체");
		}

		if (str3.equals(str4)) {
			System.out.println("동일한 문자열");
		} else {
			System.out.println("다른 문자열");
		}

//		str3 = "oracle"; // 다른 값을 할당하게 되면 새로운 참조값을 가진 공간을 만든다.
//		
//		System.out.println(str3); // 따라서 출력에서는 oracle 이 출력됨
//		System.out.println(str4);

//		String str = "*";
//
//		for (int i = 1; i <= 100; i++) {
//			str += "*";
//			System.out.println(str); // for문이 한번 돌때마다 새로운 저장공간이 생기는 거야
//		}
	}

}
