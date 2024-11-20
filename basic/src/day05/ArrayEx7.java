package day05;

public class ArrayEx7 {
	public static void main(String[] args) {
		// int[] m = { 14, 2, 43, 12};
		
		int [][] m = {
				{ 0, 0, 0}, // 각 행마다 열의 개수를 다르게 설정할 수 있음
				{0, 1, 1, 3, 2, 5},
				{0, 2, 4, 3, 2},
				{0, 3, 6}
		};
		System.out.println("m: " + m); // 참조값
		System.out.println("m.length: " + m.length); // 행의 개수

		
		System.out.println("m[0]: " + m[0]); // 참조값
		System.out.println("m[0].length: " + m[0].length); // 열의 개수
		
		System.out.println("m[1]: " + m[1]); // 참조값
		System.out.println("m[1].length: " + m[1].length); // 열의 개수
		
		// 0행만 출력
		for (int i=0; i<m[0].length; i++) {
			System.out.println("m[0][" + i + "] = " + m[0][i]);
		}
		
		System.out.println("-----------------------");
		// 1행만 출력
		for (int i=0; i<m[1].length; i++) {
			System.out.println("m[1][" + i + "] = " + m[1][i]);
			}
		System.out.println("-----------------------");

		// 2행만 출력
		for (int i=0; i<m[2].length; i++) {
			System.out.println("m[2][" + i + "] = " + m[2][i]);
		}
		System.out.println("-----------------------");

		
		// 이중 for문 이용해서 행렬 m 한번에 출력하기
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length; j++) { // j의 조건식을 보면 각 행마다 열이 다르기 때문에 m[i].length라고 한 것을 볼 수 있다
				System.out.println("m[" + i + "][" + j + "] = " + m[i][j]);
			}System.out.println("-----------------------");
		}
	}

}
