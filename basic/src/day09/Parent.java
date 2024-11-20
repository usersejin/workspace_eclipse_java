package day09;

public class Parent {
	
	String name, job;
	int age;
	
	Parent(){
		this.name = "홍길동";
		this.age = 20;
		this.job = "도적";
		System.out.println("Parent의 기본생성자");
	}
	
	Parent(String name, int age, String job){
		this.name = name;
		this.age = age;
		this.job = job;
	}
	public void eating() {
		System.out.println("먹기 냠냠");
	}
	
	public void singing() {
		System.out.println("부모의 옛날 노래 부르기");
	}
	
	public void sleeping() {
		System.out.println("잠자기");
	}
	
	public void nagging() {
		System.out.println("잔소리");
	}
}
