package day10;

public class TestMain01 {
	public static void main(String[] args) {

		Marine m1 = new Marine();
		Marine m2 = new Marine();
		Medic me = new Medic();
		Tank t1 = new Tank();

		// m1 ==> m2 공격
		m1.공격하기(m2);
		m2.status(); // 공격하기로 m2의 체력 감소

		// me ==> m2 치료
		me.치료하기(m2);
		m2.status();
		
		// m1으로 me 를 공격
		m1.공격하기(me); // 
		me.status();
		
		// 탱그에서 마린 공격
		t1.공격하기(m2);
		m2.status();
		
		// m1이 탱크를 공격
		m1.공격하기(t1);
		
		me.치료하기(me);
		
		me.치료하기(t1);
	}
}
