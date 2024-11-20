package day17;

// 람다식의 특징
// 문법
// (매개변수 목록) -> {실행문}
// 장점 
// 1. 코드를 간결하게 만들 수 있다
// 2. 식에 개발자의 의도가 명확히 드러나므로 가독성 향상
// 3. 함수를 만드는 과정없이 한번에 처리가능하여 코딩하는 시간이 줄어듬
// 4. 병렬프로그램에 용이함

// 단점
// 1. 익명함수(익명 메서드)는 재사용이 불가함 -> 1회성이기 때문에
// 2. 디버깅이 다소 까다로움
// 3. 람다는 남발하면 코드가 지저분해짐 = 비슷한 코드의 중복가능성이 높아짐

interface CalCulater {
	int cal(int a, int b);
}

public class LamdaEx2 {
	public static void main(String[] args) {
		CalCulater c;

		// 익명 이너 클래스
		// 두 수의 합
		c = new CalCulater() {
			@Override
			public int cal(int a, int b) {
				return a + b;
			}

		};

		// 위의 익명 이너 클래스를 람다식으로 표현했을 때
		CalCulater c2;

		c2 = (a, b) -> {
			return a + b;
		};

		System.out.println(c.cal(100, 200));
	}

}
