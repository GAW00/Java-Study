package Chapter02;

import java.util.Arrays;
import java.util.Scanner;

public class ExMaxMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개 입력>>");
		int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
		Arrays.sort(arr);
		System.out.println("최대값은 " + arr[2]);
		System.out.println("최소값은 " + arr[0]);
		sc.close();
	}
}
