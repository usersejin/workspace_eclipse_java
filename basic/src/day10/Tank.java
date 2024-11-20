package day10;

public class Tank extends Terran {
	int 공격력, 사거리, 방어력, 공격속도, 이동속도;
	
	Tank(){
		공격력 = 10;
		
		x = 0;
		y = 0;
		hp = 300;
		
		사거리 = 10;
		공격력 = 10;
		방어력 = 8;
		공격속도 = 3;
		이동속도 = 1;
	}
	void 공격하기(Marine x) {
		System.out.println("시즈탱크에서 공격함");
		x.hp -= 공격력;
	}

}
