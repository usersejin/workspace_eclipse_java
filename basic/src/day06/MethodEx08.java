package day06;

public class MethodEx08 {
	
	static int sum(int[]m) {
		int sum = 0;
		for (int i = 0; i < m.length; i++) {
			sum += m[i];
		}
		return sum;
	}
	
	static float avg(int[]m) {
		float avg = 0; // 굳이 avg 변수 안 만들어도 되고
		int total = sum(m);
		for (int i = 0; i < m.length; i++) {
			 avg = (float)total / m.length; // 여기서 float로 형변환 해줘야지 제대로 평균이 나옴
		}
		return avg; // return에서 수식으로 나타내도 됨! total / m.length 로
	}
	
	static int getMaxScore(int[]m) {
		int max = m[0];
		for (int i = 0; i < m.length; i++) {
			if (max < m[i]) {
				max = m[i];
			}
		}
		return max;
	}
	
	static int getMinScore(int[]m) {
		int min = m[0];
		for (int i = 0; i < m.length; i++) {
			if (min > m[i]) {
				min = m[i];
			}
		}
		
		return min;
	}
	public static void main(String[] args) {
		
		int[] m = {90, 80, 100, 60, 73};
		
		System.out.println("총점 : " + sum(m));
		System.out.println("평균 : " + avg(m));
		System.out.println("최고 성적 : " + getMaxScore(m));
		System.out.println("최저 성적 : " + getMinScore(m));
	} 

}
