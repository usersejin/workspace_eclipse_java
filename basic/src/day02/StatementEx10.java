// 태어난 년도를 입력받고 무슨 띠인지 판별

package day02;

import java.util.Scanner;

public class StatementEx10 {
	public static void main(String[] args) {
		
		// 띠: 12간지
		// 자 축 인 묘 진 사 오 미 신 유 술 해
		// 쥐 소 호 토 용 뱀 말 양 원 닭 개 돼
		// 4  5  6 7  8 9 10 11 0  1  2  3
		// 모든 연도를 12가지로 분류, 12로 나눈 나머지가 무엇인지를 갖고 띠 판별
		
		// 1. 태어난 연도 4자리 숫자를 입력받음
		System.out.println("태어난 연도 4자리 숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		System.out.println("입력한 수 : " + year);
		
		// 2. 입력받은 숫자를 12로 나눈 나머지를 구함
		//		짝수 홀수 3의 배수
		int result = year%12;
		System.out.println("result : " + result);
		
		// 이건 내가 그냥 한거..
		System.out.println("당신의 나이는 만" + (2024-year) + "세 입니다.");
		
		//3. 판별에 따른 메시지 출력 (당신은 2024년생으로 용띠 입니다.)
		switch(result) {
		case 4:
			System.out.println("당신은 " + year + "년생으로 " + "쥐띠입니다.");
			break;
		case 5:
			System.out.println("당신은 " + year + "년생으로 " + "소띠입니다.");
			break;
		case 6:
			System.out.println("당신은 " + year + "년생으로 " + "호랑이띠입니다.");
			break;
		case 7:
			System.out.println("당신은 " + year + "년생으로 " + "토끼띠입니다.");
			break;
		case 8:
			System.out.println("당신은 " + year + "년생으로 " + "용띠입니다.");
			break;
		case 9:
			System.out.println("당신은 " + year + "년생으로 " + "뱀띠입니다.");
			break;
		case 10:
			System.out.println("당신은 " + year + "년생으로 " + "말띠입니다.");
			break;
		case 11:
			System.out.println("당신은 " + year + "년생으로 " + "양띠입니다.");
			break;
		case 0:
			System.out.println("당신은 " + year + "년생으로 " + "원띠입니다.");
			break;
		case 1:
			System.out.println("당신은 " + year + "년생으로 " + "닭띠입니다.");
			break;
		case 2:
			System.out.println("당신은 " + year + "년생으로 " + "개띠입니다.");
			break;
		case 3:
			System.out.println("당신은 " + year + "년생으로 " + "돼지띠입니다.");
		}
	}
	
}
