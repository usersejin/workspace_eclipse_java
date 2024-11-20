package day15;

public class GenEx2 {
	
	// String 배열
	String [] array;

	// setter, getter
	public String[] getArray() {
		return array;
	}

	public void setArray(String[] array) {
		this.array = array;
	}
	
	// print()
	public void print() {
		for(String x : array) {
			System.out.println(x);
		}
	}
	

}
