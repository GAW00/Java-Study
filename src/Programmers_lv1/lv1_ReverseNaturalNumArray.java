package Programmers_lv1;

import java.util.Arrays;

public class lv1_ReverseNaturalNumArray {
	public static void main(String[] args) {
		long n = 12345;
		System.out.println(Arrays.toString(solution(n)));
	}
	
	public static int[] solution(long n) {
//		String[] str = String.valueOf(n).split("");
//		
//		String[] tmp = new String[str.length];
//		for(int i = 0; i < str.length; i++) {
//			tmp[i] = str[str.length - 1 - i];
//		}
//		
//		int[] answer = new int[str.length];
//		for(int i = 0; i < str.length; i++) {
//			answer[i] = Integer.parseInt(tmp[i]);
//		}
		String a = "" + n;
        int[] answer = new int[a.length()];
        int cnt=0;

        while(n>0) {
            answer[cnt]=(int)(n%10);
            n/=10;
            cnt++;
        }
		return answer;
	}
}
