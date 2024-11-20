package day14;

import java.util.Calendar;
// 여기 중간부터 가심..
// 수업 진행 순서 : Util -> Exception -> Vector -> ArrayList -> Stack

public class UtilEx3 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); // 생성자가 protected이기에 new Calendar 사용 안돼 -> getInstance를 사용

		System.out.println("cal : " + cal);
		System.out.println("cal : " + cal.toString());

//		cal.get("멤버필드");

		int week = cal.get(Calendar.WEEK_OF_YEAR); // 올해의 몇째 주인지
		System.out.println("오늘은 올해의 " + week + "번째 주입니다.");
		
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(1)); 
		
		System.out.println("월 : " + cal.get(Calendar.MONTH)+1); // 0월부터 시작
		System.out.println(cal.get(2)); // get(2+1) 여기에 더할 수 없음

		System.out.println("일 : " + cal.get(Calendar.DATE));
		
		// 일주일 중에 오늘의 날짜는 몇번째?
		System.out.println("일주일 중에 오늘의 날짜는 몇번째? : " + cal.get(Calendar.DAY_OF_WEEK)); 
		// 화요일 기준 3번째 -> 일요일부터 시작  
	}

}
//
//
//
// 제 몫까지 잘부탁드립니다ㅎㅎ..
//
//
//