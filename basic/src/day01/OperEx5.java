package day01;
// 5. 비트 연산자 : 비트 단위로 연산
// boolean : true: 1, false: 0
// and: &, or: |

public class OperEx5 {
	public static void main(String[] args) {
		byte a = 10; // 2진수 : 0000 1010
		byte b = 22; // 2진수 : 0001 0110
		//-----------------------------------------------
		// and				   0000 0010 (위 아래 한 비트씩 비교) -> 2가 됨
		// false and false(true) ==> false
		// only true and true ==> true
		
		System.out.println("a & b : " + (a & b)); // 2가 출력됨
		
		// or 
		System.out.println("a | b : " + (a | b)); // 00001 1110(16+8+4+2=30)가 출력됨
		
	}
}
