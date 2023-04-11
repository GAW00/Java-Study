package JAVA_2023_03_24;

public class Main {
	public static void main(String[] args) {
//		new Animal(); 	// 추상클래스는 객체 생성 못함
		Animal a; 		// 객체 생성이 아닌 참조변수 선언은 가능하다
//		new Bird(); 	// 추상 클래스는 객체 생성 못함
		Penguin p = new Penguin();
		p.swim(); 		// 펭귄의 멤버 5개(life, wing, walk(), eat(), swim())중 수영하기
		Bird p2 = new Penguin(); 	 // 업캐스팅
//		p2.swim(); 		// 업캐스팅된 객체는 슈퍼클래스의 멤버만 접근할 수 있다(오류)
		p2.walk();		// 슈퍼클래스의 멤버 호출
		Penguin p3 = (Penguin)p2;	 // 다운캐스팅
		p3.swim();		// 다운캐스팅은 모든 멤버 접근 가능하게 해준다
		System.out.println();
		
		/* ------------------------------------------------------------------- */
		
		Bird d = new Duck();		 // 업캐스팅
		d.eat();		// 업캐스팅은 슈퍼클래스의 멤버만 접근 가능
		Duck d2 = (Duck)d;			 // 다운캐스팅
		d2.fly();		// 다운캐스팅은 모든 멤버 접근 가능하게 해준다
		System.out.println();
		
		/* ------------------------------------------------------------------- */
		
		
//		추상클래스를 참조변수 선언(슈퍼클래스)
		Animal d3 = new Duck();		 // 업캐스팅(슈퍼클래스의 멤버만 접근 가능)
		int x = d3.life;
		System.out.println("x = " + x);
		System.out.println();
		
		/* ------------------------------------------------------------------- */
		
		
//		new Swim2(); // 인터페이스는 객체 생성 못함
//		인터페이스를 참조변수 선언
		Swim2 s = new Penguin();
		s.swim();
		System.out.println();
		
		/* ------------------------------------------------------------------- */
		
		
//		인터페이스가 인터페이스 배열 2개를 가리킨다
//		객체배열과 형태 비슷
//		s2[0], s2[1] --> 참조변수
		Swim2[] s2 = new Swim2[2];
		s2[0] = new Penguin(); // s2[0] --> 참조변수
		s2[1] = new Duck();	   // s2[1] --> 참조변수
		s2[0].swim(); // penguin swims
		s2[1].swim(); // duck swims
		System.out.println();
		
		/* ------------------------------------------------------------------- */
		
		
//		java.lang.ArrayIndexOutOfBoundsException: 2
//		컴파일 단계는 알 수 없고(정적 바인딩 단계), 런타임 실행 시 오류 발생(동적 바인딩 단계)
		s2[2] = new Penguin();
		
		
	}
}
