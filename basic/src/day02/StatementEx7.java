package day02;
import java.util.Scanner;

public class StatementEx7 {
	public static void main(String[] args) {
		
		System.out.println("성적입력: ");
		
		// 사용자로부터 값을 입력받는 두번째 방법
		// Scanner
		Scanner sc = new Scanner(System.in);
		// sc.nextIn(); // 항상 정수값을 입력받음. ASCII코드값이 아닌 숫자, 한자리뿐만 아니라 여러자리 숫자 입력 받기 가능
		int score = sc.nextInt();
		System.out.println("score: " + score);
		
		if (score >= 90) {
			System.out.println("A학점");
		}else if (score >= 80) {
			System.out.println("B학점");
		}else if (score >= 70) {
			System.out.println("C학점");
		}else if (score >= 60) {
			System.out.println("D학점");
		}else
			System.out.println("F학점");
		}
}