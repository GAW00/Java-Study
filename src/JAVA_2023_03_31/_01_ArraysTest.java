package JAVA_2023_03_31;

import java.util.Arrays;

public class _01_ArraysTest {
	public static void main(String[] args) {
		int[] arr = {9, 4, 5, 6, 2, 1};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		printArray(arr);
		
		System.out.println();
		
//		9를 탐색한다(인덱스 반환, 9가 없으면 음수 반환)
		System.out.println(Arrays.binarySearch(arr, 9));
		
		Arrays.fill(arr, 8);
		printArray(arr);
	}
	
//	배열을 매개번수로 받아서 출력하는 메소드
	private static void printArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("]");
	}
}
