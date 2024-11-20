package day04;
// char 배열 ch를 선언하고
// 이 배열에 java world라는 글자를 담은 후
// 반복문을 사용해서 화면에 출력: java world
public class ArrayEx4 {
	public static void main(String[] args) {
		
		// char 배열 ch를 선언하고
		char[] ch = {'j', 'a', 'v', 'a',' ','w', 'o', 'r', 'l','d'};
		
		// 이 배열에 java world라는 글자를 담은 후
		// 반복문을 사용해서 화면에 출력: java world
		for (int i = 0 ; i < ch.length; i++) {
			System.out.print(ch[i]);
		}		
		System.out.println();
		System.out.println("=============================");
		
//		System.out.println(ch[9]);
//		System.out.println(ch[8]);
//		System.out.println(ch[7]);
//		System.out.println(ch[6]);
//		System.out.println(ch[5]);
//		System.out.println(ch[4]);
//		System.out.println(ch[3]);
//		System.out.println(ch[2]);
//		System.out.println(ch[1]);
//		System.out.println(ch[0]);
		
		// 역순으로 출력 (= 큰 수부터 출력)
		// ch.length(배열의 길이)는 10인데 인덱스는 9부터이므로 배열길이-1을 해줘야 함
		for (int i = (ch.length-1); i >= 0 ; i--) { 
			System.out.print(ch[i]);
		}
		
		// String 클래스 : 문자열 입력할 때
		String str = "java world"; // 내부적으로 알아서 배열처리함
		
		System.out.println();
		System.out.println(str);
	}

}
