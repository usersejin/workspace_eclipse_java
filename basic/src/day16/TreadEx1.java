package day16;

// Thread

// CPU : 
// 메모리를 할당받아 실행중인 프로그램 ==> 프로세스

// 프로그램내에서 실행되는 흐름의 단위 ==> 스레드

// 채팅 + 파일도 전송 ==> 동시에 Multi thread

// 자바는 멀티 스레드와 멀티태스크 지원

// Multi Thread 방법
// 1. Thread 클래스 상속
// 2. Runnable 인터페이스 상속

public class TreadEx1 {
	public static void main(String[] args) {

		Thread th = Thread.currentThread(); // 현재 실행중인 스레드

		String threadName = th.getName(); // 스레드 이름
		System.out.println("현재 실행 중 인 스레드 이름 : " + threadName);
	}

}
