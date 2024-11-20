package day06;
// 총점, 평균, 최고점수, 최저점수 출력
// 사용자 정의 함수에서 또다른 사용자 정의 함수 불러오기

public class MethodEx08_answer {
	
	// 총점 구하기
	static int sum(int[]m) {
		
		int number = 0;
		for (int i = 0; i < m.length; i++) {
			number += m[i];
		}
		return number;
	}
	
	// 평균 구하기
	static float avg(int[]m) {
		int sum = sum(m); // 만들어 둔 메서드를 쓸 수 있음 (메서드 안에서 또다른 메서드 불러서 쓰기 가능)
		
		return (float)sum / m.length; 
	}
	
	// 최고점수 구하기
	static int getMaxScore(int[]m) {
		int max = 0; // 작은 값으로 설정
		for (int i = 0; i < m.length; i++) {
			if(max < m[i]) {
				max = m[i];
			}
		}
		return max;
	}
	
	// 최저점수 구하기
	static int getMinScore(int[]m) {
		int min = 100; // 큰 값으로 설정
		for (int i = 0; i < m.length; i++) {
			if (min > m[i]) {
				min = m[i];
			}
		}
		return min;
	}
	
	// main 함수
	public static void main(String[] args) {
		
		int[] m = {90, 80, 100, 60, 75};
		
		System.out.println("총점 : " + sum(m));
		System.out.println("평균 : " + avg(m));
		System.out.println("최고 성적 : " + getMaxScore(m));
		System.out.println("최저 성적 : " + getMinScore(m));
		
	}

}
