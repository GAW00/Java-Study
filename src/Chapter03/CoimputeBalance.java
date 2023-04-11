package Chapter03;

import java.util.Scanner;

public class CoimputeBalance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("구매 금액을 입력 하세요 : ");
		int purchaseAmount = sc.nextInt();
		int balance = purchaseAmount;
		
		if(purchaseAmount >= 300000) balance = purchaseAmount - 30000;
		else if(purchaseAmount >= 100000) balance =  purchaseAmount - 5000;
		System.out.println("구매금액 = " + purchaseAmount);
		System.out.println("청구 금액 = " + balance);
		
		sc.close();
	}
}
