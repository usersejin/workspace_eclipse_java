package day13;
// 중첩 클래스 (아주 특별한 경우에 사용, 자주 사용은 X)
// 클래스간에 서로 긴밀한 관계를 맺고 상호작용 -> 중첩 클래스로 선언하는 것이 유지보수에 도움이 되는 경우가 많음
// inner 클래스의 위치에 따라 4가지 구분
// 1. Member Inner class -> Member 변수자리에 위치


// 1개의 .java 파일에 1개의 클래스를 두는 것이 원칙
// 두 클래스가 특별한 관계일 경우(연관성이 높을 경우) -> 두개 이상을 사용하기도 함 (대신 public class일 순 없음)
// private 변수까지 외부에서 접근할 수 있도록 하려면 -> 클래스를 중첩클래스로 만들어 -> 중첩 클래싀: 클래스안에 또 다른 클래스 존재

public class OuterClassEx {
	
	private int a = 10;
	static int b = 20;
	static final int c= 30;
	
	public void print() {
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
	}

	public static void main(String[] args) {
		InnerClassEx ic = new InnerClassEx();
		ic.iPrint();
	} // out of main
} // out of OuterClassEx1

	class InnerClassEx{
		private int d = 40;
		OuterClassEx ex1;
		
		InnerClassEx(){
			ex1 = new OuterClassEx();
		}
		
		public void iPrint() {
			ex1.print();
			System.out.println("d : " + d);
			// a변수의 값과 d변수의 값을 합한 값을 출력
//			System.out.println(ex1.a+ d); // a가 private한 변수이므로 외부에서 직접적인 접근이 불가능
		}
	
		
	}

