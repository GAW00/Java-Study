package JAVA_2023_03_22;

import java.util.Scanner;

public class ComputeInterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원금을 입력하세요 : ");
		int principal = sc.nextInt(); // 원금
		System.out.print("연이율을 입력하세요 : ");
		double rate = sc.nextDouble(); // 연이율
		
		int years = 0;
		double balance = principal;
		
		System.out.println("\n연도수\t원리금");
		while(balance <= principal * 2){
			years++;
			balance *= 1.0 + rate / 100.0;
			System.out.print(years);
			System.out.print("\t" + balance);
			System.out.println();
		}
		System.out.println("필요한 연도수 = " + years);
		sc.close();
	}
}
