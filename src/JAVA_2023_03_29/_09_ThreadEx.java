package JAVA_2023_03_29;

// Thread 클래스를 상속받는 방법1
class ThreadEx1 extends Thread{
	@Override
	public void run() {	// 스레드 구현 / run()오버라이딩 메소드는 스레드 실행시의 동작
		for (int i = 0; i < 5; i++) {
			System.out.println("i : " + i);
		}
	}
}

// Runnable 인터페이스를 상속 받는 방법2
//class TheradEx2 extends Thread{}
class ThreadEx2 implements Runnable{
	@Override
	public void run() {
		for (int j = 10; j < 15; j++) {
			System.out.println("j : " + j);
		}
	}
}

public class _09_ThreadEx {
	public static void main(String[] args) {
		// 스레드 객체 생성
		ThreadEx1 t1 = new ThreadEx1();
		
		// 방법 1)
		Thread t2 = new Thread(new ThreadEx2());
		// 방법 2)
//		Runnable r = new ThreadEx2();
//		Thread t2 = new Thread(r);
		
		t1.start();	// 스레드로 작동 시작 / JVM에 의해 우선순위 별 스케쥴링 시작
		t2.start();
	}
}

