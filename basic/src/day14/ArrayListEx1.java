package day14;

import java.util.ArrayList;
// ** ArrayList
// Vector와 비슷해 (형제관계) -> 갖고있는 메서드가 서로 같음
// Vector은 동기화 클래스, ArrayList는 비동기화 클래스 -> 비동기화 클래스가 속도측면에서 좋음
// 따라서 ArrayList를 더 자주 씀

public class ArrayListEx1 {
	public static void main(String[] args) {

		ArrayList v = new ArrayList(); // 기본생성자 공간 10

		v.add("딸기");
		v.add("포도");
		v.add("사과");
		v.add("배");
		v.add("수박");
		System.out.println("v : " + v);

		v.add("배");
		v.add("수박");
		v.add("배");
		v.add("수박");
		v.add("배");
		v.add("수박");
		v.add("배");
		v.add("수박");
		System.out.println("v : " + v);

		System.out.println("--------------------");

		// 한개씩 꺼내서 첫글자만 출력
		for (int i = 0; i < v.size(); i++) {
			Object obj2 = v.get(i);
//			System.out.println(obj2.toString());

			// 앞 한글자씩 출력
			String str2 = (String) obj2;
			System.out.println(str2.substring(0, 1));
		}

	}

}
