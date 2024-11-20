package day04;

public class ArrayEx6 {
	public static void main(String[] args) {
		
		// 2차 정수형 배열 m ; 4행 5열 
		// 1 1 1 1 1
		// 2 2 2 2 2
		// 3 3 3 3 3
		// 4 4 4 4 4
		
		
		int [][] m = new int [4][5]; // 배열 선언
		
		for(int i=0; i<m.length; i++) { // 행 (생성)
			for(int j=0; j<m[0].length; j++) { // 열 (생성)
				m[i][j] = i+1; // 각 요소에 값 할당
				System.out.print(m[i][j] + "  "); // i가 1일 때(즉 1행일 때) j값 (열) 출력
				// System.out.print("m[" + i + "][" + j + "] = " + m[i][j] + " | "); // 확인용
			}System.out.println(); // 줄바꿈(다음 행으로 넘어감)
		}

	}

}
