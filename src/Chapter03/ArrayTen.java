package Chapter03;

import java.util.Scanner;

public class ArrayTen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("10개의 정수를 입력하세요>>");
		int sum = 0;
		for(int i = 0; i < 10; i++) {
			sum += sc.nextInt();
		}
		System.out.println("합계는 " + sum);
		sc.close();
	}
}
