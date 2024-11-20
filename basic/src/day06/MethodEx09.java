package day06;
// 같은 타입의 매개변수의 개수가 변함 -> 가변인자

public class MethodEx09 {
	
	// 가변 인자 지원 (int ... data)
	static int avg(int ... data ) { // int 타입의 인자가 여러개 올 수 있어 -> 배열처럼 받음
		System.out.println("data" + data); 
		int sum = 0;
		for (int i = 0; i < data.length; i++) { // 따라서 data를 배열처럼 취급, 사용할 수 있음
			sum += data[i];
		}
		return sum/data.length;
	}
	
//	static int avg (int a, int b) {
//		return (a+b)/2;
//	}
//	
//	static int avg (int a, int b, int c) {
//		return (a+b+c)/3;
//	}
//	
//	static int avg(int a, int b, int c, int d) {
//		return (a+b+c+d)/4;
//	}
	public static void main(String[] args) {
		
		int result1 = avg(100, 200);
		int result2 = avg(100, 200, 300);
		int result3 = avg(100, 200, 300, 400);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
	}
	
}
