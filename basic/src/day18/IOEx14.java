package day18;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PipedWriter;
import java.io.PrintWriter;

// 다양한 자료형 쓰기
public class IOEx14 {
	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("d:\\dev\\print2.txt");

		BufferedWriter bw = new BufferedWriter(fw);

		PrintWriter pw = new PrintWriter(bw);

		pw.println("다양한 자료형에 대해 저장");
		pw.println("엔터가 자동으로 포함되어 있음");

		pw.println(100);
		pw.println(200.0f);

		pw.flush();

	}

}
