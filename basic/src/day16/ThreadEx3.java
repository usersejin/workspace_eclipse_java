package day16;

// Runnable 인터페이스 사용


// 멀티 스레드(Thread 클래스를 상속받지 못하는 경우 : 자바는 단일 상속만 지원하기 때문에)
// 1. Runnable 인터페이스 구현
// 2. Runnable 인터페이스는 run()이라는 추상 메서드 가지고 있음 override
// 3. 이 객체를 생성 
// 4. Thread 객체의 매갬변수로 전달 (start()가 없음)
// 5. Thread 객체의 start() 실행

public class ThreadEx3 implements Runnable {
	String name;

	ThreadEx3(String name) {

		// 멤버변수에 전달한 매개변수의 값(참조값)을 할당
		this.name = name;
	}

	// 2. Runnable 인터페이스는 run()이라는 추상 메서드 가지고 있음 override
	@Override
	public void run() {
		// 동시에 처리할 코드가 run안에 정의되어야 함
		for (int i = 1; i <= 100; i++) {
			System.out.println(name + " : " + i + "미터 달리는 중");

		}

	} // end of run method

	public static void main(String[] args) {

		// 3. 이 객체를 생성
		ThreadEx3 r1 = new ThreadEx3("토끼");
		ThreadEx3 r2 = new ThreadEx3("거북이");

		// 4. Thread 객체의 매갬변수로 전달 (start()가 없음)
		Thread th1 = new Thread(r1); // 매개변수로 Runnable 인터페이스 구현객체를 갖는 생성자가 있음
		Thread th2 = new Thread(r2);

		
		// 우선순위 결정 -> 자원이 부족해지면 누구에게 먼저 줄 것인지 결정
		th1.setPriority(Thread.MIN_PRIORITY);
		th2.setPriority(Thread.MAX_PRIORITY);
		
		// 5. Thread 객체의 start() 실행
		th1.start();
		th2.start();
	}

}
