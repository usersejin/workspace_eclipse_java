package vo;

public class MemberVO {
	
	int memno;
	String name, id, pw;
	int age;
	
	public int getMemno() {
		return memno;
	}
	public void setMemno(int memno) {
		this.memno = memno;
	}
	public String getName() {
		return name;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	public MemberVO() {
		
	}
	public MemberVO(int memno, String name, String id, String pw, int age) {
		super();
		this.memno = memno;
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.age = age;
	}
		

}
