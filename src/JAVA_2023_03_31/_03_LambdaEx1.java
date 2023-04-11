package JAVA_2023_03_31;

interface MyFunction{
	int calc(int x, int y);	// 람다식으로 구현할 추상 메소드
}

public class _03_LambdaEx1 {
	public static void main(String[] args) {
		MyFunction add = (x, y) -> {return x + y;};	// 람다식
		MyFunction minus = (x, y) -> x - y;	// 람다식({}와 return 생략 ==> return을 생략 해야 {}도 생략 가능
		
		System.out.println(add.calc(1, 2));
		System.out.println(minus.calc(1,2));
	}
}
