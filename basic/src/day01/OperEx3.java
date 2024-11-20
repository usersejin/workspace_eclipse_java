package day01;
// 3. shift 연산자
// >>(오른쪽으로 밀어), <<(왼쪽으로 밀어), >>> 
// 게임같은 빠른 성능을 우선으로하는  시스템 개발을 위해 사용
// web 잘 사용하지 않음
// c >> 2 : 빈 공간을 0으로 채움
// c >>> 2 : 두칸 밀고, 빈 공간을 부호로 채움 
public class OperEx3 {
	public static void main(String[] args) {
		byte b = 10; 
		System.out.println("b >> 2 : " + (b>>2)); // 0000 1010 을 두칸 오른쪽으로 밀어 0000 0010
												// >> 은 원래 값 / 두칸 오른쪽으로 밀었으니까 (2^2) 2
		System.out.println("b << 2 : " + (b<<2)); // 0000 1010 을 두칸 왼쪽으로 밀어 0000 1010
												// << 은 원래 값 * 두칸 왼쪽으로 밀었으니까 (2^2) 40
		byte c = 20;
		System.out.println("c >> 2 : " + (c>>2)); // 20/4 
		System.out.println("c << 2 : " + (c<<2)); // 20*4
	}

}
