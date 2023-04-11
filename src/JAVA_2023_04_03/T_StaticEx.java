package JAVA_2023_04_03;

class ArrayUtil{
	public static int[] concat(int[] a, int[] b) {
		int len = a.length + b.length;
		int[] result = new int[len];
		for(int i = 0; i < result.length; i++) {
			if(i < a.length) result[i] = a[i];
			else result[i] = b[i - a.length];
		}
		return result;
	}
	public static void print(int[] a) {
		System.out.print("[ ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("}");
	}
}

public class T_StaticEx {
	public static void main(String[] args) {
		int[] arr1 = {1, 5, 7, 9};
		int[] arr2 = {3, 6, -1, 100, 77};
		int[] arr3 = ArrayUtil.concat(arr1, arr2);
		ArrayUtil.print(arr3);
	}
}
