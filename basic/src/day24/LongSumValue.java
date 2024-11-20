package day24;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LongSumValue {

	long m[];
	long sum;

	public long cal() {
		// 배열의 요소의 총합을 리턴
		for (int i = 0; i < m.length; i++) {
			sum += m[i];
		}

		return sum;
	}

}