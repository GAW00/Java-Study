package JAVA_2023_03_31;

import java.util.function.Supplier;

public class _10_InstanceMethod {
	public static void main(String[] args) {
		String s = "Hello World!";
//		System.out.println(s.length());
		
//		람다식)
//		print(() -> s.length());
		
//		메소드 참조)
//		객체 :: 메소드 = 객체의 메소드에 인자 전달
		print(s::length);
	}
	
//	Supplier 인터페이스는 매개변수는 없고, 반환 값만 있음
	static void print(Supplier<Integer> f) {
		System.out.println(f.get());
	}
}
