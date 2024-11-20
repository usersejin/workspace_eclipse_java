package day14;

import java.io.IOException;

// ** throws~ 예외 던지기(전가)
//발생가능한 예외를(throws ~) 알 수 있는 방법은 API 문서 보면 됨
// https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/InputStream.html#read() 에서 Method Details 의 read 보기

public class ExceptionEx03 {

	public static void main(String[] args) throws IOException {
//		System s; // System API 보려고 작성한 것
		int value;
		try {
			value = System.in.read(); // read(); => IOException을 유발하는 메서드
			System.out.println("value : " + value);
		} catch (IOException ie) {
			System.out.println("입출력 오류가 발생했습니다.");
		} finally { // finally : 예외가 있든 없든 반드시 실행되는 코드
			System.out.println("예외가 있든 없든 반드시 실행되는 코드");
			// IO, network, DB 에서 자원반납하는 코드로 finally를 많이 사용함
		}
	}
}

// 실행하고 값 입력해보기