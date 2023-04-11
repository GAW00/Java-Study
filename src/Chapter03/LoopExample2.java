package Chapter03;

import java.util.Scanner;

public class LoopExample2 {
	public static void main(String[] args) {
		int n;
		int i = 0;
		System.out.print("구구단 중에서 출력하고 싶은 단을 입력하세요 : ");
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(;i < 10; i++) {
			System.out.println(n + " x " + i + " = " + (n * i));
		}
	}
}
