package day14;

import java.util.Vector;
// ** Java Collection Framework (JCF)
// 배열은 크기가 한번 정해지면 자유롭게 바꿀 수 없음 -> 몇개가 될 지 모르는 건 이용할 수 없어
// 다수의 데이터를 쉽고 효과적으로 처리할 수 있는 표준화된 방법을 제공하는 클래스의 집합
// 데이터를 저장하는 자료구조와 데이터를 처리하는 알고리즘을 구조화하여 클래스로 구현해 놓은 것

// ** 자료구조 
// 1. list : 순서(O), 중복(O) => 순서가 있는 요소들의 컬렉션, 중복 허용
// 1-1. ArrayList
// 1-2. Vector
// 1-3. Stack
// 2. SET : 순서(X), 중복(X) => 중복을 허용하지 않는 요소들의 컬렉션
// 3. MAP : KEY <==> VALUE 매핑 => key와 value 값을 쌍으로 묶어 이뤄진 데이터 구조
//		 (중복X)   (중복O)

// ** Vector
// 성장형 Object 배열 ; The Vector class implements a growable array of objects.
// 기본 생성자 10자리 ; Constructs an empty vector so that its internal data array has size 10.

public class VectorEx1 {
	public static void main(String[] args) {
		int[] m = new int[3];

		// 배열은 3칸

		System.out.println(m.length);
		System.out.println("------------------");

		Vector v = new Vector();
		v.add("딸기");
		v.add("포도");
		v.add("사과");
		v.add("배");
		v.add("수박");

		System.out.println("v : " + v);
		System.out.println(v.capacity()); // 기본생성자에서 10칸이라고 명시됨 (내부공간)
		System.out.println("현재 몇개 들어있나요? " + v.size()); // 내가 넣은 값의 개수 (사이즈)

		v.add("딸기"); // 중복된 값도 OK
		v.add("포도");
		v.add("사과");
		v.add("배");
		v.add("수박");
		v.add("딸기");
		v.add("포도");
		v.add("사과");
		v.add("배");
		v.add("수박");

		System.out.println(v.capacity()); // 공간이 늘어남, 모든 타입이 들어갈 수 있음
		System.out.println("현재 몇개 들어있나요? " + v.size());

		String fruit = "두리안";
		// Q. "두리안" 문자열에서 첫글자만 출력해보세요

		// A.
		System.out.println("첫글자만 출력 : " + fruit.substring(0, 1));

		// v.add(Object); 원래는 Object를 저장하는데 Object자리에 String 들어갈 수 있음 왜? 부모의 참조변수에 자식의
		// 참조값이 올 수있기 때문에
		v.add(fruit);
//		Object obj = fruit;
//		v.add(obj); // 위 두줄이 내부적으로 처리됨

		// * Vector 안에 있는 요소를 한개씩 꺼내기 get();
		// obj1이 가리키는 대상은 String 클래스, Vector[0]이 #100이라 하면 obj1에 #100이 저장됨
		Object obj1 = v.get(0); // Vector index이므로 0부터
		System.out.println(obj1);
		System.out.println(obj1.toString()); // toString 을 부르면 참조값이 아니라 String 클래스의 toString()을 불러오는 것
												// 즉 자기자신이 가지고 있는 글자를 반환

		System.out.println("--------------------");
//		System.out.println(obj1.subString(0,1)); // obj1은 Object 타입, 부모는 자식의 메서드를 쓸 수 없음
		String str = (String) obj1; // 객체 형변환 필요 // 예전에 했던 Child c2 = (Child)p;
		System.out.println(str.substring(0, 1)); // 객체 형변환 없이 바로 사용할 수 없음

		System.out.println("--------------------");

		// * Q. 들어있는 요소들을 꺼내서 출력 (for 문 사용)

		// A.
		for (int i = 0; i < v.size(); i++) { // v.size()로 들어가있는 개수 알 수 있음
			Object obj2 = v.get(i);
			System.out.println(obj2.toString());
		}

		System.out.println("--------------------");
		// * 들어있는 요소들을 꺼내서 출력, 첫번째 글자만 출력(for 문 사용)
		for (int i = 0; i < v.size(); i++) { // v.size()로 들어가있는 개수 알 수 있음
			Object obj2 = v.get(i);
			String str2 = (String) obj2; // 첫번째 글자만 출력
			System.out.println(str2.substring(0, 1));
		}
	}

}
