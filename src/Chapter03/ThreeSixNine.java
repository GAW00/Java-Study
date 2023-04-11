package Chapter03;

import java.util.Scanner;

public class ThreeSixNine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("10 ~ 99 사이의 정수를 입력하시오 : ");
		int n = sc.nextInt();
		int swc = 0;
		
		if(n / 10 % 3 == 0 || n / 10 % 3 == 0 || n / 10 % 3 == 0) {
			swc++;
		}
		if(n % 10 % 3 == 0 || n % 10 % 3 == 0 || n % 10 % 3 == 0) {
			swc++;
		}
		switch (swc) {
			case 1:
				System.out.println("박수짝"); break;
			case 2:
				System.out.println("박수짝짝"); break;
		}
		
		sc.close();
		
	}
}
