package day17;

// 두개의 파라미터가 존재하고 리턴값이 없는 경우 -> return 할 수 없으니 그냥 System.out.println(); 일케 하면 돼
interface Calculate {
	void cal(int a, int b);
}

public class LamdaEx3 {
	public static void main(String[] args) {

		Calculate c = (a, b) -> {
			// 실행문이 2줄 이상이면 {} 생략 불가능
			System.out.println("---------------------");
			System.out.println(a + b);
		};

		c.cal(4, 3);

		Calculate c2 = (a, b) -> System.out.println(a - b);

		c2.cal(100, 50);

	}

}
