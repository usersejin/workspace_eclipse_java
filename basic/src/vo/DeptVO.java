package vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// lombok의 어노테이션은 클래스 위에 위치 해야 함
//@Data // 밑에 있는거 모두 가능 (builder 제외)
@Getter
@Setter
@AllArgsConstructor // 매개변수 있는 생성자
@NoArgsConstructor // 기본생성자 -> final 변수 (상수)가 있으면 사용 불가
////@RequiredArgsConstructor // final 변수 (상수) 있을 때 -> 필수적으로 값이 있어야 하는 아규먼트들에게 매개변수를 포함시켜서 만들어줘
@ToString // object 를 오버라이딩한 ToString

@Builder // 각 변수에 맞게 값을 할당 할 수 있게 함
public class DeptVO {

	
//	final private int deptno;
	private int deptno;
	private String dname;
	private String loc;

// @ToString 기능
// object 의 toString 메서드를 오버라이드
//	@Override
//	public String toString() {
//		String value = 
//				this.getDeptno() + " : " + this.getDname() + " : " + this.getLoc();
//		return value;
//	}

}
