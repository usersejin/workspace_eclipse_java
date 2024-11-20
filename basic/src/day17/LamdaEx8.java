package day17;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

// 람다식 사용
interface MakeList<T> {
	public int make();
}

public class LamdaEx8 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		// 람다식으로 나타내기 1부터 100사이의 값을 리턴하는 코드
		MakeList<Integer> mlist = () -> {
			Random rnd = new Random();
			return rnd.nextInt(100) + 1;
		};

		// 1부터 100 사이의 값을 받아 list 에 저장
		for (int i = 0; i < 10; i++) {
			list.add(mlist.make());
		}

		// 그 리스트 보이기
		System.out.println(list);
	}
}
