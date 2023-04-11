package Programmers_lv1;

import java.util.Arrays;
import java.util.Collections;

public class lv1_SortingByDescending {
	public static void main(String[] args) {
		String s = "ACBDbdca";
		System.out.println(solution(s));
	}
	
	public static String solution(String s) {
		// 1) StringBuilder.reverse()
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		return new StringBuilder(new String(arr)).reverse().toString();
		
		
		// 2) Arrays.sort(s, Collections.)
//		String answer = ""; 
//		String[] arr = s.split("");
//		Arrays.sort(arr, Collections.reverseOrder());
//		for(String str : arr) {
//			answer += str;
//		}
//		return answer;
    }
}
