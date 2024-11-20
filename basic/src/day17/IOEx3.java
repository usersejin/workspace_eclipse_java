package day17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx3 {
	public static void main(String[] args) throws IOException {

		// Hello.java ==> Hello2.java 파일을 생성

		// 1. Hello.java 을 읽어서 화면에 출력
		// 1-1. d:\\Hello.java 파일을 객체 f1으로 생성
		File f1 = new File("d:\\Hello.java");

		File f2 = new File("d:\\Hello2.java");

		// 1-2. FileInputStream 객체를 fis 생성 (f1은 매개변수)
		FileInputStream fis = new FileInputStream(f1);
		FileOutputStream fos = new FileOutputStream(f2);

		// 1-3. 반복문을 사용해서 한바이트씩 읽고 화면에 출력
		int value = 0;
		while ((value = fis.read()) != -1) {
			char c = (char) value;
			System.out.print((char) value);
			fos.write(value); // 파일 생성해서 내용 넣어
		}

	}

}
