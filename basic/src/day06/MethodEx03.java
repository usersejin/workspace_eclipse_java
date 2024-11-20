package day06;
// 메서드 오버로딩 

public class MethodEx03 {
	
	// static 돌려줄 자료형 메서드명 (자료형 매개변수, 자료형 매개변수 ... ){
	//		코드1;
	//		코드2;
	//		void : 이 메서드를 실행한 후 호출한 쪽으로 아무값도 리턴할 필요없음
	// 		return 값; : 이 메서드를 실행한 후 호출한 쪽으로 값을 리턴
	
	static int add(int a, int b) {
		return a+b; // 값을 돌려받지 않는 경우는 그냥 사용자정의 함수에서 바로 출력만 할 경우
					// 값을 돌려받고 싶으면 return을 써줘야해
	}
	
	static int minus(int a, int b) { // 매개변수 이름은 마음대로 써도 돼
		return a-b;
	}
	
	static int max(int a, int b) { // 매개변수는 지역변수이므로 이 메서드를 빠져나가면 사라짐
		int max = (a > b) ? a : b; // 삼항연산자를 사용해서 대소비교
		return max;
//		return (a > b) ? a : b; // 이것도 가능해! 
//		if (a>= b) {
//			return a;
//		}else {
//			return b;
//		} // 삼항연산자 대신 이렇게 써도 돼!
	}
	
	static int sum(int a, int b, int c) {
		return a+b+c;
	}
	
//	 	method signature{
//	 			method body
//		}
	
	static int max(int a, float b) { // 반드시 int를 리턴하도록 해야하는데 b는 float타입임.. 
		return (a > b) ? a : (int)b; // int float에서 float 타입이 훨씬 더 큰 공간을 갖음(지수부 + 가수부)
								// 더 작은 int로 그냥 바뀌지 않음 => 명시적 형변환이 필요
//		if (a > b) return a;
//		else return (int) b; 
	}
	
	static float sum(int a, float b, int c) {
		return a+b+c; // 더 큰 자료형(int -> float)으로 자동형변환
	}
	public static void main(String[] args) {
		
//		int a = 100;
//		int b = 200;
		add(100, 200); // 여기까지만 하면 출력되지 않아
		 
		int result = add(100,200);// return값을 담을 변수를 선언해줘야해
		System.out.println("result: " + result); // 걔를 출력
		
		int result2 = add(200, 300);
		System.out.println("result2: " + result2); // 걔를 출력
		
		int result3 = minus(500,200); // 두 수의 차 구하기
		System.out.println("result3: " + result3);
		
		int result4 = max(200,100); // 두 수 중 큰 값을 리턴하는 메서드
		System.out.println("result4: " + result4);
		
		int result5 = sum(100, 200, 300);
		System.out.println("result5: " + result5);
		
		// method명, 매개변수의 자료형, 순서, 개수로 구분
		int result6 = max(100, 200.0f); // 이름 max (int ,float) 인 메서드를 호출해
		System.out.println("result6: " + result6);
		
		float result7 = sum(100, 200.0f, 300);
		System.out.println("result : " + result7); // result7: 600.0이 나올 수 있도록 -> 반환타입이 float

		// 메서드명은 동일하고 매개변수의 순서와 자료형을 다르게 만드는 것
		// method overloading (= 다중정의) ****
	}

}
