package day23;

import java.util.Arrays;

public class TestMain {

	public static void main(String[] args) {
		int[] m = { 100, 200, 10, 50, 20 };

		System.out.println("정렬 전 : " + Arrays.toString(m));

		Arrays.sort(m);

		System.out.println("정렬 후 : " + Arrays.toString(m));
	}

}
