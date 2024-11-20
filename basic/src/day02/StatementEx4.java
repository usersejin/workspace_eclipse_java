package day02;
import java.io.IOException;

public class StatementEx4 {
	public static void main(String[] args) throws IOException{
		
		// 사용자로부터 값을 입력받아오기
		System.out.println("몇 단?");
		
		// 표준입력장치로부터 값을 입력받아오기 => System.in.read();
		
		int dan = System.in.read();
		// 사용자가 입력한 값 ==> ASCII 코드 값을 숫자로 바꾸려면 어떻게 해야할까?
		
		// 0 : 48 ==> dan 0
		// 1 : 49 ==> dan 1
		// 2 : 50 ==> dan 2
		
		dan -= 48; // 이렇게 해주면 dan 0, dan 1 .. 이런식으로 나온다, 이거 안해주면 1 입력시 아스키코드값이 나옴
					
/* 왜 한자리만 가능하지? -48때문에? ==> System.in.read()가 한자리만 입력받을 수 있음 */
		
		System.out.println("dan : " + dan); // 이걸 쓰려면 예외 던지기(throws IO~), 그걸 또 쓰려면 import 해줘야해
		
		// 화면 : 구구단 5단 출력
		// 반복문 사용
		for(int i=1;i<=9;i++) {
			System.out.println(dan + " * " + i + " = " + (i*dan));
		}
	}

}
