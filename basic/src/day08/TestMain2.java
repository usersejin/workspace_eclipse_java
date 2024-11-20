package day08;

import day07.Marine;
import day07.Medic;

public class TestMain2 {

	public static void main(String[] args) {

		ATM atm = new ATM();

		atm.deposit(5000);
		// 특정 변수의 외부접근을 차단
//		atm.balance = 20000000; // 특정 변수의 외부접근이 된 것임
		
		// 직접적인 접근은 막고 메서드를 통해서 간접적으로 변수에 접근
		// setXXX : setter 메서드
		// getXXX : getter 메서드
		
		atm.setBalance(200);
		
		atm.setName("홍길동"); 
		System.out.println(atm.getName() + "님 계좌입니다."); 
		
		
		atm.setAccountNo("234-567-8910");
		System.out.println(atm.getAccountNo());
		
		
		atm.withdraw(20);

		Marine m1; // 다른 패키지에 있는 marine을 import 해서 불러옴 
		Marine m2 = new Marine(); // 생성자가 안보인대
		// Marine 클래스로 가서 Marine() 생성자 앞에 public을 써주면 됨

//		Medic me = new Medic(); // import 없이 Medic() 앞에 public만 붙인다고 해선 안돼
		
		// 외부(다른 패키지)에서 작성한 클래스를 사용하는 방법 두가지
		// 1. 상단에 import 구문 작성
		// import day01.Marine;
		// 하위에 클래스를 사용하면 돼
		// Marine m1 = new Marine();
		
		// 2. 클래스명 생성자명 앞에 패키지명 명시
		// day07.Marine m2 = new day07.Marine();
		
		
		
	}

}
