package Chapter03;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("양수 5개를 입력하세요");
		
		int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
		
		Arrays.sort(arr);
		System.out.println("가장 큰 수는 " + arr[4] + "입니다.");
		
		sc.close();
	}
}
