package Programmers_lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class lv1_KthNumber {
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3},
							{4, 4, 1},
							{1, 7, 3}};
		System.out.println(Arrays.toString(solution(array, commands)));
	}
	
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        Integer[] arr = new Integer[array.length];
        for (int i = 0; i < arr.length; i++) {
			arr[i] = array[i];
		}
        
        List<Integer> lst = Arrays.asList(arr);
        for (int i = 0; i < commands.length; i++) {
        	List<Integer> tmp = new ArrayList<Integer>(lst.subList(commands[i][0] - 1, commands[i][1]));
			Collections.sort(tmp);
			int a = commands[i][2] - 1;
			answer[i] = tmp.get(a);
		}
        return answer;
    }
}

