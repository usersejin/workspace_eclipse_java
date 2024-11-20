package day23;

public class TestMain2 {
	public static void main(String[] args) {
		MobilePhone mp = new MobilePhone();
		
		System.out.println(mp instanceof MobilePhone);
		
		System.out.println("제조사 : " + mp.company);
		
		mp.calling("010-1111-333");
		mp.playGame();
		mp.pickingUp();
		
		MobilePhone mp1 = new MobilePhone("애플", 1600000, "ap12342345");
		MobilePhone mp2 = new MobilePhone("애플", 1600000, "ap12342345");
	
		System.out.println(mp.company);
	
	}
 
}


