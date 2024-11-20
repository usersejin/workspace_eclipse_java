package day17;

import java.util.ArrayList;
import java.util.Random;

public class LamdaEx7 {
	public static void main(String[] args) {

		// ArrayList list: Integer 전용

		ArrayList<Integer> list = new ArrayList<Integer>();

		// Random rnd
		Random rnd = new Random();

		// 1~100 사이의 정수값을 10개 담기
		for (int i = 0; i < 10; i++) {
			list.add(rnd.nextInt(100) + 1);
		}

		// 목록 출력(list)
		// 하나씩 꺼내서 출력 (for 문)
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("---------------------");

		// 향상된 for 문 사용
		for (Integer x : list) { // 처음부터 끝까지 배열명 보고 그 원소 x를 가져오는 것
			System.out.println(x);
		}

	}

}
