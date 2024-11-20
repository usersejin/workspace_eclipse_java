package day13;

// 클래스의 중첩 왜? private 변수까지 접근하고 싶을 경우(클래스끼리 굉장히 긴밀하게 연결되어있어서)
// 1. Member Inner class (inner class의 위치 4가지 중 첫번째)
//클래스간에 서로 긴밀한 관계를 맺고 상호작용 -> 중첩 클래스로 선언하는 것이 유지보수에 도움이 되는 경우가 많음

//inner 클래스의 위치에 따라 4가지 구분
//1. Member Inner class -> Member 변수자리에 위치

public class OuterClassEx1 {
	private int a = 10;
	static int b = 20;
	static final int c = 30;

	// 멤버변수자리에 위치, 사용하는 클래스 : member inner class -> private에도 접근이 가능해져
	class InnerClass {
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
		}
	}

	public static void main(String[] args) {
		OuterClassEx1 oce = new OuterClassEx1(); // new 해서 OuterClassEx1 객체 생성
		OuterClassEx1.InnerClass ic = oce.new InnerClass(); // 내부에 있는 클래스의 객체 생성 -> OuterClassEx1의 참조변수로 가져와야해
		ic.print();

	}
}
