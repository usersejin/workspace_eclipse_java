package day17;

import java.io.File;
import java.io.IOException;

public class FileEx {
	public static void main(String[] args) throws IOException {

		// 그냥 \ 이면 특수문자로 인식해서 \\ 두개 써줘야 함
		String str = new String("d:\\");
		File f = new File(str);

		System.out.println();

//		File f1 = new File("d:\\m.txt");
		File f1 = new File("d:\\test");

		System.out.println(f1.exists() ? "파일 있음" : "파일 없음"); // 해당 경로에 파일 있없을 볼 수 있음

		if (!f1.exists()) {
			f1.createNewFile(); // 존재하지 않으면 파일을 만들어 -> 예외처리 해줘야함
			System.out.println("파일을 생성합니다.");

		} else {
			System.out.println("파일이 존재합니다.");
		}
		System.out.println("---------------------------");
		// 경로 = 파일이 사는 주소
		// 절대 경로 : 서울시 종로구 ~ => c:\\Hello2.java
		// 상대 경로 : 가장 친한 친구 옆집/윗집 등 => ..\\Hello.java (내가 작업하고 있는 경로에서 어디어디)

		String path = f1.getAbsolutePath(); // 파일에서 절대경로를 가져와
		System.out.println("파일 경로 : " + path);

		File f2 = new File("d:\\dev\\eclipse");

		if (f2.isDirectory()) { // isXXX -> boolean 타입으로 반환
			System.out.println("디렉토리 맞음");
			// 현재 디렉토리의 파일 목록을 배열로 리턴
			String[] list = f2.list(); // 파일들의 목록을 배열로 저장
			// 출력
			for (String x : list) {
				System.out.println(x);
			}
		} else {
			System.out.println("파일임");
		}
	}

}
