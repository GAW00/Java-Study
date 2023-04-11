package Chapter02;

import java.util.Scanner;

public class AreaCircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력하세요>>");
		int radius = sc.nextInt();
		System.out.println("원의 면적은 " + (radius * Math.PI + "입니다."));
	}
}
