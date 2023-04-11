package Chapter02;

import java.util.Scanner;

public class ExExchange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("원화를 입력하세요(단위 원)>>");
		int won = sc.nextInt();
		double dollarRate = 1200;
		double EURRate = 1500;
		
		System.out.println(won + "원은 $" + (won/dollarRate) + "입니다.");
		System.out.println(won + "원은 E" + (won/EURRate) + "입니다.");
		
		sc.close();
	}
}
