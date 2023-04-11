package JAVA_2023_03_24;

// 기본적인 폰, 전화를 걸어서 100초 동안 응답 없으면 타임아웃
// 전화 걸고, 받는 기능, 화면에 폰이라고 출력
interface Phoneinterface{
//	public static final int TIMEOUT = 100;
	int TIMEOUT = 100;  // public static final 생략 가능
	
//	public abstract void sendCall();
	void sendCall();	// public abstract 생략 가능
	void receiveCall();
	
	default void printLogo() {  // default(일반메소드)는 구현 해야 함(아니면 오류)
		System.out.println("** Phone **");
	}
}

// 삼성 휴대폰을 만들 때 기본 휴대폰의 기능을 사용(전화 걸고, 받기)
class SamsungPhone implements Phoneinterface{
//	Phoneinterface로부터 상속 받은 추상메소드 오버라이딩 2개
	@Override
	public void sendCall() {
		System.out.println("띠리리링");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다");
	}
	
//	삼성폰 고유 기능
	public void flash() {System.out.println("전화기 라이트가 켜졌습니다");}
}

public class InterfaceEx {
	public static void main(String[] args) {
		SamsungPhone sp = new SamsungPhone();
		sp.printLogo();		// 인터페이스 상속받아서 사용
		sp.sendCall();		// 추상메소드로 구현해 사용
		sp.receiveCall();	// 추상메소드로 구현해 사용
		sp.flash();			// 삼성폰 고유의 기능
	}
}
