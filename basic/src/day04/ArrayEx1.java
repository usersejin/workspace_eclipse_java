package day04;
// 배열 : apt 형 변수, 참조형 변수
// 동일한 사이즈에 연속된 공간에 할당되는 변수
public class ArrayEx1 {
	public static void main(String[] args) {
		// 배열 선언방법: 자료형 [] 변수명; or 자료형 변수명[];
		 
		
		// int 크기 아파트형 변수 m
		int [] m;
		m = new int[3]; // 3층짜리 변수를 만들고, 주소(참조값)을 m에 대입
		
		System.out.println(m);
//		
//		m[0] = 10;
//		m[1] = 20;
//		m[2] = 30;
		
		// 위의 세줄을 for문을 사용해서 표현
		for(int i = 0; i< 3; i++) {
			m[i] = (i+1)*10;
		}
		
		// index = [숫자] 
		System.out.println(m[0]);
		System.out.println(m[1]);
		System.out.println(m[2]);
		System.out.println("===================");
		
		for(int i = 0; i<3; i++) {
			System.out.println("m["+ i +"] = " +m[i]);
		}

		
		System.out.println("===================");
		// int 크기의 배열 c 선언
		int [] c;
	
		// 배열의 크기 5
		c = new int [5];
		
		// 5 10 15 20 25 <= 반복문을 사용해서 할당
		for (int i=0; i<5; i++) {
			c[i] = 5*(i+1);
		}
		
		// 화면에 출력 <= 반복문 사용해서 출력
		for (int i=0; i<5; i++) { // i <= 5 하면서 에러발생가능
			System.out.println("c[" + i + "] = " + c[i] );
		}
		// System.out.println(c[5]);
		///////////////////////////////////////
		// 배열의 크기를 알 수 있다면 이런 에러가 발생되는 일을 미리 방지할 수 있지 않을까?
		
		// 배열의 크기는 length
		System.out.println("c 배열의 크기는 : " + c.length);
		
		// 조건식을 i < c.length로 나타낸다
		for(int i=0; i<c.length; i++) {
			System.out.println("c[" + i + "] = " + c[i] );
		}
		
		
		System.out.println("======================");
		////////////////////////////////////////////////////////
		
		// k 배열 7칸 짜리 int
		
		// 1, 3, 5, 7, 9, 11, 13 대입하고 화면에 출력 ; for문
		
		// 배열 선언
		int [] k;
		
		// 정수형 배열 7칸 
		k = new int [7];
		
		// 반복문을 사용해서 배열에 값 할당
		for (int i=0; i<k.length; i++) {
			k[i] = (2*(i+1)-1); // (2*i) + 1 
		}
		
		// 반복문을 사용해서 각 배열 칸에 있는 값 출력
		for (int i=0; i<k.length; i++) {
		System.out.println("k[" + i + "] = " + k[i]);
		}
	}
}


