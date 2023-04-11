package Programmers_lv0;

import java.util.Arrays;

public class lv0_SortingString1 {
	public static void main(String[] args) {
		String my_string = "hi12392";
		System.out.println(Arrays.toString(solution(my_string)));
	}
	
	public static int[] solution(String my_string) {
		 my_string = my_string.replaceAll("[a-z]","");

	        int[] answer = new int[my_string.length()];

	        for(int i =0; i<my_string.length(); i++){
	            answer[i] = my_string.charAt(i) - '0';
	        }

	        Arrays.sort(answer);

	        return answer;
//        String tmp = "";
//        char[] arr = my_string.toCharArray();
//        char[] arr2 = {};
//        int[] res = {};
//        
//        for(int i = 0; i < my_string.length(); i++) {
//        	if(arr[i] >= 48 && arr[i] <=57) {
//        		tmp += arr[i];
//        	}
//        }
//        arr2 = tmp.toCharArray();
//        Arrays.sort(arr2);
//        
//        res = new int[tmp.length()];
//        for(int i = 0; i < tmp.length(); i++) {
//        	res[i] = Integer.parseInt(String.valueOf(arr2[i]));
//        }
//        return res;
    }
}
