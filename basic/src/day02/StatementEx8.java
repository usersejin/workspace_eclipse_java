package day02;

public class StatementEx8 {
	public static void main(String[] args) {
		
		// 구구단 2단 출력 (for문 사용 초기식 변수는 i)
		for(int j=1; j<=3; j++) {
			for (int i=1; i<=9; i++) {
				System.out.println(j+ " * "+ i + " = " + (i*2) );
			}
		}
		
//		for (int i =1;i<=9;i++) {
//			System.out.println("3 * "+ i + " = " + (i*3) );
//		}
//		for (int i =1;i<=9;i++) {
//			System.out.println("4 * "+ i + " = " + (i*4) );
//		}
	}
}
