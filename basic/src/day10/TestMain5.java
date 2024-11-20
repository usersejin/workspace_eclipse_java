package day10;

public class TestMain5 {
	public static void main(String[] args) {
		
		Police p = null;
		
		System.out.println(p); // Police p; 만하면 에러 뜸 반드시 초기화 해줘야함
		
//		p = new Police();
		
		System.out.println(p.name); // p = new Police(); 를 안하면 NullPointerException에러 뜸 ㄹ
									// Cannot read field "name" because "p" is null at day10.TestMain5.main(TestMain5.java:12)
									// p. 하고 가야 할 곳이 있어야하는데 없기 때문에
	}

}
