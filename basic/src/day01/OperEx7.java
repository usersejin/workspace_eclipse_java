package day01;
// 삼항 연산자

// 단항 연산자: ++, --
// 이항 연산자: +, -, * / ...
// 삼항 연산자: (조건)? "참":"거짓"
public class OperEx7 {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		// (조건)?"참일 경우의 값":"거짓일 경우의 값"
		
		System.out.println((a>b)?"참":"거짓"); // if 문을 간략하게한 연산자 버전
	}
}
