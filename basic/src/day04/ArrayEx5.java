package day04;
// 2차원 배열
public class ArrayEx5 {
	public static void main(String[] args) {
		
		int []k = new int [3]; 
		k[0] = 10;
		k[1] = 100;
		k[2] = k[0] + k[1];
		
		System.out.println(k[2]);
		System.out.println("-------2차원 배열의 참조값과 요소값 구분---------");
		
		int [][] m = new int[3][2]; // 2차원 배열, 3행 2열
		System.out.println("m의 참조값: " + m);
		System.out.println("m.length = " + m.length); // 행의 개수 표현
		
		System.out.println("m[0]의 참조값: " + m[0]);
		
		// m[0]의 참조값을 보고 찾아갔더니 두칸있음, 열의 개수 표현
		System.out.println("m[0].length = " + m[0].length); 
														
		System.out.println("m[0][0]의 요소값(참조값 아님): " + m[0][0]);
		
		// 0행의 요소값을 출력하려면
		
		System.out.println("m[0][0]의 요소값은 " + m[0][0]);
		System.out.println("m[0][1]의 요소값은 " + m[0][1]);
		
		System.out.println("=========for문을 사용해서 요소값 출력==========");
		// for문을 사용해서 출력
		for (int i=0; i<2; i++) { //for (int i=0; i<2; i++)에서 2는 m[0].length임
			System.out.println("m[0][" + i + "] = " + m[0][i]);
		}
		for (int i=0; i<m[1].length; i++) { 
			System.out.println("m[1][" + i + "] = " + m[1][i]);
		}
		
		System.out.println("===== 이중 for문을 이용해서 요소값 출력=====");
		
		for (int i=0; i<2; i++) {
			for(int j=0; j<2; j++) { // 반복문을 사용해서 2행 2열인 배열의 요소값을 5로 초기화
				System.out.println("m[" + i + "][" + j + "] = " + m[i][j]);
			}
		}
		
		System.out.println("=======반복문의 조건식을 m.length(행의 수), m[i].length(열의 수)로============");
		for (int i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length; j++) {
				m[i][j] = 5; // 반복문을 사용해서 2행 2열인 배열의 요소값을 5로 초기화
				System.out.println("m[" + i + "][" + j + "] = " + m[i][j]);
			}
		}
	}

}
