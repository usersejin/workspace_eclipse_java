package day18;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// ** DataInputStream
public class IOEx9 {
	public static void main(String[] args) throws IOException {

		// 자바의 기본형 자료를 읽고 저장

		// 저장

		FileOutputStream fos = new FileOutputStream("d:\\dev\\dos.txt");

		DataOutputStream dos = new DataOutputStream(fos); // 기능 덧붙이려면 생성자에 참조변수 넣어주면 돼

		dos.writeUTF("홍길동"); // 한글을 쓰고 싶을 때 UTF
		dos.writeInt(20);
		dos.writeFloat(180.0f);
		dos.writeFloat(60.0f);
		dos.writeFloat(60.0f);
		// 성별 : 남 여 : false true
		dos.writeBoolean(false); // 남

		// 읽어오기
		FileInputStream fis = new FileInputStream("d:\\dev\\dos.txt");

		// primitive type 자료를 읽을 수 있는 클래스
		DataInputStream dis = new DataInputStream(fis);

		// 읽을 때는 순서가 중요
		String name = dis.readUTF();
		int age = dis.readInt();
		float height = dis.readFloat();
		float weight = dis.readFloat();
		boolean gender = dis.readBoolean();
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
		System.out.println("성별 : " + ((gender) ? "여자" : "남자"));

	}

}
