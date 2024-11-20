package day01;
//8. 대입 연산자
// 값을 할당하는 연산자로 =, +=, -=, *=, /=
public class OperEx8 {
	public static void main(String[] args) {
		int a= 10;
		
		// a = a + 1; // 연산자가 두개 쓰여서 성능이 떨어짐
		// a++;
		
		// a = a + 2;
		a += 2; // 한 번씩 연산 할때마다 2 증가
		
		System.out.println("a += 2 : " + a ); 
		System.out.println("a += 2 : " + (a += 2) ); // 이렇게 해도 돼
	}
}

//연산자 우선순위
//0. 괄호(), dot .
//1. 증감연산자
//2. 산술연산자
//3. shift
//4. 비교
//5. 비트
//6. 논리
//7. 삼항
//8. 대입