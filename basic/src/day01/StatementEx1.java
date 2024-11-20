package day01;

public class StatementEx1 {
	public static void main(String[] args) {
		// 문장
		// 메인 메서드 상단에서 하단 방향으로 1줄씩 실행
		
		// 제어문 : 문장의 흐름을 변경
		//		반복문 : 특정 구간을 반복해서 실행하는 문장
		//			for문
		// 
		// for(초기식;조건식;증감식){
		//		이 사이의 코드를 반복 수행
		//	}
		// 초기식 : for문에서 사용될 변수에 초기값을 할당
		// 조건식 : 조건식의 결과값은 논리값으로 true이면 {} 안에 있는 문장 실행, 
		//								false이면 완전히 빠져나감
		// 증감식 : for문에서 사용될 변수를 증가, 감소처리 함
		
		// 구구단 3단 출력
		for (int i=1; i<=9; i++) {
			// System.out.println("3 * 1 = 3"); // 3 * 1 = 3 이 아홉번 출력돼
			 System.out.println(i + "번 째 : 3 * " + i + " = " + (3*i));

		}
		
		
		
		
	}
}
