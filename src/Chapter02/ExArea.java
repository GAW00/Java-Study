package Chapter02;

import java.util.Scanner;

public class ExArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(c == 0) {
			System.out.println("삼각형의 넓이는 " + ((double)a * b / 2));
		}
		else {
			System.out.println("사다리꼴의 넓이는 " + (((double)a + b) * c / 2));
			
		}
		sc.close();
	}
}
