package day16;

public class ProductCustomerTest {
	public static void main(String[] args) {

		Car car = new Car();

		Product p1 = new Product(car);

		// 소비자
		Customer c1 = new Customer(car);

		p1.start();
		c1.start();
	}
}
