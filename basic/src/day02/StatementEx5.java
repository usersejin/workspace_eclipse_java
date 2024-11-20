package day02;
import java.io.IOException;
// 조건 분기문 : 특정 조건에 따라 다른 문장을 실행시키고자 할 때  
//	if (조건) {
//		문장 1;
//		문장 2;
//	}else if (조건) {
//		문장1;
//		문장2;
//	}else if (조건) {
//		문장 5;
//		문장 6;
//	}else { 
//		문장 7;
//		문장 8;
//	}

// 입력한 숫자가 짝수인지 홀수인지 판단해서 메시지 출력하는 코드 작성
public class StatementEx5 {
	public static void main(String[] args) throws IOException {
		
		System.out.print("한자리 숫자를 입력하세요 : ");
		// System.out.println() : 한줄 출력 + 엔터 포함
		// System.out.print(): 출력, 엔터 없음
		
		// 1. 사용자로부터 숫자를 입력받는다.\
		int value = System.in.read();
		
		System.out.println("value : " + value);
		
		// 2. 이 값을 (ASCII) ==> 숫자로 만든다.
		value -= 48;
		//3. 이 값이 짝수인지 홀수인지 판정
		
		
//		if (value % 2 == 0) { // 짝수라면
//			System.out.println("입력하신 값은 짝수입니다.");
//	}
//		else {
//			System.out.println("입력하신 값은 홀수입니다.");
//	}
		
		
		if (value % 2 == 1) { // 홀수라면
			//4. 화면에 결과를 출력한다.
				System.out.println("입력하신 숫자 " + value + "은/는 홀수입니다.");
		}
			else {
				System.out.println("입력하신 숫자 " + value + "은/는 짝수입니다.");
		}
}
}