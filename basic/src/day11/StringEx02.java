package day11;

public class StringEx02 {
	public static void main(String[] args) {
		// char[] 배열을 클래스로 만들어 놓을 것

		String str = "java oracle";

		// 4번째 문자( 인덱스는 0부터 )
		char ch = str.charAt(3); // 0부터 시작하므로,
		System.out.println("4번째 문자 : " + ch);

		// 2번째 3번째 문자를 붙여서 출력
//		char ch1 = str.charAt(1);
//		char ch2 = str.charAt(2);
//		System.out.print(ch1);
//		System.out.println(ch2);

		System.out.println("" + str.charAt(1) + str.charAt(2));

		System.out.println("----------------------");

		// 문자열 연결
		// concat()
		String str2 = "월요일";
		String str3 = "화요일";
		String str4 = str2.concat(str3);
//		String str4 = str2 + str3; // 두 문자열 연결하는 + 연산자도 가능
		System.out.println(str4); // 월요일화요일 출력하게 하기

		String str5 = "수요일";
		String str6 = str4 + str5;

		System.out.println("str6 : " + str6);

		System.out.println("----------------------");

		"월요일".concat("화요일"); // 변수에 안 담았어도 "" 이 문자열이기 때문에 concat 에 의한 연결이 가능하다

		System.out.println("월요일".concat("화요일"));
		System.out.println("월요일".concat("화요일").concat("수요일"));
		// 메서드 체이닝(chain)

		// 괄호 안에 있는 내용(해당 문자열)이 들어있는지 여부를 boolean 타입으로 반환
		boolean flag = str.contains("java");
		System.out.println(flag);

		// equals 대소문자 구별함 -> 의미를 비교하는게 아니니까...
		System.out.println(str.equals("JAVA ORACLE"));

		System.out.println(str.equalsIgnoreCase("JAVA ORACLE")); // 대소문자 구별하지 않고 비교

		// 특정문자의 위치를 리턴받을 때
		int position = str.indexOf('r');
		System.out.println("r글자의 위치는 : " + position); // 인덱스 번호로 반환

		// 문자열의 길이
		System.out.println(str.length());

		// 글자를 역순으로 출력

		// 몇번 째 글자인지 가져올 수 있는 charAt()

		// 마지막 위치에서 글자를 먼저 출력
		System.out.println("---------------------");

		for (int i = (str.length() - 1); i >= 0; i--) {
			System.out.print(str.charAt(i)); // 내부적으로 배열로 되어있기 때문에 가능함
		}

		// 문자열 char 배열로 리턴하는 메서드

		char[] ch2 = str.toCharArray();

		for (int i = 0; i < ch2.length; i++) {
			System.out.println(ch2[i]);
		}
		System.out.println();
		System.out.println("----------------------");

		// 문자열 반환
		int a = 10;
		int b = 20;
		// 둘의 덧셈값
		System.out.println(a + b); //
		System.out.println("a + b : " + (a + b)); // 실행결과 30
		System.out.println("a + b : " + a + b); // 실행결과 1020

		// 첫번째 글자 가져오기
		// 정수형을 String 문자열로 변환하는 방법 3가지
		// 첫번째 방법 ""(이중부호 사용)
		String str7 = "" + a;
		System.out.println(str7);
		System.out.println(str7.charAt(0));

		System.out.println("-----------------------");
		
		// 두번째 방법 valueOf() 사용
		String str8 = String.valueOf(a); 
		System.out.println(str8.charAt(0));

		System.out.println("-----------------------");
		System.out.println(str.substring(2, 6));
		System.out.println("2번째부터 6번째 전까지 글자");

		System.out.println(str.substring(4)); // 안쓰면 끝까지
		System.out.println("4번째부터 끝까지");

		// id + @ domain : id만 추출

		String email = "dagda@hanafos.com";
		int position1 = email.indexOf('@');
		System.out.println(email.substring(0, position1));
		System.out.println(email.substring(0, email.indexOf('@'))); // 중첩으로 나타낼 수 있음

		String friendList = "aaa,bbb,ccc,ddd"; // 친구 아이디

		String[] list = friendList.split(","); // friendList[0] = aaa, friendList[1] = bbb,.. 이런식으로 배열에 저장됨

		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}

		System.out.println("----------------------");
		for (String x : list) { // 향상된 for문 -> 끝까지 훑음
			System.out.println(x);
		}

	}

}
