package JAVA_2023_04_06;

public class T_Random2DArray {
	public static void main(String[] args) {
		int[][] arr = new int[3][4];
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int)(Math.random() * 10);
				System.out.print(arr[i][j] + "\t");
				sum += arr[i][j];
			}
			System.out.println();
		}
		System.out.println("합은 " + sum);
	}
}
