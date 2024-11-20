package day11;

public class Object01 {
	public static void main(String[] args) {

		Object obj1 = new Object();
		Object obj2 = new Object();

		System.out.println("obj1 : " + obj1);
		System.out.println("obj2 : " + obj2);

		if (obj1 == obj2) {
			System.out.println("obj1과 obj2는 같은 객체");
		} else {
			System.out.println("obj1과 obj2는 다른 객체"); // 다른 객체 출력, 참조값이 다르기 때문에
		}

		if (obj1.equals(obj2)) { // 동일한지 아닌지 boolean 타입 반환
			System.out.println("obj1과 obj2는 같은 객체");
		} else {
			System.out.println("obj1과 obj2는 다른 객체"); // 연산자와 동일한 기능을 함

		}
		System.out.println("---------------------------------");

		System.out.println("obj1 : " + obj1);
		System.out.println("obj1.toString() : " + obj1.toString());

		// getClass(): 실행 중인 객체를 리턴

		Class c = obj1.getClass();
		String className = c.getName();
		System.out.println(className);

		System.out.println(obj1.getClass().getName()); // getClass의 .getName()하면 이름이 바로 나와
		System.out.println(obj1.getClass().getName() + "@");

		// hashCode(); 해쉬코드값
		// Integer.toHexString() : 16진수
		System.out.println(obj1.getClass().getName() + "@" + Integer.toHexString(obj1.hashCode()));

	}

}
