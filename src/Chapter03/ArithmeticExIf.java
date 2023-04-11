package Chapter03;

import java.util.Scanner;

public class ArithmeticExIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("연산>>");
		int a = sc.nextInt();
		String s = sc.next();
		int b = sc.nextInt();
		
		if(s.equals("+")) {
			System.out.println(a + b);
		}
		else if(s.equals("-")) {
			System.out.println(a - b);
		}
		else if(s.equals("*")) {
			System.out.println(a * b);
		}
		else if(s.equals("/")) {
			if(b == 0) {
				System.out.println("0으로 못 나눔");
			}
			else {
				System.out.println(a / (double)b);
			}
		}
		sc.close();	
	}
}
