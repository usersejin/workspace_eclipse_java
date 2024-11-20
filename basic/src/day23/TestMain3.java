package day23;


// TestMain3 - Member

public class TestMain3 {
	public static void main(String[] args) {

//		Member m1 = new Member();
//		Member m2 = new Member();
//
		
		Member m1 = Member.getInstance(); 
		Member m2 = Member.getInstance(); // 같은 참조값을 갖게 됨
		
		System.out.println(m1);
		System.out.println(m2);
	}

}
