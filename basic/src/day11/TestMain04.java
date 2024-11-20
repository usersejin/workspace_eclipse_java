package day11;

import java.util.Scanner;

public class TestMain04 {

	public static void main(String[] args) {

		// 사용자로부터 문자를 입력받기

		System.out.println("주민등록번호를 입력하세요");
		Scanner sc = new Scanner(System.in); // in은 Scanner(InputStream source)의 InputStream의 in을 지칭함

		String data = sc.next(); // 240101-3111118; // 항상 입력받는 타입으로 생각해야해

		System.out.print(data.substring(0, 2) + "년 " + data.substring(2, 4) + "월 " + data.substring(4, 6) + "일생");

		if (data.charAt(7) == '1' || data.charAt(7) == '3') { // 여기서 한 문자이므로 단일인용부호사용해야 해
			System.out.println(" 남성입니다.");
		} else if (data.charAt(7) == '2' || data.charAt(7) == '4') {
			System.out.println(" 여성입니다.");
		}

		System.out.println(data);

		// 24년 01월 01일생 남성입니다.
	}

}
