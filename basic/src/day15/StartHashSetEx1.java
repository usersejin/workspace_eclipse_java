package day15;

import java.util.HashSet;
import java.util.Iterator;

// 수업 진행 순서: (오전) HashSet -> HashMap -> Genex1~3(TestMain1) -> GenEx(TestMain2, 3, 4) 
//			   (오후) SwingEx -> Chatting -> MemoJJang
public class StartHashSetEx1 {
	public static void main(String[] args) {

		HashSet hs = new HashSet();

		hs.add("딸기");
		hs.add("바나나");
		hs.add("포도");
		hs.add("사과");
		hs.add("배");

		System.out.println("hs : " + hs);

		System.out.println(hs.size());

		System.out.println("---------------------");

		hs.add("사과");
		hs.add("사과");
		hs.add("사과");
		hs.add("사과");
		hs.add("사과");
		hs.add("사과");
		hs.add("사과");
		hs.add("사과");

		System.out.println("hs : " + hs);
		System.out.println(hs.size()); // 여전히 5 // set interface 을 구현 -> 중복된 값을 무시, 제거함

//		hs.get(0); // 첫번째 요소 출력 안됨 (set에는 순서가 없기 때문에)
		// get()가 없으므로 몇번째 요소를 꺼내오는 건 할 수 없음
		// 대신 Iterator 사용 // Iterator 는 Collection 에 저장된 요소들을 읽어오는 방법을 표준화한 것 -> 이걸로 꺼내와
		Iterator it = hs.iterator(); // Iterator 객체로 표현

		System.out.println(it.hasNext()); // hasNext(); 요소의 존재여부 확인 있으면 true 없으면 false

		// 반복문을 통해서 hasNext()가 true일때까지만 요소 출력
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println("obj : " + obj);
		}

//		obj = it.next();
//		System.out.println("obj : " + obj);
//		obj = it.next();
//		System.out.println("obj : " + obj);
//		obj = it.next();
//		System.out.println("obj : " + obj);
//		obj = it.next();
//		System.out.println("obj : " + obj);

//		System.out.println(it.hasNext()); //
//		obj = it.next();
//		System.out.println("obj : " + obj);

	}

}
