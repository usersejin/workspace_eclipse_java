package day06;
// 메서드 오버로딩 한눈에 보기

public class MethodEx07 {
	
	static int plus (int a, int b) {
		return a+b;
	}
	
	static float plus (float a, int b) {
		return a+b;
	}
	
	static String plus (String a, String b) { // 문자열
		return a+b;
	}
	
	public static void main(String[] args) {
		
		int a = 100;
		int b = 200;
		
		int result1 = plus(a,b);
		System.out.println("a : " + a);
		
		float result2 = plus(100.0f, b);
		System.out.println("result2 : " + result2);
		
		String result3 = plus("오늘은 ", "목요일"); // 문자열
		System.out.println("result3: " + result3);
	}

}
