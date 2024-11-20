package day24;

public class TestMain {
	public static void main(String[] args) {

		Horse h1 = new Horse();

		Whale w1 = new Whale();

		h1.eating();
		h1.fly();

		System.out.println("------------");
		w1.eating();
		w1.fly(); // whale 에 flyable 인터페이스 상속하면 가능해짐

		System.out.println("-------------");

		// 부모 참조변수에 자식 참조값을 할당가능
		Flyable f1 = h1;
//		f1.eating(); // h1의 참족값을 f1이 받았다고해도 Flyable 이 알고있는 변수와 메서드만 사용 가능
		f1.fly(); // Flyable 이 생성한 메서드만 사용 가능 // 출력 말이 날아요
		f1 = w1;
		f1.fly(); // 출력 고래가 날아요 -> h1의 참조값은 없어지게 됨
	}

}
