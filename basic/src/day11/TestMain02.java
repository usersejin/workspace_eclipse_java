package day11;

//import java.lang.*; // java.lang 밑의 모든 패키지 다 불러와 
// 따로 지정하지 않아도 기본값, 필수이기 때문에 굳이 

public class TestMain02 {

	public static void main(String[] args) {
		System.out.println(Math.max(300, 100));

		System.out.println(Math.random()); // 애도 java.lang 패키지 안에 존재함

		// System이라는 클래스의 out이라는 static 변수 -> Out이라는 참조변수를 갖는 메서드의 pritnln()
		System.out.println("System.out.println => System 클래스의 static 변수 out");

//		System s = new System(); // 인스턴스화 할 수 없음

		long time1 = System.currentTimeMillis(); // 1970.1.1 기준으로 지금까지 시간을 밀리세컨드 단위로 리턴
		System.out.println(time1);

		// 엄청 오래 걸리는 작업을 수행했을 때

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 3초간 지연시킴 // 1000분의 1초단위로 -> 1000이면 1초

		long time2 = System.currentTimeMillis();

		long term = time2 - time1;

		System.out.println("걸린 시간 : " + term); // 밀리세컨드 단위로 3001이 출력됨

		System.gc(); // garbage Collector 호출

		System.exit(0); // 종료하는 명령 0: 정상종료, 0이 아닌 다른 값: 비정상 종료

	}

}
