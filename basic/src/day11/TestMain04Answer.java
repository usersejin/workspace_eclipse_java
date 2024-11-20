package day11;

import java.util.Scanner;

public class TestMain04Answer {

	public static void main(String[] args) {

		// 사용자로부터 문자를 입력받기

		System.out.println("주민등록번호를 입력하세요");
		Scanner sc = new Scanner(System.in); // in은 Scanner(InputStream source)의 InputStream의 in을 지칭함

		String data = sc.next(); // 240101-3111118; // 항상 입력받는 타입으로 생각해야해

		System.out.println(data.substring(0, 2));
		String year = data.substring(0, 2);
		String month = data.substring(2, 4);
		String day = data.substring(4, 6);
//
//		System.out.println(year);
//		System.out.println(month);
//		System.out.println(day);
		String gender = "중성";
		if (data.substring(7, 8).equals("1") || data.substring(7, 8).equals("3")) {
			gender = "남성";
		} else if (data.substring(7, 8).equals("2") || data.substring(7, 8).equals("4")) {
			gender = "여성";
		}

		System.out.println(year + "년 " + month + "월 " + day + "일생 " + gender + "입니다.");

	}

}
