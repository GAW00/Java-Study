package Programmers_lv0;

import java.util.Arrays;

public class lv0_FindingTheMedian {
	public static void main(String[] args) {
		int[] arr = {1, 2, 7, 10, 11};
		System.out.println(solution(arr));
	}
	
	public static int solution(int[] array) {
		Arrays.sort(array);
        int mid = 0;
        mid = array.length/2;
        
        return array[mid];
    }
}
