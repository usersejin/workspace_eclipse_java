package day09;

// 다른 패키지에 있는 클래스를 사용하는 방법 2가지 중 첫번째 방법
// 1. import 패키지명.클래스명;
// 2. 패키지명.클래스명 변수명 = new 패키지명.생성자명()
import day07.Person;

public class TestMain1 {
	public static void main(String[] args) {
		//person 클래스 사용하려고 한다
		
		Person p1 = new Person(); 
		p1.setAge(20);
		System.out.println(p1.getAge());
	}

}
