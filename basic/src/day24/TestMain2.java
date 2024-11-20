package day24;

public class TestMain2 {
	public static void main(String[] args) {
		
		Police p = new Police();
		
		Gun g = new Gun();
		
		p.setW(g);
		
		p.w.use();
		
		TaserGun tg = new TaserGun();
		
		p.setW(tg);
		p.w.use();
		
		TacticalBaton t = new TacticalBaton();
		p.setW(t);
		p.w.use();
		
		
	}

}
