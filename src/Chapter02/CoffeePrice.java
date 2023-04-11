package Chapter02;

import java.util.Scanner;

/*
 * 커피 주문을 받아서 커피명과 가격을 출력
 */

public class CoffeePrice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("무슨 커피를 드릴까요?>>");
		String coffee = sc.nextLine();
		int price = 0;
		
		switch(coffee) {
		case "에스프레소":
			price = 3500;
			break;
		case "카푸치노":
			price = 3000;
			break;
		case "카페라떼":
			price = 3200;
			break;
		case "아메리카노":
			price = 2000;
			break;
		default:
			System.out.println("메뉴에 없습니다.");
		}
		if(price != 0) System.out.println(coffee + "는 " + price + "원입니다.");
		
		sc.close();
	}
}
