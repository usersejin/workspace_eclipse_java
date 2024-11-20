package day17;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

// java.io.* 패키지
// 자바의 입출력을 추상화한 클래스들의 모음

// 특징 : 느리다. 단방향

// byte Stream 계열 (1바이트씩 읽어오거나 내보내기)

// Input Stream (읽어들이는 클래스의 최상위 추상 클래스)

// OutputStream ( 내보내는 클래들의 최상위 추상 클래스)

public class IOEx1 {
	public static void main(String[] args) throws IOException {

		// InputStream : System.in -> 표준 입력장치(키보드)
//		int value = 0;

		// ctl + z : 종료(-1) -> 누를 때까지 계속 입력을 받음
//		while ((value = System.in.read()) != -1) {
//			System.out.println(value);
//		} // 한 바이트씩 가져옴(byte Stream)

		File f = new File("d:\\Hello.java");

		// InputStream ==> 후손
		// 후손 ==> 자신만의 특별한 기능
		// 파일에 접근할 수 있는 능력: FileInputStream

		FileInputStream fis = new FileInputStream(f);

		int value = 0;
		while ((value = fis.read()) != -1) { // 반복문으로 read()가 -1이 될때까지 한바이트씩 출력하는 메서드임

//		System.out.println(value); // 출력 84 m 파일이 T로 시작해 -> T의 아스키코드 값임

			char c = (char) value;
			System.out.print(c); // 한글은 깨져서 나옴
		}
	}

}
