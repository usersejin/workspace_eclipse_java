package day25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestMain1 {
	public static void main(String[] args) {

		// d:\\PlayCard.java ==> d:\\iotest2\\PlayCard.java

		// 1. File
		File f = new File("d:\\PlayCard.java");
		File f2 = new File("d:\\iotest2\\PlayCard2.java");

		FileReader fr;
		FileWriter fw;
		try {
			// 2. 연결통로 (Stream) 파일 + 읽기/쓰기 + char stream
			fr = new FileReader(f);
			fw = new FileWriter(f2);

			// 3. 빠르게 읽기/쓰기
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);

			// 다양한 자료형 편하게 저장하고 싶을 때 : charStream
			// PrintWriter
			PrintWriter pw = new PrintWriter(bw);

			// 4. 읽기/쓰기
			String str = "";
			while ((str = br.readLine()) != null) {
				System.out.println(str);
				pw.print(str);
//				bw.write(str + "\n"); // 한 줄 쓰기

			}
			// 5. flush()
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
