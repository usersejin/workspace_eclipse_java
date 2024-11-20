package day15;

public class GenEx3 {
	
	float [] array;

	public float[] getArray() {
		return array;
	}

	public void setArray(float[] array) {
		this.array = array;
	}
	
	public void print() {
		for(float x : array) {
			System.out.println(x);
		}
	}

}
