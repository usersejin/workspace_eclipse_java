package day14;

import java.util.Stack;
// 자바에는 자료구조가 다 정의되어 있어서 갖다 쓰기만 하면 돼.. 


public class StackEx1 {
	public static void main(String[] args) {

		Stack s = new Stack();

		s.push("딸기");
		s.push("포도");
		s.push("배");
		System.out.println("s : " + s);

		// LIFO (last-in-first-out) -> 입/출력되는 순서
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println("s : " + s);

		s.add("두리안");
		s.add("잭플룻");
		s.add("잭플룻");

		System.out.println("s : " + s);

		System.out.println("0번째 요소 : " + s.get(0));

	}
}
