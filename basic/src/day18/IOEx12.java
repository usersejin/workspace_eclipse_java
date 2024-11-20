package day18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
// ** 역직렬화 

public class IOEx12 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// 역직렬화 : 바이트 스트림을 다시 객체로 복원하는 과정
		FileInputStream fis = new FileInputStream("d:\\dev\\Member.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Object obj = ois.readObject();

//		System.out.println(obj.toString()); // 참조값 출력

		Member m2 = (Member) obj; // 멤버클래스로 형변환

		System.out.println("이름 : " + m2.getName());
		System.out.println("아이디 : " + m2.getId());
		System.out.println("PW : " + m2.getPw());
		System.out.println("주소 : " + m2.getAddrs());
		System.out.println("email : " + m2.getEmail());
		System.out.println("나이 : " + m2.getAge());
	}
}
