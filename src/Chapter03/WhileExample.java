package Chapter03;

import java.util.Scanner;

public class WhileExample {
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수 입력>>");
			int num = sc.nextInt();
			if(num != -1) {
				count++;
				sum += num;
				System.out.println("평균은 " + ((double)sum / count));
			}
		}
	}
}
