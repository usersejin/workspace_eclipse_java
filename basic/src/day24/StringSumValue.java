package day24;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StringSumValue {

	String[] m;
	String sum = "";

	public String cal() {
		for (int i = 0; i < m.length; i++) {
			sum += m[i];
		}
		return sum;
	}

}
