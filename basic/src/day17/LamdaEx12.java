package day17;

// 람다식 활용
// 멀티 스레드를 사용하면서 1부터 100까지 출력

public class LamdaEx12 {
	public static void main(String[] args) {

		// 스레드명 1미터 달리는 중
		// 멀티 스레드 처리 방법
		// 1. Thread 클래스 상속
		// 2. Runnable 인터페이스 구현

//		Thread th = new Thread();

		// 따로 클래스를 만들지 않고 익명 이너클래스 형태로 사용할 수 있음(재사용을 안하면) -> super();의 run을 재정의
		Thread t = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i <= 100; i++) {
					System.out.println(Thread.currentThread().getName() + " : " + i + "미터 달리는 중");
				}
			}
		};
		t.start();

		System.out.println("---------------------");

		// 2번 방법
//		Thread th2 = new Thread(Runnable 인터페이스 구현 객체);
		// Runnable interface -> 람다식을 이용할 수 있음(run 밖에 없으므로)

		Runnable r = () -> {
			for (int i = 0; i <= 100; i++) {
				System.out.println(Thread.currentThread().getName() + " : " + i + "미터 달리는 중");
			}
		};

		Thread th2 = new Thread(r);
		th2.start();

		System.out.println("---------------------");
		// 줄이기
		Thread th3 = new Thread(() -> { // 람다식을 생성자의 매개변수로.....
			for (int i = 0; i <= 100; i++) {
				System.out.println(Thread.currentThread().getName() + " : " + i + "미터 달리는 중");
			}
		});

		System.out.println("---------------------");
		// 줄이기
		new Thread(() -> {
			for (int i = 0; i <= 100; i++) {
				System.out.println(Thread.currentThread().getName() + " : " + i + "미터 달리는 중");
			}
		}).start();

		System.out.println("main Thread는 종료함");
	}

}
