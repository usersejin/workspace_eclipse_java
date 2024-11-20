package day18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// ** BufferedReader, BufferedWriter 활용

public class IOEx6 {
	public static void main(String[] args) throws IOException {
		// Hello6.java 파일에 저장
		File f1 = new File("d:\\Hello.java");
		File f2 = new File("d:\\Hello6.java");

		FileReader fr = new FileReader(f1);
		FileWriter fw = new FileWriter(f2);

		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw); // writer 객체와 그 후손을 매개변수로 갖음

		String data = "";
		while ((data = br.readLine()) != null) { // read() 는 -1을 리턴하지만 readline()은 null을 반환
			System.out.println(data);
			bw.write(data);
		}
		bw.flush();
	}

}
