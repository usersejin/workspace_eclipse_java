package day07;

public class Human {
	int age;
	String name, job, gender, tel;

	Human() {
		name = "홍길동";
		job = "의적";
		gender = "남";
		tel = "010-1111-2222";
		age = 20;
	}
	
	Human(String a, int b, String c){
		// 매개변수는 지역변수이므로 여기를 벗어나면 사라짐
		name = a;
		age = b;
		job = c;
		gender = "남";
		tel = "010-1111-2222";
		
	}
	
	Human(String a, int b, String c, String d){
		name = a;
		age = b;
		gender = c;
		job = d;
	}
	
	Human(String a, int b, String c, String d, String e){
		name = a;
		age = b;
		gender = c;
		tel = d;
		job = e;
	}
	void eating() {
		System.out.println("냠냠");
	}

	void talking() {
		System.out.println("쏙닥");
	}

	void status() {

		System.out.println("이름 : " + name);
		System.out.println("직업 : " + job);
		System.out.println("성별 : " + gender);
		System.out.println("전화번호 : " + tel);
		System.out.println("나이 : " + age);

	}
}
