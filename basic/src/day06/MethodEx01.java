package day06;
// 메서드 시작

public class MethodEx01 {

	// method : 이름()
	static void printGuGuDan(int dan) { // dan실행할 때 값이 자동으로 전달되는 변수
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
	}

	// int cnt : 매개변수, 인자, 아큐먼트 (자료형 변수명, 자료형 변수명...)
	static void printStar(int cnt) {
		String str = "";
		for (int i = 1; i <= cnt; i++) {
			str += "*";
			System.out.println(str);
		}
	}

	// a의 배수 출력하는 printMultiple
	static void printMultiple(int a) {
		for (int i = 1; i <= 30; i++) {
			if (i % a == 0)
				System.out.println(i);
		}
	}

	public static void main(String[] args) {

		// 구구단 3단 출력

		// 2. 이 코드를 자주 사용하니 독립시켜주자. 이름: printGuGuDan

		// 3. 메인 메서드에서 이 코드를 4번 불러서 실행시켜보자
		printGuGuDan(3);
		printGuGuDan(6);
		printGuGuDan(9);

		System.out.println("----------------------------");

		// for문 한번만 이용해서
		// *
		// **
		// ***
		// ****
		// *****

		// printStar

		printStar(3);
		printStar(5);
		printStar(7);

		System.out.println("----------------------------");

		printMultiple(3); // 1부터 30 사이의 3의 배수 출력
		printMultiple(5); // 1부터 30 사이의 5의 배수 출력
	}
}
