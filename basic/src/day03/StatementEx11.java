package day03;

public class StatementEx11 {
	public static void main(String[] args) {
		
		// 오늘 날짜 출력 : 년 월 일 변수 사용해서 출력
		
		int year = 2024;
		int month = 9;
		int day = 11;
		
		// 오늘은 2024년 9월 11일 입니다.
		
		System.out.println("오늘은 " + year + "년 " + month + "월 " + day + "일 입니다.");
		System.out.printf("오늘은 %d년 %d월 %d일 입니다.\n", year, month, day);
		
		// 첫번째 인수값에 출력형식 지정
		// 두번째 자리부터 값을 차례대로 할당
		// %d: 정수, %b: 논리, %c: 문자, %f: 실수, %s: 문자열을 의미
		// %n, \n: 개행문자
		
		
		// 한국 시간은 10시 50분 20초 입니다.
		// 한국, 10, 50,20은 변수
		
		
		String region = "한국"; // 문자열을 나타내는 String, 한 문자는 char
		int hour = 10;
		int min = 50;
		int sec = 20;
		
		// println
		System.out.println(region + " 시간은 " + hour + "시 " + min + "분 " + sec + "초 입니다." );
		
		// printf
		System.out.printf("%s 시간은 %d시 %d분 %d초 입니다.", region, hour, min, sec);
		
	}
}
