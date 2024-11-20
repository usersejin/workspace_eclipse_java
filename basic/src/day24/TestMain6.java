package day24;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestMain6 {
	public static void main(String[] args) throws IOException {

		File f = new File("d:\\Hello.java");
		File f2 = new File("d:\\iotest\\Hello.java");

		FileInputStream fis = new FileInputStream(f);
		FileOutputStream fos = new FileOutputStream(f2);

		int data = -1;

		while ((data = fis.read()) != -1) {
			System.out.print((char)data);
			fos.write(data);
		}
		System.out.println();
	}

}

