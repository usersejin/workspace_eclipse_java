package day06;

// 배열 안에서 최대값 구하기
// 배열 안에서 최대값의 위치 구하기

public class MethodEx06 {

	static int getMaxValue(int[] m) {
		int max = 0; // max에 임의의 수 지정
		for (int i = 0; i < m.length; i++) {
			// 배열의 요소값과 max 변수의 값을 비교해 큰 값이 최대값
			if (max < m[i]) {
				max = m[i]; // max보다 m[i]이 더 크면 m[i]가 최대값
			}
		}
		return max;
	}

	static int getMaxValuePosition(int[] m) {
		int max = 0;
		int position = -1; // 배열이므로 0번은 존재 -> 절대 있을 수 없는 값으로 초기값

		for (int i = 0; i < m.length; i++) {
			if (max < m[i]) {
				max = m[i];

				position = i; // 최대값일때의 위치
			}
		}
		return position; 
	}

	public static void main(String[] args) {

		int[] m = { 23, 53, 22, 11, 66, 77, 88, 29 };

		int max = getMaxValue(m);
		System.out.println("최대값 : " + max);

		int position = getMaxValuePosition(m);
		System.out.println("최대값을 갖는 배열의 위치 : " + position);
	}
}