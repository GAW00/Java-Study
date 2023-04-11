package JAVA_2023_03_24;

// 상속받은 life 필드도 포함해 객체 생성시 멤버 4개
// 조류를 상속받는 펭귄, 오리를 만든다
abstract class Bird extends Animal{
	public int wing = 2;
	
	public void walk() {
		System.out.println("walk");
	}
	public void eat() {
		System.out.println("eat");
	}
}
