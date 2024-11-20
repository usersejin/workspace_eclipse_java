package day14;

import java.util.Random;

// ** 예외 처리하기
// 1. ERROR : 치명적 오류 (개발자 해결 불가능)
// 2. Exception : 가벼운 오류 (개발자 해결 가능)
// 2-1. 예외 처리 : try-catch -> case by case로 위에서부터 순차적으로 비교
// 2-2. 예외 전가 : throws 예외명 -> 다른 사람이 정의해서 사용할 수 있도록 전가

// API 문서에서 Runtime exception에서 나올 수 있는 예외 확인하기 -> Direct Known Subclasses:
// https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/RuntimeException.html

public class ExceptionEx01 {
	public static void main(String[] args) {

		Random rnd = new Random();

		try { // 예외가 있을법한 지역을 try로 묶음
			int a = 100;

			// 0과 10미만의 양의 정수 구하기
			int b = rnd.nextInt(10); // 21억 사이의 랜덤값, 0부터 임의의 수 a 미만의 랜덤값을 얻고 싶다면 rnd.nextInt(a) 하면 됨

			System.out.println(a / b); // 0으로 나누면 런타임 오류 (0으로 나눌 수 없으니까..) -> 예외 처리 필요

			System.out.println(a + "를 " + b + "로 나눈 값");

			Object obj = null;
			obj.toString(); // Null Pointer Exception 발생
			System.out.println("예외가 발생하면 이 부분은 실행이 되지 않음");

		} catch (ArithmeticException ae) { // try에서 예외 발생하면 catch 실행 -> 위에서부터 순차적으로 비교검사

			System.out.println("ArithmeticException 발생하면 이 부분의 코드가 실행됨");

		} catch (NullPointerException npe) {

			System.out.println("널 포인트 예외 발생");

		} catch (Exception e) { // 위의 Exception에도 안 걸렸던 것들이 여기서 걸리게 함 모든 Exception의 조상인 Exception -> 제일 마지막에 적어야 좋음

			System.out.println("모든 예외는 여기서 다 걸림");
			System.out.println("이건 나도 모르는 Exception");
			e.printStackTrace(); // 지금 스택을 추적해서 출력

		}

	}

}
