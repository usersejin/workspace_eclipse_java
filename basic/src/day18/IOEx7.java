package day18;

import java.io.IOException;

public class IOEx7 {
	public static void main(String[] args) throws IOException {

		// 1. System.in.read()
		// 2. Scanner

		// 키보드로부터 입력받은 값을 화면에 출력
		System.out.print("입력(종료: ctl+z) : ");

		int value = 0;

		while ((value = System.in.read()) != -1) {
			System.out.print(value);
		}
	}
}
