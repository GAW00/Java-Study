package Chapter03;

import java.util.Scanner;

public class Tesla {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("매수 수량을 입력하시오>?>");
		int n = sc.nextInt();
		int t = 520;
		
		System.out.println("100달러짜리 " + (t * n) / 100 + "매");
		System.out.println("10달러짜리 " + (t * n) % 100 / 10 + "매");
		
		sc.close();
	}
}
