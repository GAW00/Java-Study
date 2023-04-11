package Chapter03;

import java.util.Scanner;

public class ArithmeticOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		
		int s = sc.nextInt();
		int tmp = s;
		int h = s / 3600;
		s %= 3600;
		int m = s / 60;
		s %= 60;
		
		System.out.println(tmp + "초는 " + h + "시간, " + m + "분, " + s + "초 입니다.");
		
		sc.close();
	}
}
