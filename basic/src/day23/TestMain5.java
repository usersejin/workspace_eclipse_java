package day23;

import day09.Person;
import day09.SuperMan;

// 
public class TestMain5 {
	public static void main(String[] args) {
		
		Police p = new Police();
		
		Gun g= new Gun();
		
		g.fire(); // -> 경찰은 가만히 있고 총이 자동으로 쏘지는 것
		p.g.fire(); // -> 경찰이 총을 들고 쏘는 것 (단, 이렇게 쓰려면 police 클래스에서 gun을 멤버변수로 선언해야해)
	}

}