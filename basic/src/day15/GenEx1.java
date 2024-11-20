package day15;

public class GenEx1 {

	int[] array;

	// setter, getter
	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public void print() {
		// 배열의 모든 요소를 화면에 출력
		for(int x : array) {
			System.out.println(x);
		}
	}

}
