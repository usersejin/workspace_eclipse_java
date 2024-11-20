package day02;

import java.util.Scanner;

public class StatementEx9 {
	public static void main(String[] args) {
		
		System.out.println("성적을 입력하세요");
		
		Scanner sc = new Scanner(System.in);
//		sc.nextInt(); // 정수값을 입력받을 때
//		sc.next(); // 문자 읽기
		int score = sc.nextInt();
		
//		switch(score) {
//			case 100:
//				System.out.println("A학점");
//				break;
//			case 90: // 95점 같은 경우 case가 정의되어있지 않아 결과값이 안나온다
//					 // 따라서 정확히 case by case가 정해져있어야해
//				System.out.println("B학점");
//				break;
//			case 80:
//				System.out.println("C학점");
//				break;
//			case 70:
//				System.out.println("D학점");
//				break;
//			case 60:
//				System.out.println("F학점");

// n0점대에 학점 부여하기
		switch(score/10) { // (score/10)가 int형이므로 정수로만 나와 90점대~가 가능하다
			case 10:
				System.out.println("A학점");
				break;
			case 9: 
				System.out.println("B학점");
				break;
			case 8:
				System.out.println("C학점");
				break;
			case 7:
				System.out.println("D학점");
				break;
			case 6:
				System.out.println("F학점");
				
		}
	System.out.println("switch ~ case 문 끝");
	}
}
