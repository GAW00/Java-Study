package Chapter03;

import java.util.Scanner;

/*
 * 정수 3개를 입력받음
 * 정수가 아닌 경우 패스
 * 3개의 합 출력
 * 예외처리 이용
 */

public class InputException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요.");
		int sum = 0, n = 0;
		for(int i = 0; i < 3; i++) {
			System.out.print((i + 1) + " >>");
			try {
				n = sc.nextInt();
			} catch (Exception e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요.");
				sc.next();
				i--;
				continue;
			}
			sum += n;
		}
		System.out.println("합계 = " + sum);
		sc.close();
	}
}
