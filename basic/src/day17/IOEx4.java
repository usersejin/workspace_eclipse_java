package day17;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// 한글은 2byte이므로 char Stream 으로 해줘야해 
// read() 메서드명만 같지 내용이 다름

public class IOEx4 {
	public static void main(String[] args) throws IOException {

		// Hello.java ==> Hello3.java 파일 복사.. ---> 이거 집 가서 하기!
		File f1 = new File("d:\\Hello.java");
		File f2 = new File("d:\\\\Hello3.java");

		// 파일에 접근하여 입력할 수 있는 char stream : FileReader
		// 파일에 접근하여 내보낼 수 있는 char stream : FileWriter
		FileReader fr = new FileReader(f1);
		FileWriter fw = new FileWriter(f2);

		int value = 0;
		while ((value = fr.read()) != -1) {
			System.out.print((char) value);
			fw.write(value);
		}
		fw.flush(); // buffer
	}

}
