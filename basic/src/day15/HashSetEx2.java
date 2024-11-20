package day15;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

// HashSet의 활용

public class HashSetEx2 {
	public static void main(String[] args) {

		// 1. 6칸짜리 배열 m 선언
		int[] m = new int[6];

		// 2. HashSet 객체 생성
		HashSet hs = new HashSet();

		// 3. 랜덤하게 1부터 45사이의 값 뽑기 (Random 클래스)
		Random rnd = new Random();

		// 4. HashSet 담기
		while (hs.size() < 6) {
			hs.add(rnd.nextInt(45) + 1);
			System.out.println(hs);
		}

//		hs.add(rnd.nextInt(45) + 1); // (45) -> 0 ~ 44 이므로 +1
//		
//		System.out.println(hs); 
//		
//		hs.add(rnd.nextInt(45) + 1);
//		
//		System.out.println(hs); 
//		
//		hs.add(rnd.nextInt(45) + 1); 
//		
//		System.out.println(hs); 
//		
//		hs.add(rnd.nextInt(45) + 1); 
//		
//		System.out.println(hs); 
//		
//		hs.add(rnd.nextInt(45) + 1); 
//		
//		System.out.println(hs); 
//		
//		hs.add(rnd.nextInt(45) + 1); 
//		
//		System.out.println(hs); // 중복된 값이 나오면 제거되므로 총 요소의 개수가 6개로 안 나올 수도 있음 
		// -> 반복문을 통해 6개가 될때까지 뽑으면 중복된 값을 제거해서 얻을 수 있음 (로또번호 같이)

		// 5. 하나씩 꺼내서 배열에 담기
		Iterator it = hs.iterator();
		for (int i = 0; i < m.length; i++) {
			m[i] = (int) it.next();
		}

		// 6. 배열 정렬하기
		Arrays.sort(m);

		// 7. 화면 출력
		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i] + "\t");
		}
		System.out.println();
	}

}
