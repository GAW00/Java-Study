package Programmers_lv0;

import java.util.Arrays;

public class lv0_Mode {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 3, 3, 4};
		int[] array2 = {1, 1, 2, 2};
		System.out.println(solution(array));
		System.out.println(solution(array2));
	}
	
	public static int solution(int[] array) {
		Arrays.sort(array);
        int[] counting = new int[1000]; // 0 ~ 999

        int max = 0;
        boolean sw = false;
        
        for(int i = 0; i < array.length; i++) {
        	counting[array[i]]++;
        	if(counting[max] < counting[array[i]]) {
        		max = array[i];
        		sw = false;
        	}
        	else if(counting[max] == counting[array[i]] && max != array[i]) {
        		sw = true;
        	}
        }
		if(sw == false) return max;
		else return -1;
    }
	
}
