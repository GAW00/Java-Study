package Chapter03;

import java.util.Scanner;

public class PrintAsterisk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오>>");
		
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			for(int j = n - i; j > 0; j--) System.out.print("*");
			System.out.println();
		}
		sc.close();
	}
}
