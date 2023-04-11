package Chapter02;

import java.util.Scanner;

public class Won2Dalloar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원화를 입력하세요(단위: 원) >>");
		int won = sc.nextInt();
		double rate = 1100;
		System.out.println(won + "원은 $" + (won/rate) + "입니다.");
		
		sc.close();
	}
}
