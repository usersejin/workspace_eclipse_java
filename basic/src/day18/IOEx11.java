package day18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// ** ObjectInput/OutputStream
// 직렬화 
public class IOEx11 {
	public static void main(String[] args) throws IOException {

		// Member 객체 생성 -> d:\\dev\\Member.txt 파일에 저장
		Member m1 = new Member("aaa", "bbb", "홍길동", "율도국", "hong@gmail.com", 20);
		// 객체 직렬화 : 객체를 저장하거나 전송할 수 있도록 객체의 상태를 바이트 스트림으로 변환하는 과정
		// 객체 직렬화 방법 참조하는 클래스 뒤에 implements Serializable -> 해주면 직렬화, 역직렬화 자동으로 가능

		FileOutputStream fos = new FileOutputStream("d:\\dev\\Member.txt");

		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(m1); // 직렬화 한 객체들만 저장할 수 있음

	}

}
