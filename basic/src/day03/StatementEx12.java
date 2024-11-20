package day03;
// break: 반복문 탈출
// continue: continue문이 속한 반복을 이번만 생략(skip) -> 루프 선두로 다시 제어를 옮김
// break 라벨: 라벨이 붙어있는 반복문을 탈출
// continue 라벨: 라벨명이 붙어 있는 반복문을 이번 회차만 생략 
public class StatementEx12 {
	public static void main(String[] args) {
		// 중첩
		// 바깥에있는 for문을 빠져나오고 싶을 때 라벨 붙이기 (outer)
		outer: 
		for(int i = 1; i<=3; i++) {
			for(int j = 1; j<=4 ; j++) { // 초기값 들어오고 조건확인 후 조건 만족하면 코드 실행
										 // 실행 후 j++ 함 그리고 다시 조건확인, 조건 만족하지 않으면 for문 빠져나와
/*				if(j > i) {
					break; // j > i이면 반복문 빠져나가
				}
*/				
				if(j==i) {
					continue ; // j == i이면 22, 23행을 하지 않고 넘어가
				// continue outer; // 바깥 for문을 실행하지 않음
				}
				System.out.println("i: " + i + " j: " + j);
				System.out.println(); // 빈줄 출력됨
				} // continue 끝나는 지점
			System.out.println("i값 증가 ");
		}
		
		}
}
