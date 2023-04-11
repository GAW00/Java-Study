package Chapter03;

import java.util.Scanner;

public class ContinueExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 5개를 입력하세요>>");
		int[] num = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
		
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			if(num[i] >= 0) {
				sum += num[i];
			}
		}
		System.out.println(sum);
		sc.close();
	}
}
