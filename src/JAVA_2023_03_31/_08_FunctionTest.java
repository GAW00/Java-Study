package JAVA_2023_03_31;

import java.util.function.Function;

public class _08_FunctionTest {
	public static void main(String[] args) {
//		Function 인터페이스로 람다식 개체 구현
		Function<Integer, Integer> f1 = i -> i * 4;
		System.out.println(f1.apply(3));
		
//		String : 매개변수 타입, Integer : 리턴 타입
//		Function<String, Integer> f2 = String::length;
		Function<String, Integer> f2 = s -> s.length();
		System.out.println(f2.apply("Hello World!"));
	}
}
