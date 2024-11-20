package day08;


//직접적인 접근은 막고 메서드를 통해서 간접적으로 변수에 접근
		// setXXX : setter 메서드
		// getXXX : getter 메서드
		
// 객체지향 언어의 특징
// 캡슐화(정보의 은닉) -> 간접적인 접근만 허용

// 예금주 변수를 private 로 변경
// setter, getter 메서드를추가

// 캡슐화(encapusulation) :  멤버변수의 메서드를 하나로 묶고 실제 구현 내용 일부를 외부에 감춰 은닉

// 접근 지정자, 접근 한정자, 접근 수정자, 접근 제어자
public class ATM {
	
	private String name; // default
	private String accountNo; // 현재 패키지 + 상속관계
	private int balance;
	// 특정 변수의 외부접근 차단(private: 같은 클래스 내에서만)
	
	
	ATM() {
		this.balance = 0;
		this.name = "홍길동";
		this.accountNo = null;
		System.out.println("기본 생성자");
	}
	
	// void set변수명(자료형 변수명){ ... } : setter 메서드
	public void setBalance(int balance) {
		this.balance = balance; // 내가 지정한 값으로 this.balance 초기화
	}

	// 꺼내오기 -> ? 뭘꺼내와 (호출의 의미인 듯)
	// 자료형 get변수명(){...} : getter 메서드
	public int getBalance() {
		return this.balance;
	}
	
	
	public void setName(String name) { // 값을 지정하면 끝이므로 void
		this.name = name;
	}
	
	public String getName() {
		return this.name;
		
	}
	
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public String getAccountNo(){
		return this.accountNo;
	}
	
	
	// 입금()
	public void deposit(int money) {
		balance += money;
		System.out.println(money + "원을 입금합니다.");
		System.out.println("현재 잔액 : " + balance);

	}

	// 출금()
	void withdraw(int money) {
		if (balance >= money) {
			balance -= money;
			System.out.println(money + "원을 출금합니다.");
		} else { // 잔액보다 출금액이 더 클 때
			System.out.println("잔액이 부족합니다.");
		}
		System.out.println("현재 잔액 : " + balance);
	}

}
