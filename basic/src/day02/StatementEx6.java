package day02;

public class StatementEx6 {
	public static void main(String[] args) {
		
		int kor = 95;
		int eng = 90;
		int mat = 98;
		
//		// 총점과 평균을 구해서 화면에 출력
//		int sum = kor + eng + mat;
//		System.out.println("세 과목의 총점은 " + sum + "점 입니다.");
//		// 평균 = 총합 / 갯수 
//		// count는 사용자로부터 입력받는 값이 있을 경우 그 개수를 세기 위함
//		int avg = 3;
//		System.out.println("세 과목의 평균은 " + (sum/avg) + "점 입니다.");

	
		float tot = kor + eng + mat;
		// 평균 = 총합 / 갯수 
		// count는 사용자로부터 입력받는 값이 있을 경우 그 개수를 세기 위함
		float avg = tot/3; // int tot = ~ ;로 선언되고 tot/3 하면 float avg 해도 이미 tot/3이 int이기 때문에 
							// 표기만 float로 되고 결국 값은 int자료형이 됨
							// float은 int와 같은 32이지만 float가 int보다 더 크기 때문에 표현은 float으로 표시
							// float tot = kor~; 을 안하려면 float avg = tot/3.0f; 라고 하면 된다
		System.out.println("세 과목의 총점은 " + tot + "점 입니다.");
		System.out.println("세 과목의 평균은 " + avg + "점 입니다.");
		
		// 평균이 90점 이상이면 A학점
		// 평균이 80점 이상이면 B학점
		// 평균이 70점 이상이면 C학점
		// 평균이 60점 이상이면 D학점
		// 그 외는 F학점
		
		if(avg >= 90) {
			System.out.println("A학점");
		}else if(avg >= 80) {
			System.out.println("B학점");
		}else if(avg >=70) {
			System.out.println("C학점");
		}else if(avg >=60) {
			System.out.println("D학점");
		}else {
			System.out.println("F학점");
		}
		
		
	}
}
