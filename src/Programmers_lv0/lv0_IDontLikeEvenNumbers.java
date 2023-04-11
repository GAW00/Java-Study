package Programmers_lv0;

import java.util.Arrays;

public class lv0_IDontLikeEvenNumbers {
	public static void main(String[] args) {
		int n = 10;
		// int n2 = 15;
		System.out.println(Arrays.toString(solution(n)));
	}
	
	public static int[] solution(int n) {
		if(n % 2 == 0) n -= 1;
		int count = (n + 1) / 2;
		int[] answer = new int[count];
		
		for(int i = 0, j = 1; j <= n; j += 2) answer[i++] = j;
		
		return answer;
		

	}
}


//		ArrayList<String> lst = new ArrayList<String>();
//		if(n % 2 == 0) n -= 1;
//		for(int i = 0; i < n;n += 2) {
//			String tmp = String.valueOf(i);
//			lst.add(tmp);
//		}
//		String[] arr = lst.toArray(new String[lst.size()]);
//		
//		int[] answer = new int[lst.size()];
//		for(int i = 0; i < lst.size(); i++) {
//			answer[i] = Integer.parseInt(arr[i]);
//		}
//		return answer;