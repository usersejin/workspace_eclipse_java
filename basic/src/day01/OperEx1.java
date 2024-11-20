// 프로그래밍 언어 공부방법
// 코드 이해 + 따라 써보기(반드시)
// 주석은 습관화(꼼꼼하게)

package day01;
// 연산자
// 자료가공을 위해 정해진 방식에 따라 계산하고 
// 그 결과를 얻기위한 행위를 의미하는 기호들의 총칭

// 1. 증감 연산자: ++, --
public class OperEx1 {
	public static void main(String[] args) {
		// int 크기의 공간을 할당하고 a라는 변수에 100 의 값을 대입
		int a = 100; 
	
		int b = 10;
		 
 		/*
 		System.out.println("a : " + a++); // 우선 a 쓰고 ++ 연산 a라는 변수에 101이 저장됨
 		System.out.println("a : " + ++a); // ++ 연산 쓰고 a라는 변수에 102가 저장되어 출력됨
 		System.out.println("a : " + ++a); // a라는 변수에 103이 저장됨
 		System.out.println("a : " + a++); // 우선 103이 출력되고 a라는 변수에 104가 저장되었지만 출력은 x
 		*/
		
		/*
		b = a; // b라는 변수에 100을 담음, a의 주소값 x 주소값 담으려면 &a 인가.. 
		a = a + 1; 
		b = a++; // 25, 26행 두 행을 한 줄로 나타냄
				// a의 값을 b에 저장하고 a값을 증가시켜
		 */
// 주석 단축키 ctl + /
		
		
//		a = a + 1;
//		b = a;
		b = ++a; // 34, 35행 두 줄을 한 줄로 나타냄
		
		
		System.out.println("a: " + a + ", b: " + b);// a = 101, b=100
	}
}
