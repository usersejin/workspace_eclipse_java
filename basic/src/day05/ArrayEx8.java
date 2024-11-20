package day05;
// 랜덤값 출력 Math.random()
// temp 변수 이용해서 두 변수의 값 교환하기
public class ArrayEx8 {
	public static void main(String[] args) {
		
		// 랜덤값 출력
		
		// 0 < Math.random() < 1
		
		System.out.println(Math.random());
		
		// 0부터 9까지 정수를 구하기
		// 0*10  < Math.random()*10 < 1*10
		System.out.println((int)Math.random()*10); // 이렇게만 하면 형변환이 먼저 되고 *10을 하므로 0만 출력됨
		System.out.println((int)(Math.random()*10)); // 이렇게 해야지 정수만 남는다
		
		
		// 0부터 44 사이의 랜덤 정수 구하기
		for (int i=0; i<100; i++) { // 범위 안에서 잘 실행됐는지 확인하는 for문
			System.out.println((int)(Math.random()*45));
		}
		
		System.out.println("-------------------------------");
		
		int a = 100;
		int b = 20;
		
		System.out.println("a: " + a + ", b: " + b);
		System.out.println("--------- 자리 바꿈하기 ---------");
		
		// 임시변수 사용
		int temp = 0;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("a: " + a + ", b: " + b);	
	
	}

}
