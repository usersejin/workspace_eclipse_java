package day25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestMain {
	public static void main(String[] args) {
		String searchData = 
				"HonGildong 20 남양_한양 hong@gmail.com 02-1234-5678 $5,000.50"
				+ "CheonSejin 20 서울 cheon@gmail.com 02-1111-2222"
				+ "천세진 20 서울 cheon1@gmail.com 02-2122-4444";
		
		String searchData2 = "welt7643@naver.com";
		
		Pattern pattern = Pattern.compile("Ch"); // 찾을 특정 문자열을 여기에 넣음
		Pattern pattern1 = Pattern.compile("\\d"); // 특별한 의미가 있는 d 숫자만 찾음
		Pattern pattern2 = Pattern.compile("\\w"); // _ 를 포함한 문자열을 의미(한글 제외)
		Pattern pattern3 = Pattern.compile("\\d+"); // 연속된(+) 숫자를 출력 
		Pattern pattern4 = Pattern.compile("\\d{3}"); // 연속된 3자리 숫자를 출력
		Pattern pattern5 = Pattern.compile("\\d{2}-\\d{4}-\\d{4}"); // 핸드폰 번호만 구하기
		Pattern pattern6 = Pattern.compile("[a-z]+"); // 연속된(+) 소문자 (대소문자 구분이 됨)
		Pattern pattern7 = Pattern.compile("[A-Z]"); // 연속된(+) 대문자 (대소문자 구분이 됨)
		Pattern pattern8 = Pattern.compile("[가-힣]+"); // 연속된 한글
		Pattern pattern9 = Pattern.compile("\\$[0-9,\\.]+"); // $5,000.50 찾기 
		// \\$ : 특수기호로서의 의미가 사라짐(메타기호로 사용되지 않음)
		// [0-9]+ : 연속된 숫자, [0-9,\\.]+ : ,과 . 을 포함한 숫자 (\\. : 메타기능을 없앤 문자 .)
		
		// 이메일 형식 검사 welt7643@naver.com
				// 대문자 소문자 숫자 _ -  .
				
				// [A_Za-z0-9_\\-\\.] + 
				
		
		Pattern pattern10 = Pattern.compile("[A_Za-z0-9_\\\\-\\\\.]+@[a-zA-Z0-9_\\-]+\\.[a-zA-Z0-9]{2,}");
		// {2,} 2자 이상(,)
		Matcher matcher = pattern10.matcher(searchData2);
		
		
		while(matcher.find()) {
			System.out.println(matcher.group());
			
		}
	}

}
