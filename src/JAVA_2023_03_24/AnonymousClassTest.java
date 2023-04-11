package JAVA_2023_03_24;

interface RemoteControl{
	void turnOn();
	void turnOff();
}

abstract class test{
	abstract void a(int a);
	void b(int a) {
		System.out.println(a);
	}
}

public class AnonymousClassTest {
	public static void main(String[] args) {
//		익명 클래스 정의(인터페이스 이름 사용 -> 객체 생성)
		RemoteControl rc = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("TV turn On");
			}

			@Override
			public void turnOff() {
				System.out.println("TV turn Off");
			}
			
		};
		
//		익명 클래스 객체의 메소드 호출
		rc.turnOn();
		rc.turnOff();
		
//		클래스도 이넡페이스와 마찬가지로 익명사용 가능
		test t = new test() {
			@Override
			void a(int a) {
				System.out.println(a + 1);
			}
		};
		t.a(10);
		t.b(10);
	}
}
