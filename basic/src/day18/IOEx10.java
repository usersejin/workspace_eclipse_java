package day18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOEx10 {
	public static void main(String[] args) throws IOException {

		// d:\\dev\\test.txt : Hello java IO world 만세

		// 1. File 객체 생성
		File f1 = new File("d:\\dev\\test.txt");

		// 2. File + char Stream 계열 쓰기 클래스
		FileWriter fw = new FileWriter(f1);

		// 3. 버퍼 + char Stream 계열 쓰기 클래스
		BufferedWriter bw = new BufferedWriter(fw);

		// 4. 문자를 저장
		bw.write(" Hello java IO world 만세");
		bw.flush();

		// 5. File 객체 저장
		File f2 = new File("d:\\dev\\test.txt");

		// 6. File + char Stream 계열 읽기 클래스
		FileReader fr = new FileReader(f2);

		// 7. 버퍼 + char Stream 계열 읽기 클래스
		BufferedReader br = new BufferedReader(fr);

		// 8. 읽어오기
		String data = br.readLine();

		// 9. 읽어온 것을 콘솔에 룰력
		System.out.println(data);
	}

}
