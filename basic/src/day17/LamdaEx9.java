package day17;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Supplier;

// 미리 정의되어 있는 인터페이스 사용 : 람다식

// java.util.function 밑에 있는 미리 정의되어있는 함수적 인터페이스 (functional interface : 람다식으로 사용가능한 인터페이스)

public class LamdaEx9 {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// 몇개의 인터페이스들은 이미 정의되어 있음 그게 Supplier 
		// API 문서에 Package java.util.function 보기
		Supplier<Integer> spr = () -> { // () : 매개변수 없음 
			Random rnd = new Random();
			return rnd.nextInt(100) + 1;
		};

		// 10번 list에 담기
		for (int i = 0; i < 10; i++) {
			list.add(spr.get()); // get() : Gets a result.
		}

		// 목록 출력
		System.out.println("list : " + list);
	}

}
