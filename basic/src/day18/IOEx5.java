package day18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// ** BufferedInput/OutputStream

public class IOEx5 {
	public static void main(String[] args) throws IOException {
		// Hello.java ==> Hello5.java 복사
		// f2 : Hello5.java
		File f1 = new File("d:\\Hello.java");
		File f2 = new File("d:\\Hello5.java");

		// 파일에 접근해서 읽어올 수 있는 능력이 있는 클래스(byte Stream)

		FileInputStream fis = new FileInputStream(f1);

		// 파일에 접근해서 읽어올 수 있는 능력이 있는 클래스 (FileOutputStream)
		FileOutputStream fos = new FileOutputStream(f2);

		// FileInputStream 보다 좀 더 빠르게 읽어들이기
		// new BufferedInputStream(fis) : 매개변수로 InputStream 객체와 그의 후손들
		BufferedInputStream bis = new BufferedInputStream(fis); // bis --> 파일 + 버퍼 사용

		// FileOutputStream 보다 좀 더 빠르게 쓰기
		BufferedOutputStream bos = new BufferedOutputStream(fos);

		int value = 0;
		while ((value = bis.read()) != -1) {
			System.out.print((char) value);
			// 쓰기
			bos.write(value);
		}
		bos.flush();

	}

}
