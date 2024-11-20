package day14;

import javax.swing.JOptionPane;
// ** try-catch

public class ExceptionEx02 {

	static int plus(String a, String b) {
		// 매개변수는 String -> String + String : + 연결연산자 하면 1020 출력
		// int d = Integer.parseInt(a+b); // 해도 1020 출력됨

		// String -> int로 형변환
		int x = Integer.parseInt(a);
		int y = Integer.parseInt(b);
		return x + y;
	}

	public static void main(String[] args) {

		String a = "10a"; // 만약 "10a" 라고 입력되었다면? -> NumberFormatException로 예외 처리
		String b = "20";

		try {
			int result = 0;
			result = plus(a, b);
			System.out.println("result : " + result); // result : 30

		} catch (NumberFormatException nfe) {
			JOptionPane.showConfirmDialog(null, "숫자 형식이 올바르지 않습니다. 확인해주세요."); // -> 이건 아직 안 배움
			System.out.println("숫자 형식이 올바르지 않습니다."); // 콘솔 화면에 띄울 때
		}
	}

}
