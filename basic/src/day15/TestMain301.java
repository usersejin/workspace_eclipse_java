package day15;

import java.util.ArrayList;

public class TestMain301 {
	public static void main(String[] args) {
		int[] m = new int[3];

		// 이 ArrayList는 String 전용, 다른 자료형은 들어갈 수 없음

		ArrayList<String> list = new ArrayList<String>();

		list.add("딸기");
		list.add("포도");
		list.add("수박");
//		list.add(100);
		Integer it = 100; // 얘 주석 풀면 java.lang.ClassCastException 발생 왜인지는 33행에
//		Object obj = it;
//		list.add(obj); 

		System.out.println("list : " + list);

		// 한개씩 꺼내서 첫글자만 출력
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i); // Generic으로 굳이 Object로 형변환하지 않고 바로 사용가능
			System.out.println(str.substring(0, 1));

		}
	}

}
