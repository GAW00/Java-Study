package JAVA_2023_03_29;

public class _06_TestThread {
	public static void main(String[] args) {
		// 스레드 객체 생성
		_05_TimerThread th = new _05_TimerThread();
		// 스레드 실행되면서 JVM 스케쥴링
		th.start();
	}
}
