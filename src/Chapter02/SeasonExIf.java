package Chapter02;

import java.util.Scanner;

public class SeasonExIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("달을 입력하세요(1~12)>>");
		int month = sc.nextInt();
		
		if(month == 1 || month == 2 || month == 12) {
			System.out.println("겨울");
		}
		else if(month >= 3 && month <= 5) {
			System.out.println("봄");
		}
		else if(month >= 6 && month <= 8) {
			System.out.println("여름");
		}
		else if(month >= 9 && month <= 11) {
			System.out.println("가을");
		}
		sc.close();
	}
}
