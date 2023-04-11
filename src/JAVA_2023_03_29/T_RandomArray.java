package JAVA_2023_03_29;

import java.util.Scanner;

public class T_RandomArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 몇개?>>");
		int n = sc.nextInt();
		
		if(n > 100 || n <= 0) System.out.println("잘못된 범위입니다.");
		else {
			int[] arr = new int[n];
			
			for(int i = 0; i < n; i++) {
				arr[i] = (int)(Math.random() * 100 + 1);
				System.out.print(String.format("%3d ", arr[i]));
				if((i + 1) % 10 == 0) System.out.println();
			}
			sc.close();
		}
	}
}
