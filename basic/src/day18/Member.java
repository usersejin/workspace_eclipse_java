package day18;

import java.io.Serializable;

// 이런식으로 클래스의 형태를 갖춘 클래스 들을 javaBean( = vo, dto, POJO...) 
// 변수, settergetter, 생성자(기본, 매개)
public class Member implements Serializable {
	private String id, pw, name, addrs, email;
	private transient int age; // transient 이 변수는 직렬화 대상에서 제외해

	// setter getter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddrs() {
		return addrs;
	}

	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 기본 생성자 , 매개변수 있는 생성자
	public Member() {

	}

	public Member(String id, String pw, String name, String addrs, String email, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.addrs = addrs;
		this.email = email;
		this.age = age;
	}

}
