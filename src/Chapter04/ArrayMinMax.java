package Chapter04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMinMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("양수 10개를 입력하세요.");
		
		int[] arr = new int[10];
		for(int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}
		
//		int min = arr[0], max = arr[0];
//		
//		for(int i = 1; i < 10; i++) {
//			if(arr[i] < min) min = arr[i];
//			if(arr[i] > max) max = arr[i];
//		}
//		
//		System.out.println(min + " " + max);
//		
		Arrays.sort(arr);
		System.out.println("가장 작은 수는 " + arr[0] + "이고, 가장 큰 수는 " + arr[9] + "이고, 최소값 + 최대값은 " + (arr[0] + arr[9] + "입니다."));
		sc.close();
	}
}
