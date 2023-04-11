package JAVA_2023_03_31;

interface MyFunciton3{
	void print();
}

public class _05_LambdaEx3 {
	public static void main(String[] args) {
		MyFunciton3 f = () -> {System.out.println("Hello");};	// 람다식 작성
		f.print();	// 람다식 호출
		
		f = () -> System.out.println("안녕");		// 람다식 재작성
		f.print();	// 람다식 호출
	}
}
