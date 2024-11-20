package day01;
// 2. 산술연산자
// +, -, *, /, %(나머지연산자,mod)

public class OperEx2 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("a + b = "+ a + b);// a+b = 1020이 나옴 
		System.out.println("a + b = "+ a+b); // 이것도 왜? "" 이 문자열이므로 + 가 연결시키는 연산자가 됨
		
		// int 이하의 자료형끼리 연산하면 결과도 int 나옴
		System.out.println("a + b = "+ (a + b));// a+b = 30이 나옴, 연산자 우선순위에 따라 () 붙여준다
		System.out.println("a - b = "+ (a - b));
		System.out.println("a * b = "+ (a * b));
		System.out.println("a / b = "+ (a / b));// 0.5가 나와야하는데 int형이여서 0으로만 출력됨(소수점 이하 잘림)
		System.out.println("a % b = "+ (a % b));
		
		byte b1 = 100;
		byte b2 = 20;
		
		// byte b3 = b1 + b2; // Error: Type mismatch: cannot convert from int to byte
								// int 이하끼리 연산하면 결과는 반드시 int로 나옴
		int b3 = b1 + b2; // 만약 결과값을 byte로 나타내고 싶으면 int b3 = (byte)b1 + b2로 하면 됨
		System.out.println(b3);
	}
}
