package day16;

public class ATM {

	String account;
	int balance;

	public ATM(String account, int balance) {
		super();
		this.account = account;
		this.balance = balance;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	// synchronized ~ 동기화 메서드 : 이 메서드를 사용하면 끝날 때까지 다른 객체는 쓰지말고 기다려
	public synchronized void deposit(int money) {
		balance += money;
		System.out.println(money + "원 입금합니다.");
		System.out.println("현재 잔액 : " + balance + "원 입니다.");
	}

	public synchronized void withDraw(int money) {
		if (balance >= money) {
			balance -= money;
			System.out.println(money + "원 출금합니다.");
		} else {
			System.out.println("잔액이 부족합니다.");
		}
		System.out.println("현재 잔액 : " + balance + "원 입니다.");
	}
}
