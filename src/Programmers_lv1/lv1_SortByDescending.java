package Programmers_lv1;

import java.util.Arrays;

public class lv1_SortByDescending {
	public static void main(String[] args) {
		long n = 118372;
		System.out.println(solution(n));
	}
	
	public static long solution(long n) {
		String str = "";
		str += n;
		char[] arr = str.toCharArray();
//		String[] arr2 = String.valueOf(n).split(""); 이렇게 String으로 변환 가능
		Arrays.sort(arr); // 오름차순
        StringBuilder answer = new StringBuilder(new String(arr));
        return Long.parseLong(answer.reverse().toString());
    }
}
