package Chapter03;

import java.util.Scanner;

public class ExGlobalStock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("매수 금액을 입력하세요 : ");
		int buy = sc.nextInt();
		System.out.print("매수 금액을 입력하세요 : ");
		int sell = sc.nextInt();
		double rate = 0;
		
		if(sell > buy) rate = (sell - buy) * 0.22;
		System.out.println("양도세 = " + rate);
		
		sc.close();
	}
}
