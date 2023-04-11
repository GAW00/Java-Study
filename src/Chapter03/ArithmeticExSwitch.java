package Chapter03;

import java.util.Scanner;

public class ArithmeticExSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("연산>>");
		int a = sc.nextInt();
		String s = sc.next();
		int b = sc.nextInt();
		
		switch(s) {
		case "+":
			System.out.println(a + b); break;
		case "-":
			System.out.println(a - b); break;
			
		case "*":
			System.out.println(a * b); break;
			
		case "/":
			if(b == 0) {
				System.out.println("0으로 못 나눔"); break;
			}
			else {
				System.out.println(a / (double)b); break;
			}
		}
		sc.close();
	}
}
