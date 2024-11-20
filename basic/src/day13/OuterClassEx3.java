package day13;

// 3. 지역변수처럼 사용되는 class : local Inner Class -> 메서드 안쪽으로 들어감

public class OuterClassEx3 {
	private int a = 10;
	static int b = 20;
	static final int c = 30;

	public void printAll() { // printAll은 OuterClassEx3의 멤버메서드
//		int k = 0; // 지역변수

		class LocalInnerClass { // printAll메서드 안쪽에 지역변수처럼 존재, 따라서 printAll메서드가 종료되면 사라지는 클래스
			int d = 40;
			static int e = 50;
			static final int f = 60;

			void print() {
				System.out.println("a : " + a);
				System.out.println("b : " + b);
				System.out.println("c : " + c);
				System.out.println("d : " + d);
				System.out.println("e : " + e);
				System.out.println("f : " + f);
			} // end of print() 

		} // end of LocalInnerClass
			// 얘를 사용하고 싶다면 LocalInnerClass 바깥에서 객체 생성
		LocalInnerClass lic = new LocalInnerClass();
		lic.print();

	} // end of printAll()

	public static void main(String[] args) {
		OuterClassEx3 oc3 = new OuterClassEx3();
		oc3.printAll();
	} // end of main

} // end of OuterClassEx3
