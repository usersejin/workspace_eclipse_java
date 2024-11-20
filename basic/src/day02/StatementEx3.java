package day02;

public class StatementEx3 {
	public static void main(String[] args) {
		
//		while(조건){
//			문장1;
//			문장2;
//			}
		int i = 1;
		
		while(i<=9) {
			System.out.println("3 * " + i + "=" + 3*i);
			i++; // 무한루프를 막아줌, 이게 없으면 i는 항상 9보다 작으므로 무한루프가 됨
		}
		////////////////////////////////////////////////////////
		
//		do {		// 일단 do 먼저(문장1, 2)하고 while 조건봄
//			문장1;
//			문장2;
//		} while(조건);
		
		int j = 1;
		do {
			System.out.println("3 * " + j + "=" + 3*j);
			j++;
		} while(j<=9);
		
		
 	}
}
