package vo;

public class MemberVO1 {
	
	String id, pw, name;
	int memno;
	
	// setter, getter
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
	public int getMemno() {
		return memno;
	}
	public void setMemno(int memno) {
		this.memno = memno;
	}
	
	// 기본 생성자
	public MemberVO1() {
		
	}
	
	// 매개변수 있는 생성자
	public MemberVO1(String id, String pw, String name, int memno) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.memno = memno;
	}
	
}
