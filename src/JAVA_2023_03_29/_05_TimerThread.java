package JAVA_2023_03_29;

public class _05_TimerThread extends Thread{
	int n = 0;
	@Override
	public void run() {
		while(true) {
			System.out.println(n);
			n++;
			try {
				// 1초마다 실행
				sleep(1000);
//			예외 발생할때 e로 catch 해서
			} catch (InterruptedException e) {
//				printStackTrace()메소드로 기본 예외처리 에세지 출력
				e.printStackTrace();
			}
		}
	}
}

