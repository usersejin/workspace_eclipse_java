package day24;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

// Generic : 다양한 타입의 객체를 다루는 메서드, 클래스를 안전하게 작성할 수 있도록 도와주는 기능
// T : type, E : element, V : value, 
@Setter
@Getter
// E 는 실행시킬 지점의 자료형을 의미
public class SumValue<E> {
	
	E [] m;
	E sum ;
	
	public E cal() {
		for (E e : m) {
//		 sum += list[i];
			System.out.println(e);
		}
		return sum;
	}
	
	
	
	

}
