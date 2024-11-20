package day18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

// ** InputStreamReader 활용

// byte Stream   ==============> 		char Stream
//
// InputStream          					Reader
//				InputStreamReader (InputStream과 Reader의 중간)
// OutputStream    						     Writer

// (기본적인 키보드 입력)System.in(InputStream) >> 한글은 깨지므로 char Stream으로 바꾸고 싶을 때 inputStreamReader가 그 역할을 해줘
//										An InputStreamReader is a bridge from byte streams to character streams
public class IOEx8 {
	public static void main(String[] args) throws IOException {

		System.out.print("입력(종료: ctl+z) : ");

		File f1 = new File("d:\\dev\\keyboard.txt");

		FileWriter fw = new FileWriter(f1);
		BufferedWriter bw = new BufferedWriter(fw);

		InputStreamReader isr = new InputStreamReader(System.in); // InputStream 을 CharStream으로 바꿈

		// 속도를 빠르게 하기 위해서 버퍼 사용
		BufferedReader br = new BufferedReader(isr);

		String msg = null;

		while ((msg = br.readLine()) != null) {
			System.out.println(msg);
			bw.write(msg + "\n"); // 엔터를 저장하지 않아서 해줘야해

		}

//		bw.write("하하하하 호호호호");
		bw.flush();
	}

}
