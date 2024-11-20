package day01;

public class VarEx3 {
	public static void main(String[] args) {
		// 16bit == 2byte
		char c1 = 'a';
		char c2 = 97;  // ASCII code a = 97 에 해당되는 문자를 저장함
		char c3 = '\u0061'; // unicode 
		// A : 65  
		// B : 66
		
		// a : 97
		// b : 98
		// 0 : 48
		// enter : 13 (10)
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);
		
		// java 글자 출력
		char ch1 = 'j'; // 한 글자
		char ch2 = 'a';
		char ch3 = 'v';
		char ch4 = 'a';
		
		System.out.println(ch1+ch2); // 두 j와 a의 아스키코드값을 더해서 보여줌
		System.out.println(""+ch1+ch2+ch3+ch4);// 이렇게 ""로 묶어줘야 문자로 출력됨
		
		String str = "java"; // String 문자열 (primitive type 없어)
		System.out.println(str);
		
		//특수문자 ; 탭, 엔터 등
		// \n : enter
		// \t : tab
		// \b : backspace
		// \\ : 문자 \
		// \' : 문자 '
		// \" : 문자 "
		
		System.out.println("오늘은\n즐거운\t월요일 입니다");
		
		// 오늘은 2024년
		// 9월 (탭 3번) 9일 입니다
		System.out.println("오늘은 2024년\n9월\t\t\t9일 입니다");
		
		
		// boolean : 참, 거짓의 논리값을 저장할 수 있는 자료형
		// 1 byte, 1 bit
		// c언어 1과 0으로 표현 가능
		// 자바 반드시 true, false 로 표현
		
		boolean bl1 = true;
		boolean bl2 = false;
		
		System.out.println("bl1 : " + bl1);
		System.out.println("bl2 : " + bl2);
		
		/////////////////////////////////////////////////////
		
		byte b1 = 10; //127
		byte b2 = 50; 
		
		System.out.println("b1: " + b1);
		System.out.println("b2: " + b2);
		
		short sh1 = 12812; // 32767
		System.out.println("sh1 : " + sh1);
		
		// b1 변수의 값을 sh1 변수에 대입(오른쪽부터 읽음)
		sh1 = b1;
		System.out.println("sh1 : " + sh1 + ", b1 : " + b1);
		
		// 강제 형변환을 하면 데이터의 일부가 손상될 수 있다.
		sh1 = 2;
		
		// b1 = sh1; // Error:  type mismatch: cannot convert from short to byte
		b1 = (byte)sh1; // (바꿀 자료형) 만약에 sh1이 12812 처럼 byte의 범위를 넘어선다면 error 발생
		System.out.println("명시적 형변환");
		System.out.println("sh1 : " + sh1 + ", b1 : " + b1);
		
		
	}
}
