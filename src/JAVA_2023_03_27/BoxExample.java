package JAVA_2023_03_27;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동");				 // 업캐스팅 발생!
		String name = (String)box.get(); // 다운캐스팅 발생!
		System.out.println(name);
		
		box.set(777);					 // 업캐스팅 발생!
		int number = (int)box.get();	 // 다운캐스팅 발생!
		System.out.println(number);
		
		box.set(new Apple());			 // 업캐스팅 발생!
		Apple apple = (Apple)box.get();	 // 다운캐스팅 발생!
		System.out.println(apple);
	}
}
