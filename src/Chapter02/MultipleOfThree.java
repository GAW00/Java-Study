package Chapter02;

import java.util.Scanner;

/*
 * 숫자 받아서 3의 배수여부 출력
 */

public class MultipleOfThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하시오>>");
		int n = sc.nextInt();
		
		if(n%3==0) {
			System.out.println("3의 배수입니다.");
		}
		else {
			System.out.println("3의 배수가 아닙니다.");
		}
		
		sc.close();
	}
}
