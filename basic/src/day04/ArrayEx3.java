package day04;

public class ArrayEx3 {
	public static void main(String[] args) {
		
		// 1. int 배열 a 초기값 10, 50, 30, 40, 60
		int [] a = {10, 50, 30, 40, 60};
		
		// 2. int 배열 b 초기값 20, 10, 90, 120, 160
		int [] b = {20, 10, 90, 120, 160};
		
		// 3. int 배열 c를 만들고
		int [] c; // 배열 변수 c 선언
		c = new int [5]; // c에 칸 할당
		
		// 여기서 두 배열의 요소값의 합을 할당, c [0] = 30 이런 식으로
		for (int i = 0; i < c.length; i++) {
			c[i] = a[i] + b[i];
			
			// 반복문을 사용해서 c의 배열을 모든 요소를 화면에 출력
			System.out.println("c[" + i + "] = " + c[i]);
		}
		
	}

}
