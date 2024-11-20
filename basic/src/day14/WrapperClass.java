package day14;

// 객체지향언어 -> 모든 것을 객체로 처리
// OOP

//primitive type 을 객체로 만들기 위해 Wrapper class 를 사용
//byte -> Byte 클래스 , long -> Long 클래스, int -> Integer 클래스, char -> Character 클래스 ...
public class WrapperClass {
	public static void main(String[] args) {

		int a = 10;

		// Wrapper Class
		// primitive type 변수 ==> 객체로 전환하기 위한 클래스

		// int ==> Integer
		// byte ==> Byte

		// int의 최대값, 최소값
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);

		// 10의 이진수값
		System.out.println(Integer.toBinaryString(10)); // 10을 이진수 형태로 만들어줌

		Integer it1 = new Integer(10); // deprecated 되는 것이여서 중간줄 그어져있어..

		int b = it1.intValue(); // 객체가 갖고있던 정수값을 int형으로 변환해서 반환

		System.out.println("b : " + b);

		System.out.println("------------------------");

		// int c = it1;

		String str = "java"; // 얘가 예외적으로 클래스임에도(new 생성해야하는건데) primitive 타입처럼 쓴거임

		Integer it2 = 20; // boxing : 애도 원래는 new 해야하는데 예외적으로 가능하게 함 String 처럼
		// int c = it2.intValue(); 를 아래처럼 쓸 수 있게 함
		int c = it2; // unboxing

		// 20의 이진수 값을 구하기
		System.out.println(Integer.toBinaryString(20));

		// 문자 300을 숫자로 가져오기

		int d = Integer.parseInt("300"); // 문자 300을 정수형으로 바꿔줌
		System.out.println(++d);

		// byte 127값을 Wrapper class b1으로 전환
		Byte b1 = 127;
		// 이 값을 long형으로 형변환해서 출력
		long f = b1.longValue();
		System.out.println(f);

	}
}
