package day16;

import java.util.Random;

public class ATMTest {
	public static void main(String[] args) {

		ATM atm = new ATM("홍길동", 1000);

		// 동시에 여러 은행지점에서 이 계좌에 입출금 동시에 처리한다고 가정
		ATMThread at1 = new ATMThread(atm);
		ATMThread at2 = new ATMThread(atm);
		ATMThread at3 = new ATMThread(atm);

		at1.start();
		at2.start();
		at3.start();

		// 5번 입금 5번 출금
		// 랜덤하게 1000~10000원 사이의 값을 입/출금
//		Random rnd = new Random();
//	
//		for (int i = 1; i <= 5; i++) {
//			int money = (rnd.nextInt(10)+1)*1000;
//			a.deposit(money);
//			a.withDraw(money);
//		}
//		

	}

}
