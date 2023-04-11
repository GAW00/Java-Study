package JAVA_2023_03_31;

import java.util.function.BiFunction;

class Calculator{
	public static int add(int a, int b) {
		return a + b;
	}
}

public class _09_BiFunctionTest {
	public static void main(String[] args) {
//		BiFunction 인터페이스는 매개변수 2개를 받고, 하나의 객체를 반환
//		BiFunction<Integer, Integer, Integer> obj = (x1, x2) -> x1 + x2;
//		특정 객체의 메소드 참조(클래스or인터페이스::메소드)
		BiFunction<Integer, Integer, Integer> obj = Calculator::add;
		int result = obj.apply(10, 20);
		System.out.println("주어진 수의 덧셈 : " + result);
	}
}
