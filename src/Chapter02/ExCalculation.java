package Chapter02;

import java.util.Scanner;

public class ExCalculation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("2개의 실수 입력>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("두수의 덧셈은 " + ((double)a + b));
		System.out.println("두수의 뻴셈은 " + ((double)a - b));
		System.out.println("두수의 곱셈은 " + ((double)a * b));
		System.out.println("두수의 나눗셈은 " + ((double)a / b));
		
		sc.close();
	}
}
