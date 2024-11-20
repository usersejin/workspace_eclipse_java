package day10;
// 모든 클래스는 object 의 후손

// extends Object // 안써도 같은 의미 

public class SmartPhone {

	String productName, nation, phoneNumber; 
	static String company; // static, method Area에 저장됨
	int price;

	SmartPhone() {

	}
	
	public SmartPhone(String productName, String nation, String phoneNumber, String company, int price) {
		super();
		this.productName = productName;
		this.nation = nation;
		this.phoneNumber = phoneNumber;
		this.company = company;
		this.price = price;
	}

	public void call() {
		System.out.println("발신 중");
	}

	public void receive() {
		System.out.println("수신 중");
	}

	public void playGame() {
		System.out.println("게임중");
	}
}
