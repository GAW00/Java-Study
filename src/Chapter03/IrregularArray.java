package Chapter03;

import java.util.Arrays;

public class IrregularArray {
	public static void main(String[] args) {
		int[][] arr = new int[4][];
		arr[0] = new int[3];
		arr[1] = new int[2];
		arr[2] = new int[3];
		arr[3] = new int[2];
		boolean x = true;
		int k = 3;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < k; j++) {
				if(x) {
					arr[i][j] = (i + 1) * 10 + j;
				}
				else {
					arr[i][j] = (i + 1) * 10 + j;
				}
			}
				x = (x == true) ? false : true;
				k = (x == true) ? 3 : 2;
		}
		System.out.println(Arrays.deepToString(arr));
	}
}
