package day17;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx2 {
	public static void main(String[] args) throws IOException {

		byte[] b = { 'j', 'a', 'v', 'a' };

		File f = new File("d:\\javaout.txt");

		// OutputStream -> 자바에서 외부로 내보내는 전용 클래스

		// FileoutputStream
		FileOutputStream fos = new FileOutputStream(f);

		fos.write(112); // 아스키코드 p -> 112;
		fos.write(b);
	}

}
