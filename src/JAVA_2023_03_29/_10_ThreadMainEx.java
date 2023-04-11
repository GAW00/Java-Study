package JAVA_2023_03_29;

public class _10_ThreadMainEx {
	public static void main(String[] args) {
//		현재 실행중인 스레드
		String name = Thread.currentThread().getName();		 // 현재 실행중인 스레드의 이름
		Long id = Thread.currentThread().getId();			 // 현재 실행중인 스레드의 고유한 번호
		int priority = Thread.currentThread().getPriority(); // 현재 실행중인 스레드의 우선순위(메인 메소드의 우선순위 초기값 = 5)
		Thread.State s = Thread.currentThread().getState();	 // 현재 실행중인 스레드의 상태(Runnable : 스레드 6가지 상태중 하나다)
		
		System.out.println("현재 스레드 이름 : " + name);
		System.out.println("현재 스레드 ID : " + id);
		System.out.println("현재 스레드 우선순위 값 : " + priority);
		System.out.println("현재 스레드의 상태 : " + s);
	}
}
