package day24;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class IntSumValue {

	int[] m;
	int sum;
	public int cal() {
		// 배열의 요소의 총합을 리턴
		for (int i = 0; i < m.length; i++) {
			sum += m[i];
		}

		return sum;
	}

}
