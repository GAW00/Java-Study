package Programmers_lv0;

import java.util.Arrays;
import java.util.Comparator;

public class lv0_OrderOfCare {
	public static void main(String[] args) {
		//int[] emergency = {3, 76, 24};
		//int[] emergency = {1, 2, 3, 4, 5, 6, 7};
		int[] emergency = {1, 4, 5, 6, 2, 3, 7};
		System.out.println(Arrays.toString(solution(emergency)));
	}
	
	public static int[] solution(int[] emergency) {
//		int[] sorting = emergency;
//		Arrays.sort(sorting);
		Integer[] sorting = Arrays.stream(emergency).boxed().toArray(Integer[]::new);
	    Arrays.sort(sorting, Comparator.reverseOrder());
		System.out.println(Arrays.toString(sorting));
	    int[] answer = new int[emergency.length];
		
		for(int i = 0; i < emergency.length; i++) {
			for(int j = 0; j < emergency.length; j++) {
				if(sorting[i] == emergency[j]) {
					answer[j] = i + 1;
					break;
				}
			}
		}
		
        return answer;
    }
}
