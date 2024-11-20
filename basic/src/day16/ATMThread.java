package day16;

import java.util.Random;

// 하나의 계좌에 동시에 입금과 출금을 수행할 수 있도록 멀티 스레드 구현
public class ATMThread extends Thread {

	ATM atm;
	Random rnd = new Random();

	public ATMThread(ATM atm) {
		super();
		this.atm = atm;
	}

	@Override
	public void run() {
		// 5회 입금과 5회 출금을 번갈아 가면서
		// 입금금액을 1000원~10000원 사이값
		boolean flag = false;
		for (int i = 0; i < 10; i++) {
			int money = (rnd.nextInt(10) + 1) * 1000;
			if (flag) {
				atm.deposit(money);
			} else {
				atm.withDraw(money);
			} flag = !flag; // ! : not 연산자
		}
	}

}
