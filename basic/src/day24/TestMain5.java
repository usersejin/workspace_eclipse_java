package day24;

import java.util.ArrayList;
import java.util.List;

public class TestMain5 {

	// wildcard : ? 모든 타입 허용
	public static void printList(List<?> list) {
		for(Object obj : list) {
			System.out.println(obj);
		}
	}
	
	// <? extends T> T 클래스의 하위 클래스만 허용
	public static void printNumber(List<? extends Number> list) {
		for (Number num : list) {
			System.out.println(num.doubleValue());
		}
	}
	
	// <? super T> T 클래스의 상위 클래스만 허용
	public static void printNumber2(List<? super Integer>list) {
		System.out.println(list);
	}
	
	// 컴파일시 오류 
	public static void main(String[] args) {
		
//		ArrayList<Horse> list = new ArrayList<Horse>();
		
		ArrayList<Mamma> list = new ArrayList<Mamma>(); // 부
		
//		Horse h1 = new Horse();
//		list.add(h1);
		list.add(new Horse());
		
		System.out.println("list : " + list);
		
		list.add(new Whale());
		
		
		
	}

}
