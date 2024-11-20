package day11;

public class StringBufferEx01 {
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		sb.append("하하하하");
		sb.append("하"); // 기존에 있던 글자 뒤에 추가

		System.out.println(sb.toString());
		System.out.println("버퍼의 길이 : " + sb.capacity()); // 16, 기본 생성자는 16칸 만들라고 했으므로

		sb.append("푸른 산호초 푸른 산호초");
		System.out.println(sb.toString());
		System.out.println("버퍼의 길이 : " + sb.capacity()); // 버퍼의 길이가 늘어남 그게 String과 다른 StringBuffer의 특징

		String str = "하하하";
		str = "하하하하";

		System.out.println("----------------------");
		// DB에 SQL문 사용

		sb.setLength(0); // 길이를 0으로 만들어 = 삭제하라는 의미
		System.out.println(sb.toString());
		System.out.println("버퍼의 길이 : " + sb.capacity());

		sb.append("SELECT * ");
		sb.append("FROM emp ");

		// db에 명령어를 전달 -> 일을 수행시킴

		System.out.println("출력 : " + sb.toString());
		System.out.println("출력 : " + sb.reverse()); // 역순으로 (= 뒤부터 출력)

		str = "월화수목금토일";

		StringBuffer sb2 = new StringBuffer(str); // String을 StringBuffer에 담고

		System.out.println(sb2.reverse()); // 역순으로 출력
	}

}
