package day16;

public class AutoSaveThread extends Thread {

	public void save() {
		System.out.println("현재 작업을 저장함");
	}

	@Override
	public void run() {
		while(true) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		save(); // 3초 지났다가 save
		}
	}
}
