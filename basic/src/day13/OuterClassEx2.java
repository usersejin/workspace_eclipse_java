package day13;

// 2. static inner class 


public class OuterClassEx2 {
	private int a = 10; // instance 변수 = heap 영역에 자리잡은 변수 -> static이 아니여서 접근이 불가능 instance는 new해야지 heap에 만들어지는 변수
	static int b = 20; 
	static final int c = 30;
	
	static class InnerClass2{
		int d = 40;
		static int e = 50;
		static final int f = 60;
		
		void print() {
//			System.out.println("a : " + a); // static은 인스턴스화 되기전에만 사용가능, 코드에 instance 변수가 있으면 인스턴스화 하기전에 사용할 수 없음
			System.out.println("b : " + b);
			System.out.println("c : " + c);
			System.out.println("d : " + d);
			System.out.println("e : " + e);
			System.out.println("f : " + f);
		} // end of print()
	}
	
	public static void main(String[] args) {
		InnerClass2 ic2 = new InnerClass2();
		ic2.print();
	}

}
