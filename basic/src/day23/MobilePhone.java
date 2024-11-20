package day23;

public class MobilePhone {

	String company;
	int price;
	String serialNo;

	public MobilePhone() {
		super();
		company = "삼성";
		price = 1500000;
		serialNo = "s123455";
	}

	public MobilePhone(String company, int price, String serialNo) {
		super();
		this.company = company;
		this.price = price;
		this.serialNo = serialNo;
	}

	public void calling(String number) {
		System.out.println("전화걸기");
	}

	public void pickingUp() {
		System.out.println("전화받기");
	}

	public void playGame() {
		System.out.println("게임하기");
	}

}



 