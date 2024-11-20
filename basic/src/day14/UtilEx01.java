package day14;
// util 패키지

import java.util.Random;

public class UtilEx01 {
	public static void main(String[] args) {

		System.out.println(Math.random());

		// 랜덤값을 위한 객체
		Random rnd = new Random();
		for (int i = 0; i <= 100; i++) {
			System.out.println(rnd.nextInt(45));
		}

	}

}
