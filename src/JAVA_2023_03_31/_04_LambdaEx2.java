package JAVA_2023_03_31;

interface MyFunction2{
	int calc(int x);
}

public class _04_LambdaEx2 {
	public static void main(String[] args) {
		MyFunction2 square = x -> x * x;
		System.out.println(square.calc(2));
	}
}
