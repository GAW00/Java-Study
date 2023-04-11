package JAVA_2023_03_29;

// Runnable 인터페이스 상속받아서 스레드 구현
public class _07_TimerRunnable implements Runnable{
	int n = 0;
	@Override
	public void run() {
		while(true) {
			System.out.println(n);
			n++;
			try {
				// 1초마다 실행
				// sleep 메소드는 Thread 클래스 내에 있기때문에 Runnable 인터페이스만
				// 상속받은 상태에서는 직접 클래스의 메소드임을 적어줘야 한다
				Thread.sleep(1000); 
//			예외 발생할때 e로 catch 해서
			} catch (InterruptedException e) {
//				printStackTrace()메소드로 기본 예외처리 에세지 출력
				e.printStackTrace();
			}
		}
	}
}
