package Chapter03;

import java.util.Arrays;

public class ReturnArray2 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i = 0; i < 10; i++) {
			arr[i] = i + 1;
		}
		System.out.println(Arrays.toString(makeArray(arr)));
	}
	
	public static int[] makeArray(int[] arr) {
		for(int i = 0; i < 10; i++) {
			arr[i] += 100;
		}
		return arr;
	}
}
