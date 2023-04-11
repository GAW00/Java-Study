package Programmers_lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class lv1_DivisibleNumericalArray {
	public static void main(String[] args) {
		int[] arr = {2, 36, 1, 3};
		int divisor = 1;
		System.out.println(Arrays.toString(solution(arr, divisor)));
	}
	
	public static int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        
        List<Integer> al = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i] % divisor == 0) {
        		al.add(arr[i]);
        	}
        }
        if(al.size() == 0) {
        	answer = new int[1];
        	answer[0] = -1;
        	return answer;
        }
        else {
        	Collections.sort(al);
        	answer = al.stream().mapToInt(i -> i).toArray();
        }
        return answer;
    }
}
