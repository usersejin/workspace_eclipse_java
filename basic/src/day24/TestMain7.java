package day24;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import lombok.Locked.Write;

public class TestMain7 {

	public static void main(String[] args) {

		// 파일의 객체
		File f = new File("d:\\Hello.java");

		// 저장할 파일의 객체
		File f2 = new File("d:\\iotest\\Hello2.java");

		// 파일 + 읽기 + char stream (한글처리가 가능한)
		FileReader fr = null;
		// 파일 + 쓰기 + char stream
		FileWriter fw = null;

		try {
			fr = new FileReader(f);
			fw = new FileWriter(f2);

			int data = 0;
			// 파일에서 한글자씩 읽어와서 data 변수에 할당
			// data 의 값이 -1 에 도달하지 않았다면
			while ((data = fr.read()) != -1) {
				System.out.print((char) data); // (char)형변환 후 출력
				fw.write(data);

			}
			// 메모리 버퍼에 있는 내용까지 파일에 쓰기
			fw.flush();

		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
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
