package day16;

import java.util.Iterator;

// 멀티 스레드 구현  => 게임할 때 주로 쓴다
// 1. Thread 상속
// 2. run() override -> 이거 잘 안쓴대
// 3. start() 실행

public class TreadEx2 extends Thread {

	TreadEx2(String name) {
		super(name); // 부모의 String 매개변수 생성자를 호출 -> 매개변수 있는것은 생략 불가
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
//		super.run(); // 부모걸 쓰고 싶을 때는 살려둬
		for (int i = 1; i <= 100; i++) {
			// 현재 스레드의 이름 : Thread.currentThread().getName()
			System.out.println(Thread.currentThread().getName() + " : " + i + "미터 달리는 중");
		}
	}

	public static void main(String[] args) {

		// main Thread
		System.out.println(Thread.currentThread().getName()); // main thread
		TreadEx2 th1 = new TreadEx2("천둥이");
		TreadEx2 th2 = new TreadEx2("번개");
		System.out.println("준비~ 시작!");

		// 2. run() override
//		th1.run();

		// 3. start() 실행
		th1.start(); // 참조변수 th1.으로 "천둥이"가 출력되지
		th2.start(); // 각자 작업을 동시에 실행 (독립적으로 자원받으면 실행) 서로 관여하지 않음

		// 경기결과가 나올 때까지 "우승"이 대기했으면.. -> th1.join(); = Waits for this thread to terminate.
		try {
			th1.join();
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("우승");
		System.out.println("main Thread end"); // main thread가 끝나도 start()는 자기 것이 끝날 때까지 지속
	}

}
