package day11;

// Test 클래스의 TestMain
public class TestMain01 {

	public static void main(String[] args) {

		System.out.println(Test.no1); // new 없어도 static 은 바로 사용 가능

		Test.show(); // new 없이도 static 이므로 바로 사용 가능

		// static block 을 따로 호출하지 않아도 생성자보다 먼저 자동으로 호출되어 출력됨
		System.out.println("------------");

		Test t = new Test();

		System.out.println(t.no2);
		t.show2();

	}

}
