package day15;

import java.util.ArrayList;

// Generic 이 필요한 이유 ArrayList<E>

// Generic 을 사용하면 실행하기 전에 알 수 있음

public class TestMain3 {
	public static void main(String[] args) {
		int[] m = new int[3];

		// 이 ArrayList는 String 전용, 다른 자료형은 들어갈 수 없음
//		ArrayList<String> list = new ArrayList<String>();

		ArrayList list = new ArrayList();

		list.add("딸기");
		list.add("포도");
		list.add("수박");
		list.add(100);
//		Integer it = 100; // 얘 주석 풀면 java.lang.ClassCastException 발생 왜인지는 33행에
//		Object obj = it;
//		list.add(obj); 

		System.out.println("list : " + list);

		// 한개씩 꺼내서 첫글자만 출력
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i); // obj 에는 String의 참조값을 가리키고 있음
//			System.out.println(obj.toString());

			// 앞 한글자씩 출력
			String str = (String) obj; // 자손의 참조변수에 부모의 참조값을 담아(객체 형변환을 통해)
									   // 여기서 Integer 가 걸려, 형제끼리는 형변환 불가
			System.out.println(str.substring(0, 1)); // substring은 String 클래스에만 존재 
													
		}
	}

}
