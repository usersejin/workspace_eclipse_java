package day01;
// 변수 : 자료처리를 위한 이름이 부여된 메모리 영역

// 1byte = 8bit

// bit : 1과 0값을 담을만한 크기를 갖는 공간

// 기본형 변수(primitive type)
// 정수형 변수: byte - short - int - long
// 실수형 변수: 			   float - double
// 문자형 변수:		char
// 논리형 변수: boolean
public class VarEx1 {
	public static void main(String[] args) {
		// 변수선언 [ 자료형 변수명; ]
		// 10이라는 숫자를 저장
		
		byte b1; // byte 크기의 메모리 공간을 확보하고 이 공간의 이름을 b1이라고 하자
		
		b1 = 10; // = 대입연산자, 할당연산자
		// b1 변수에 10의 값을 대입해
		
		// 화면에 b1 변수의 값을 출력
		System.out.println("b1 :" + b1);
		//////////////////////////////////////////
		// c1 이라는 byte 크기의 변수 선언
		byte c1;
		// c1에 100의 값을 대입
		c1 = 100;
		// c1변수 출력
		System.out.println("c1 : " + c1);
	
		// 변수는 변하는 수
		// b1 변수에 50의 값을 대입
		b1 = 50; // 기존에 있던 값을 덮어씀
		// b1의 값을 화면에 출력
		System.out.println("b1 : " + b1);
		
		// 변수를 선언하자마자 127의 값을 대입해(초기화)
		byte d1 = -128;
		
		//short 크기의 변수 k를 선언하고 5000 값 대입
		short k = 5000;
		
		//출력
		System.out.println("k : " + k);
		
		// 초기화 [ 자료형 변수명 = 상수;]
		// 상수는 항상 동일한 값을 갖는 수
		// 상수형은 변수형과 동일
		// int이하의 자료인 경우엔 int 타입
		
		long t = 300L; // 변수타입이 long일 경우 대문자 L을 써준다
		
		
		
		// int  long  
		
		// 실수형 변수 : float, double
		// 아메바의 크기는?
		
		// 3129 ==> 3.129 * 10^3
		// 부동소수점 : 소수점을 이동시켜 수를 표현 [0(부호) + 지수부 + 가수부]
		// float(32bit) ===> double (64bit)
		
		
		float f1 = 3.14f;
		System.out.println("f1 : " + f1);
		
		double d2 = 3.25d;
		//실수형의 기본은 : double(default)
		System.out.println("d2 : "+ d2);
		
		double d3 = 3.25;
		System.out.println("d3 : "+ d3);

		// ctl + alt + 아래방향키 해당 문장 아래로 복사
		// alt + 위아래방향키 해당 문장 라인 이동
		System.out.println("Hello world");
		System.out.println("+ 문자열과 문자열을 연결하는 연산자");
	}
}
