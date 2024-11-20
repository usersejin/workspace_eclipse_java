package day06;
// 메서드와 값의 복사와 전달
// 값에 의한 호출(call by value)
public class MethodEx04 {
	
	static void print(int c, int d) {
		System.out.println("메서드 안쪽 변수 c: " + c + ", d: " + d);
		c++;
		System.out.println("메서드 안쪽 변수 c: " + c + ", d: " + d);
		
	} // return이 없으면 메서드가 끝나면 c와 d는 사라짐 -> 호출한 쪽으로 값을 가져오지 못함
	  // 원본에는 영향이 없음
	  // 변수의 이름이 main 메서드의 변수명과 같아도 같은 결과
	  // 즉 값에 의한 호출 => main메서드의 값을 복사해서 매개변수에 전달함
	
	public static void main(String[] args) {
		
		int a = 100;
		int b = 200;
		
		
		a++;
		
		System.out.println("a : " + a + ", b : " + b); 
		
		print(a, b);
		
		System.out.println("메서드 실행 후 => a : " + a + ", b : " + b);
	}

}
