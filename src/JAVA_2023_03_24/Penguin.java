package JAVA_2023_03_24;

// 생명1개, 날개2개, 걷기, 먹기 + 수영하기(인터페이스)
// 객체 생성시 멤버 5개
// 클래스의 다중상속 안됨
// public class Penguin extends Bird, Swim{
// 인터페이스는 다중상속 가능(implement 키워드 사용)
public class Penguin extends Bird implements Swim2{
//	추상메소드는 구현해야 함
	@Override
	public void swim() {
		System.out.println("penguin swims");
	}
}
