package day16;

// 멀티 스레드 환경으로 
// 생상자가 2초마다 1대씩 자동차를 생산 

public class Product extends Thread {
	private Car car;

	Product(Car car) {
		this.car = car;
	}

	@Override
	public void run() {
		// 20대를 2초마다 1대씩 생산
		for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String name = car.getCarName();
			// 차고에 넣기
			car.push(name);

		} // out of for

	} // ouf of run()

} // out of class
