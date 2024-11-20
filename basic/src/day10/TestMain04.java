package day10;
// TestMain03 과 이어짐

public class TestMain04 {
	public static void main(String[] args) {
		
		Police p = new Police();
		
		SlingShot ss = new SlingShot(); 
		
		p.setSs(ss); 
		
		p.ss.use();
		p.ss.use();
	
		p.ss.reuse();
		p.ss.use();

		
		
	}

}
