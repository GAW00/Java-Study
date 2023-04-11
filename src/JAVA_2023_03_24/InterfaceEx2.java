package JAVA_2023_03_24;

interface Phoneinterface2{
	int TIMEOUT = 100;  // public static final 생략 가능
	
	void sendCall();	// public abstract 생략 가능
	void receiveCall();
	
	default void printLogo() {  // default(일반메소드)는 구현 해야 함(아니면 오류)
		System.out.println("** Phone **");
	}
}

// PCS(ex> 016, 018, 019)
// 문자를 보내고 받는 기능을 추상메소드로 선언
// 인터페아ㅣ스 간의 상속 -> extends 사용
interface MobilePhoneInterface extends Phoneinterface2{
	void sendSMS();		// public abstract 생략
	void receiveSMS();	// public abstract 생략
}

// MP3 플레이어 : 음악재생, 정지 기능을 추상메소드로 선언
interface MP3Interface{
	void play();		// public abstract 생략
	void stop();		// public abstract 생략
}

// PDA기기 : 계산기능을 메소드로 구현
class PDA{
	public int calculate(int x, int y) {
		return x + y;
	}
}

// 아이폰 : 계산기능, 문자전송, 음악기능을 상속 받음
class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface{

	@Override
	public void sendCall() {
		System.out.println("띠리리링");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니당");
	}

	@Override
	public void play() {
		System.out.println("음악을 연주합니다");
	}

	@Override
	public void stop() {
		System.out.println("음악을 중단합니다");
	}

	@Override
	public void sendSMS() {
		System.out.println("문자를 보냅니다");
	}

	@Override
	public void receiveSMS() {
		System.out.println("뮨자를 받았습니다");
	}

//	아이폰 만의 고유기능
	public void schedule() {
		System.out.println("일정을 관리합니다.");
	}
	
}

public class InterfaceEx2 {
	public static void main(String[] args) {
		SmartPhone ip = new SmartPhone();
		ip.printLogo();
		ip.sendCall();
		ip.receiveCall();
		ip.play();
		ip.stop();
		ip.sendSMS();
		ip.receiveSMS();
		ip.schedule();
	}
}
