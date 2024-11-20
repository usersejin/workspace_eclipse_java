package day09;

public class TestMain8 {
	public static void main(String[] args) {
		
		Monkey m = new Monkey();
		
		m.eating();
		m.sleeping();
		m.climbing();
		
		System.out.println("-------------");
		
		Rabbit r = new Rabbit();
		
		r.eating();
		r.sleeping();
		r.jumping();
		
		System.out.println("-------------");

		Whale w = new Whale();
		
		w.eating();
		w.sleeping();
		w.swimming();
		
		System.out.println("-------------");

		Horse h = new Horse();
		
		h.eating();
		h.sleeping();
		h.run();
	}

}
