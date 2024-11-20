package day06;
// 참조에 의한 호출(call by reference) like 집 열쇠 빌려주기

public class MethodEx05 {
	
	static void getSum(int[] m) { // 매개변수로 배열의 참조변수도 전달이 가능
		// getSum 메서드 내부 m
		System.out.println( "getSum 메서드 내부 m : " + m);
		
		System.out.println( "m[0] : " + m[0]);
		
		m[0] = 200; // 참조값을 주면 배열의 원소값도 변경이 가능하다 (값에의한 호출로는 안됨)
//		System.out.println( "m[0] : " + m[0]);
		
		int sum = 0;
		
		for (int i=0; i<m.length; i++) {
			sum += m[i];
		}
		System.out.println("합계 : " + sum);
		
	} // 끝나면 메서드의 해당변수는 사라지지만 변경된 원소값은 그대로 남음
	
	
	
	public static void main(String[] args) {
	
		int [] m = {23, 53, 22, 11, 66, 77, 88, 29};
		
		// sum(100, 20); => 값에 의한 호출(call by value)
		// getSum(m); => 참조에 의한 호출(call by reference)
		System.out.println("메인 메서드 m : " + m);
		
		getSum(m); // 매개변수로 배열의 참조변수도 전달가능 => 참조에 의한 호출
		
		System.out.println( "m[0] : " + m[0]); // m[0] = 200이 나옴
	}
}
