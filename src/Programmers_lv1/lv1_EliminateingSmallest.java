package Programmers_lv1;

import java.util.Arrays;

public class lv1_EliminateingSmallest {
	public static void main(String[] args) {
		int[] arr = {4, 2, 3, 1, 5, 8, 6};
		System.out.println(Arrays.toString(solution(arr)));
	}
	
	public static int[] solution(int[] arr) {
        int[] answer = {};
        
        if(arr.length == 1) {
        	answer = new int[1];
        	answer[0] = -1;
        }
        else {
        	int[] sorted_arr = arr.clone(); 
        	Arrays.sort(sorted_arr);
        	int min = sorted_arr[0];
        	answer = new int[arr.length - 1];
        	int index = 0;
        	for(int i = 0; i < arr.length; i++) {
        		if(arr[i] != min) {
        			answer[index++] = arr[i];
        		}
        	}
        }
        return answer;
    }
}
