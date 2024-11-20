package day07;
// Car class 불러오기

public class TestMain {
	public static void main(String[] args) {
		// 설계도를 가지고 객체 만들기
		
		// 클래스명 (참조)변수명; => like 자료형 변수명;
		// (참조)변수 : 클래스에 접근할 수 있는 변수
		Car c;
		// 참조변수 = new 생성자();
		c = new Car(); // new : 객체 할당 연산자 
		
		System.out.println("c : " + c);
		
		// 핸들이 몇개지?
		// . (dot 연산자) : 참조값을 보고 찾아가라고 
		System.out.println(c.핸들);
		
		// 제조사?
		System.out.println(c.제조사);
		
		c.전진();
		
		c.후진();
		
		c.바퀴 = 4; // 불러와서 변수의 값을 변경할 수 있음 
		// c자동차의 바퀴가 몇개인지 출력
		
		System.out.println("바퀴 : " + c.바퀴);
		
		//c2 자동차의 바퀴 4, 차종은 벤틀리, 핸들1로 설정
		Car c2 = new Car(); // 클래스명 참조변수명 = new 생성자();
		c2.바퀴 = 4;
		c2.차종 = "벤틀리";
		c2.핸들 = 1;
		
		c.바퀴 = 2;
		
		System.out.println(c2.바퀴);
		System.out.println(c2.차종);
		
		System.out.println(c.바퀴); // c2와 c는 다른 열쇠
		
		// 메모리에 할당된 객체 : instance
		// 하나의 클래스로부터 여러개의 인스턴스 생성가능
		
		// 새로운 자동차 객체를 만들고
		Car friendCar = new Car();
		// 멤버변수의 값을 (임의의 값 사용) 초기화시키고
		friendCar.차종 = "아이오닉";
		friendCar.바퀴 = 4;
		friendCar.문 = 2;
		friendCar.속도 = 0;
		friendCar.핸들 = 1;
		
		System.out.println(friendCar.차종);

		// 전진 시켜보세요
		friendCar.전진();
		friendCar.후진();
		
		
		
	}

}
