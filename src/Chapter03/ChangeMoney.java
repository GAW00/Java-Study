package Chapter03;

import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("금액을 입력하시오>>");
//		int money = sc.nextInt();
//		System.out.println("오만원권 " + (money / 50000) + "매");
//		money %= 50000;
//		System.out.println("만원권 " + (money / 10000) + "매");
//		money %= 10000;
//		System.out.println("천원권 " + (money / 1000) + "매");
//		money %= 1000;
//		System.out.println("백원권 " + (money / 100) + "매");
//		money %= 100;
//		System.out.println("오십원권 " + (money / 50) + "매");
//		money %= 50;
//		System.out.println("십원권 " + (money / 10) + "매");
//		money %= 10;
//		System.out.println("오만원권 " + (money / 1) + "매");
//		sc.close();
		final int 오만원 = 50000;
		final int 만원 = 10000;
		final int 천원 = 1000;
		final int 오백원 = 500;
		final int 백원 = 100;
		final int 오십원 = 50;
		final int 십원 = 10;
		final int 일원 = 1;
		int res, money;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		money = sc.nextInt();
		
		res = money / 오만원;
		if(res > 0) {
			System.out.println("오만원권 " + res + "매");
		}
		money = money % 오만원;
		res  = money / 만원;
		if(res > 0) {
			System.out.println("만원권 " + res + "매");
		}
		money = money % 만원;
		res  = money / 천원;
		if(res > 0) {
			System.out.println("천원권 " + res + "매");
		}
		money = money % 천원;
		res  = money / 오백원;
		if(res > 0) {
			System.out.println("오백원 " + res + "매");
		}
		money = money % 오백원;
		res  = money / 백원;
		if(res > 0) {
			System.out.println("백원권 " + res + "개");
		}
		money = money % 백원;
		res  = money / 오십원;
		if(res > 0) {
			System.out.println("오십원 " + res + "개");
		}
		money = money % 오십원;
		res  = money / 십원;
		if(res > 0) {
			System.out.println("십원 " + res + "개");
		}
		money = money % 십원;
		res  = money / 일원;
		if(res > 0) {
			System.out.println("일원 " + res + "개");
		}
		sc.close();
	}
}
