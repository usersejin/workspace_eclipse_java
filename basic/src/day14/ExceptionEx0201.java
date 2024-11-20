package day14;

// 이 메서드를 사용하는 사람이 자신의 환경에 맞게 이 예외를 처리하도록 전가

import javax.swing.JOptionPane;

public class ExceptionEx0201 {
	
	static int plus(String a, String b) throws NumberFormatException { // 이 메서드는 이 예외가 발생할 수 있다고 알려줌, 예외를 처리하도록 전가
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
