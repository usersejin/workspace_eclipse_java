package day09;

public class TestMain6 {
	public static void main(String[] args) {

		Parent p1 = new Parent();
		Child c1 = new Child();

		System.out.println("p1 : " + p1);
		System.out.println("c1 : " + c1);

		System.out.println("----------------------");

		p1 = c1;
		System.out.println("p1 : " + p1);
		System.out.println("c1 : " + c1);

	}

}
