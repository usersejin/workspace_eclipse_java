package day25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestMain2 {
	public static void main(String[] args) throws IOException {

		// 키보드 입력값을 d:\\iotest2\\log.txt 파일롷 생성
		System.out.println("아무값이나 입력하시오(종료 ctrl+z) : ");
		// System.in ==> 키보드
//		int data = 0;
//		while((data = System.in.read()) != -1) {
//			System.out.println(data);
//		}
		
		
/*		2. BufferedInputStream 사용 -> 한글지원 X
		BufferedInputStream bis = new BufferedInputStream(System.in);

		int data = 0;
		while ((data = bis.read()) != -1) { // bis.read() : bis를 통해서 읽어옴
			System.out.println((char)data);
 		}
*/		
		File f = new File("d:\\iotest2\\log.txt");
		
		// 3. Bridge Stream -> 한글지원 O
		// 다리 역할
		InputStreamReader isr = new InputStreamReader(System.in);
		// 브릿지로 byte에서 char로 갔으므로 굳이 OutputStreamWriter을 쓰지 않아도 돼
		// FileWriter 로 file 객체 생성
		FileWriter fw = new FileWriter(f); 
		
		
		// 버퍼 사용
		BufferedReader br = new BufferedReader(isr);
		BufferedWriter bw = new BufferedWriter(fw);
		
		// 4. 다양한 자료형을 출력하기 위해서 PrintWrite
		PrintWriter pw = new PrintWriter(bw);
		
		// 이런식으로 사용해도 됨
//		PrintWriter pw = new PrintWriter(
//							new BufferedWriter(
//									new FileWriter(
//											new File("d:\\iotest2\\log.txt"))));
		
		String data = "";
		
		
		while((data = br.readLine()) != null) {
			System.out.println(data);
			pw.write(data);
		}
		pw.flush();
		
	}

}
