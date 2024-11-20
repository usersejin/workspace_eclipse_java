package day14;

import java.text.SimpleDateFormat;
import java.util.Date;

// 자바에서 날짜와 관련된 클래스

public class UtilEx02 {
	public static void main(String[] args) {
		Date d = new Date();

		// 1900년을 기준으로 지금까지의 년도 //124 -> 2024년
		System.out.println("연도 : " + (d.getYear() + 1900));
		System.out.println("월 : " + (d.getMonth() + 1)); // 0월부터 시작이므로 +1해줘야 해
		System.out.println("-----------------------------");

		long time = System.currentTimeMillis(); // 1970년 1월 1일 기준
		System.out.println("System.currentTimeMillis() : " + time);

		// 날짜 형식을 사용
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String time2 = sdf.format(d); // 그 날짜를 이런 형식으로 변환해서 리턴
		System.out.println(time2);

		System.out.println("System.currentTimeMillis()를 sdf.format() 형식으로 출력 : " + sdf.format(time));
		// 지금 날짜 형식으로 보여줌 (1727753947953)을 2024/10/01 12:39:07 형태로)

	}

}
