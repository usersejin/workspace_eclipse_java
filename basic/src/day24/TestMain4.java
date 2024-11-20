package day24;

public class TestMain4 {
	public static void main(String[] args) {
		Integer[] m = { 10, 20, 100 };
		SumValue<Integer> sv = new SumValue<Integer>();

		sv.setM(m);
		System.out.println(sv.cal());

		Long[] m2 = { 10L, 20L, 100L };

		SumValue<Long> lsv = new SumValue<Long>();

		lsv.setM(m2);

		System.out.println(sv.cal());
	}

}
