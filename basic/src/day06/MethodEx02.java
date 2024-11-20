package day06;

public class MethodEx02 {
	
	static void printCode(String str) {
		for (int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(str);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		printCode("+");
//		+
//		++
//		+++
//		++++
//		+++++
		printCode("-");
//		-
//		--
//		---
//		----
//		-----
	}

}
