package day15;

public class TestMain {
	public static void main(String[] args) {

		GenEx1 ge1 = new GenEx1();

		int[] m = { 10, 30, 50, 20 };

		ge1.setArray(m);
		ge1.print();

		System.out.println("---------------------");

		GenEx2 ge2 = new GenEx2();

		String[] str = { "바둑이", "아롱이", "멍멍이", "재롱이" };

		ge2.setArray(str);
		ge2.print();

		System.out.println("---------------------");

		GenEx3 ge3 = new GenEx3();

		float[] height = { 187.3f, 134.4f, 172.3f, 192.4f };

		ge3.setArray(height);
		ge3.print();
	}

}
