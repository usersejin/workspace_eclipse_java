package day15;

public class TestMain2 {

	public static void main(String[] args) {

		String[] str = { "바둑이", "아롱이", "멍멍이", "재롱이" };

		// <T> 자리에 String 이 들어가면서 참조변수가 만들어짐 (런타임 시)
		GenEx<String> ge1 = new GenEx<String>();

		ge1.setArray(str);
		ge1.print();
		
		System.out.println("-------------------------");
		
		Integer[] arr1 = {20, 30, 10, 90, 80};
		
		// <T> 자리에 Integer 가 들어가면서 참조변수가 만들어짐 (런타임 시)`
		GenEx<Integer> ge2 = new GenEx<Integer>();
		ge2.setArray(arr1);
		ge2.print();
	}
}
