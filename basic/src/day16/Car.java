package day16;

import java.util.ArrayList;
import java.util.Random;

public class Car {
	// String 클래스만 담을 수 있는 전용 배열(크기가 조절되는 object 배열)
	// 차고
	ArrayList<String> list;

	String[] carNameList = { "벤츠", "람보", "제네시스", "꼬마자동차" };

	public Car() {
		list = new ArrayList<String>();

	}

	// 자동차 이름 얻어오기 getCarName(); 자동차 이름을 랜덤하게
	public String getCarName() {
		
		// 1번 방법
//		Random rnd = new Random();
//		int idx = rnd.nextInt(carNameList.length);
//		return carNameList[idx];
		
		// 2번 방법
//		Random rnd = new Random();
//		return carNameList[rnd.nextInt(carNameList.length)];
		
		// 3번 방법
		return carNameList[new Random().nextInt(carNameList.length)];
	}
	
	// 차량을 생성하여 차고에 넣는 메서드
	public synchronized void push(String car) {
		// 랜덤하게 차량이름 하나를 얻어와서
		System.out.println("-------------------------------");
		System.out.println("차고에서 차량을 넣는 메서드 push()");
		System.out.println("현재 차고 상태 " + list);
		System.out.println("자동차를 생성하였습니다." + car);
		// ArrayList(차고)에 넣기
		list.add(car);
		
		
		// 자고있는 고객님 일어나세요 -> wait 되어있는 thread 하나 깨워
//		this.notify(); // 아무나 깨워 
		this.notifyAll(); // 다 깨워 -> 가장 오래 기다린 애부터 시작
		
	}
	
	// 차고에서 차량을 떠내는 메서드 pop()
	public synchronized String pop() {
		System.out.println("차고에서 차량을 꺼내는 메서드 pop()");
		System.out.println("현재 차고 상태 " + list);
		
		
		
		// 차가 있으면 출고
		// 없으면 기다려
		if(list.size() == 0) {
			System.out.println("차고에 차량이 없습니다. 잠시 기다리세요.");
			
			// block 상태가 되는 
			// 1. sleep
			// 2. wait
			// 3. suspend 는 deprecated 
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String carName = list.remove(list.size()-1); // 차고에 가장 마지막 차 // remove는 차를 꺼내서 리턴
		return carName;
	}

}
