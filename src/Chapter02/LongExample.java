package Chapter02;

public class LongExample {
	public static void main(String[] args) {
		long var1 = 10;
//		20L : 명시적오로 Long 타입 리터럴(값)
		long var2 = 20L;
//		범위 벗어나서 오류
//		long var3 = 10000000000000; // 정수는 선언시 기본 int형
		long var4 = 10000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
		
	}
}
