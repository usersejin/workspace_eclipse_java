package day16;

// Deamon thread 는 메인 스레드의 작업을 보조해주는 역할

// main Thread 종료되면 자동으로 종료

public class ThreadEx4 {
	public static void main(String[] args) {

		AutoSaveThread auto = new AutoSaveThread();
		auto.setDaemon(true); // 데몬 스레드, 메인 스레드가 종료되면 같이 종료됨
		auto.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("main Thread end");
	}

}
