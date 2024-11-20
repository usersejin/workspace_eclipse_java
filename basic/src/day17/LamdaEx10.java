package day17;
//미리 정의되어 있는 인터페이스 사용 : 람다식
// 예제임
import java.util.function.Consumer;

public class LamdaEx10 {
	public static void main(String[] args) {

		// 람다식 써보기
		Consumer<String> c = s -> System.out.println(s);

		c.accept("오늘은");
		c.accept("월요일");
	}

}
