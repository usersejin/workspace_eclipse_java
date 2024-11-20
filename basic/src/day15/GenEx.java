package day15;

// 다양한 자료형에 대해 한번에 처리하고 싶다면
// 자료형명을 변수로 처리하는 건?
// 이때 변수명을 T -> 아직 자료형을 결정하지 않은 미완성 형태라고 알려줘야 함 => 클래스명 옆에 <T> 라고 해줘

// ** Generic : 결정되지 않은 타입을 파라미터로 처리하고 실제 사용할 때 파라미터를 구체적인 타입으로 대체시키는 기능




public class GenEx<T> {
	
	// String 배열 array
	// 자료형 자리에 변수
	T[] array; 

	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
	}
	
	public void print() {
		// 배열의 모든 요소를 화면에 출력
		for(T x : array) {
			System.out.println(x);
		}
	}

}
