package day16;

import java.util.Random;

// 소비자 객체
// 멀티 스레드

public class Customer extends Thread {
	
	Car car;
	Random rnd = new Random();
	
	Customer(Car car){
		this.car = car;
	}
	
	@Override
	public void run() {
		// 차량 20대 구매
		// 랜덤하게 5초 이내에 1대씩
		for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep(rnd.nextInt(5)*1000); // 0부터 4000 -> 4초 이내 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String carName = car.pop();
			
		}
	}

}
