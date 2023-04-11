package Chapter02;

import java.util.Scanner;

/*
 * 점수 받아서 80이상이면 합격
 */

public class SuccessOrFail {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요>>");
		int score = sc.nextInt();
		
		if(score >= 80) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
		sc.close();
	}
}
