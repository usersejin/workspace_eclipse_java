package day04;
// 배열의 인덱스는 번호는 0번부터
// 배열, 변수인지 어떻게 구분? 대괄호의 여부로 판단 있으면 배열


// 배열을 선언만 하면 메모리에 생성은 되지만
// 실제로 값을 담을 수 있는 요소가 만들어지진 않음

// new 연산자에 의해 배열의 요소가 생성되어짐 
//new int로 만들어진  참조값을 c에 담아 (참조값을 c언어의 포인터라고 볼 수 있으나 연산은 안됨)
//default -> int 0, float 0.0, boolean false
public class ArrayEx2 {
	public static void main(String[] args) {
		int [] c = new int [3]; // 해당 자료형의 기본값으로 초기화: int ==> 0
		
		// 배열의 길이 : length
		
		System.out.println("배열의 길이: " + c.length);
		
		System.out.println("배열의 요소 0의 값: " + c[0]); 
		
		System.out.println("------------------------");
		
		// d라는 배열을 선언
		// int 크기의 3칸짜리 배열
//		int [] d = new int [3];
		// 초기값 29, 16, 68을 할당
//		d[0] = 29;
//		d[1] = 16;
//		d[2] = 68;
		
		int [] d = {29, 16, 68}; // 이렇게 하면 int [] d = new int [3]; 선언 안해도 돼
		
		// 화면에 출력
		for (int i=0; i<d.length; i++)
		System.out.println("d[" + i + "] = " + d[i]);
	}

}
