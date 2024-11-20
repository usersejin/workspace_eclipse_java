package day15;

import java.util.HashMap;

public class TestMain4 {
	public static void main(String[] args) {

		// Key : String, Value : String
		HashMap<String, String> hm = new HashMap<String, String>();

		hm.put("인삼", "풍기");
		hm.put("임진왜란", "선조");
		hm.put("사과", "대구");
//		hm.put("사과", "영주"); 
		hm.put("납작만두", "대구");

		System.out.println("hm : " + hm);

		System.out.println(hm.get("사과"));

	}

}
