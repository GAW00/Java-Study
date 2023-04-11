package Chapter03;

import java.util.Scanner;

public class ArrayMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("양수 7개를 입력하세요.");
		int num = sc.nextInt();
		int min = num;
		for(int i = 0; i < 6; i++) {
			num = sc.nextInt();
			if(num < min) min = num;
		}
		System.out.println("가장 작은 수는 " + min + "입니다.");
		sc.close();
	}
}
