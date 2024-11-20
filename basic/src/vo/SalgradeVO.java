package vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter // lombok.jar 에서 사용 가능 한 getter 
@Setter // setter 
@AllArgsConstructor // 매개변수 있는 생성자
@NoArgsConstructor // 매개변수 없는 생성자
@ToString // 
public class SalgradeVO {
	
	private int grade;
	private int losal;
	private int hisal;
	
}
