package day02;

public class StatementEx2 {
	public static void main(String[] args) {
		// 1부터 100 사이의 누적값을 계산해서 출력
		// 누적합을 담을 변수 선언(i는 바뀌는 값이므로)
		int sum = 0; 
		for (int i = 1;i <=10;i++) {
			// for 초기식에서 사용되는 수 : 지역변수
			// 반복문이 사용될 동안만 존재하는 변수
			sum += i; // sum = sum + i;
			// 반복할 문장
			
			System.out.println("i : " + i + ", sum = " + sum);
		}
		
//		 System.out.println("i : " + i); // i는 for문에 있는 지역변수이므로 인식 불가
	}
}
