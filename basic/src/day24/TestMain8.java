package day24;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestMain8 {
	public static void main(String[] args) {

		// PlayCard.java 파일 ==> d: 복사
		File f = new File("d:\\PlayCard.java");
		File f2 = new File("d:\\iotest\\PlayCard.java");

		// 읽어서 화면에 출력
		FileReader fr = null;
		FileWriter fw = null;
		int data = 0;

		try {
			fr = new FileReader(f);
			fw = new FileWriter(f2);

			while ((data = fr.read()) != -1) {
				System.out.print((char) data);
				fw.write(data);
			}
			fw.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 자원 반납
			try {
				if (fr != null) {
					fr.close();
				}
				if (fw != null) {
					fw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
