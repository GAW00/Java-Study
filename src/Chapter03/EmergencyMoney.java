package Chapter03;

import java.util.Scanner;

public class EmergencyMoney {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가구 수를 입력하시오>>");
		int n = sc.nextInt();
		int rate = 1200;
		
		if(n == 1) {
			System.out.println("100달러짜리 " + 400000 / rate / 100+ "매");
			System.out.println("10달러짜리 " + 400000 / rate % 100 / 10 + "매");
		}
		else if(n == 2){
			System.out.println("100달러짜리 " + 600000 / rate / 100+ "매");
			System.out.println("10달러짜리 " + 600000 / rate % 100 / 10 + "매");
		}
		else if(n == 3){
			System.out.println("100달러짜리 " + 800000 / rate / 100+ "매");
			System.out.println("10달러짜리 " + 800000 / rate % 100 / 10 + "매");
		}
		else if(n == 5){
			System.out.println("100달러짜리 " + 1000000 / rate / 100+ "매");
			System.out.println("10달러짜리 " + 1000000 / rate % 100 / 10 + "매");
		}
		
		sc.close();
	}
}
