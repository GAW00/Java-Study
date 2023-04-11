package Programmers_lv0;

import java.util.Arrays;

public class lv0_2DimensionalArray {
	public static void main(String[] args) {
		int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
		int n = 2;
		
		System.out.println(Arrays.deepToString(solution(num_list, n)));
	}
	
	public static int[][] solution(int[] num_list, int n) {
		int row = num_list.length / n, column = n;
		int[][] answer = new int[row][column];
		
		int count = 0;
		for(int i = 0; i < row; i++) {
			for(int j = 0; j< column; j++) {
				answer[i][j] = num_list[count++];
			}
		}
        return answer;
    }
}
