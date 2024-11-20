package day15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx1 {
	public static void main(String[] args) {
		HashMap hm = new HashMap();

		// hm.put(key, value); -> 데이터 저장
		hm.put("인삼", "풍기");
		hm.put("임진왜란", "선조");
		hm.put("사과", "대구");
//		hm.put("사과", "영주"); // key 값은 중복될 수 없음, 마지막에 들어온 것으로 덮어씀
		hm.put("납작만두", "대구"); // value 값은 중복 가능 (key 값으로 value 값을 찾기때문)

		System.out.println("hm : " + hm);

		// 특정한 값 꺼내오기 get(key 값);
		System.out.println(hm.get("사과"));

		// 특정 키 혹은 값이 존재하는지 여부 확인
		System.out.println("납작만두라는 키가 존재하니 : " + hm.containsKey("납작만두")); // boolean 타입으로 반환
		System.out.println("대구라는 value가 존재하니 : " + hm.containsValue("대구"));

		// key의 목록
		Set set = hm.keySet(); // 리턴타입이 Set
		System.out.println("set : " + set);

		// key의 목록 하나씩 출력
		Iterator it = set.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}

		// key와 value 같이 출력
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj + " : " + hm.get(obj)); // get(); value 값 출력
		}
	}

}
