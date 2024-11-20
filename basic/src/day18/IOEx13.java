package day18;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

// ** Object PrintStream
public class IOEx13 {
	public static void main(String[] args) throws FileNotFoundException {

		int a = 100;
		float b = 200.0f;
		String c = "hello";

		System.out.println(a); // System.out 표준 출력 스트림 <-> System.in 표준 입력 스트림

		FileOutputStream fos = new FileOutputStream("d:\\dev\\print.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		PrintStream ps = new PrintStream(bos);

		ps.println(a); // 다양한 자료형에 대해 출력 가능
		ps.println(b);
		ps.println(c);

		ps.flush();
	}

}
