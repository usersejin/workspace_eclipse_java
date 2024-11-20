package day05;

import java.util.Arrays;

// 배열에서 랜덤하게 원소값 출력하기
// 버블정렬

public class ArrayEx9 {
	public static void main(String[] args) {
		
		int[] rnd = {
				1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
				11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
				21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
				31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
				41, 42, 43, 44, 45
		};
		
		/// 랜덤하게 1개를 뽑아서 값을 출력
		System.out.println(rnd[(int)(Math.random()*45)]); // Math.random*45까지 해줘야함
		
		// 배열의 index의 범위 0~44
//		int idx1 = ((int)(Math.random()*45)); // idx = index
//		int idx2 = ((int)(Math.random()*45)); 
//		
//		System.out.println("rnd[" + idx1 + "] : " + rnd[idx1]);
//		System.out.println("rnd[" + idx2 + "] : " + rnd[idx2]);
//		
		// rnd[22] => 23
		// rnd[12] => 13
		// 두 변수의 값을 자리바꿈
		System.out.println("====================================");
		
		for (int i=0; i<1000; i++) {
			int a = (int)(Math.random()*45);
			int b = (int)(Math.random()*45); 
//		System.out.println("rnd[" + a + "] => " + rnd[a]);
//		System.out.println("rnd[" + b + "] => " + rnd[b]);
//		
//		System.out.println("====================================");
			int temp = 0;
			temp = rnd[a];
			rnd[a] = rnd[b];
			rnd[b] = temp; // **** 여기서 랜덤으로 요소 뽑고 rnd에 자리바꿔 넣어줘 그걸 1000번 반복
							// 그래서 m에 랜덤으로 요소가 들어가는 것
		
//		System.out.println("rnd[" + a + "] => " + rnd[a]);
//		System.out.println("rnd[" + b + "] => " + rnd[b]);
		}
		
		// System.out.println(Arrays.toString(rnd)); 
		
		for (int i=0; i<6; i++) {
			System.out.print(rnd[i] + "\t");
		}
		System.out.println();
		System.out.println("----------- 버블정렬 알고리즘 -----------");
		
		// 버블 정렬 알고리즘
		// 정수형 배열 m 6칸 선언
		
		int[] m = new int[6];
		
		
		// rnd 6개만 m배열에 담기
		for(int i=0; i<6; i++) {
			m[i] = rnd[i];
		} 
		
		for(int i=0; i<6; i++)
			System.out.print(m[i] + "\t");
		
		// 버블 정렬 알고리즘 적용
		System.out.println();
		System.out.println("------------- 버블정렬 후 -------------");
		
		System.out.println(Arrays.toString(m)); // Arrays.toString(): 배열의 상태를 보여줌
		int temp = 0;
		for (int i=0; i<m.length-1; i++) { // m.length = 6에서 -1해 마지막 원소는 결정됐기 때문에?
 			for (int j=1; j<m.length-i; j++){ // j<m.length-i 는 맨 끝에 결정됐기때문에 뒤에서부터 하나씩 줄여나가야함
				if(m[j] < m[j-1]) {
					temp = m[j-1];
					m[j-1] = m[j];
					m[j] = temp;
				}
				
			}
			
			System.out.println((i+1) + "번째 시도 중: " + Arrays.toString(m));
		}
		
		
		
	}

}
