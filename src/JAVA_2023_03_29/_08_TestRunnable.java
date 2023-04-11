package JAVA_2023_03_29;

public class _08_TestRunnable {
	public static void main(String[] args) {
//		Runnable로 만든 스레드는 Thread 객체의 생성자로 호출
		Thread th = new Thread(new _07_TimerRunnable());
//		스레드 실행되면서 JVM 스케쥴링
		th.start();
	}
}
