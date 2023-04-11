package Programmers_lv1;

import java.util.Arrays;

public class lv1_IDontLikeSameNumber {
	public static void main(String[] args) {
		int[] arr = {1, 1, 3, 3, 0, 1, 1};
		System.out.println(Arrays.toString(solution(arr)));
	}
	
	public static int[] solution(int []arr) {
        int[] answer = {};
        
        StringBuilder sb = new StringBuilder();
        int prenum = 10;
        for(int i = 0; i < arr.length; i++) {
    		if(prenum != arr[i])
    			sb.append(arr[i]);
        	prenum = arr[i];
        }
        answer = new int[sb.length()];
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = sb.charAt(i) - '0';
        }

        return answer;
    }
}
