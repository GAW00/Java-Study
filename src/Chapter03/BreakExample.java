package Chapter03;

import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("exit을 입력하면 종료합니다.");
		while(true) {
			System.out.print(">>");
			String str = sc.nextLine();
			if(str.equals("exit")) {
				System.out.println("종료합니다..");
				break;
			}
		}
		sc.close();
	}
}
