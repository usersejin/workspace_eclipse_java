package day24;

public class TestMain3 {
	public static void main(String[] args) {
		IntSumValue isv = new IntSumValue();
		
		int [] m = {3, 2, 45, 11,23};
		
		isv.setM(m);

		System.out.println(isv.cal());
		
		long [] m2 = {30, 20, 11, 34, 100};
		
		LongSumValue lsv = new LongSumValue();
		
		lsv.setM(m2);
		
		System.out.println(lsv.cal());
		
		String[] m3 = {"오늘은", "월요일", "내일은", "화요일"};
		
		StringSumValue ssv = new StringSumValue();
		ssv.setM(m3);
		System.out.println(ssv.cal());
		
	
		
	}

}
