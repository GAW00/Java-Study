package Programmers_lv1;

import java.util.Arrays;

public class lv1_SecretMap {
	public static void main(String[] args) {
		int n = 6;
		int[] arr1 = {46, 33, 33 ,22, 31, 50};
		int[] arr2 = {27 ,56, 19, 14, 14, 10};
		
		System.out.println(Arrays.toString(solution(n, arr1, arr2)));
	}
	
	public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        String[] sa1 = DecimaltoBinary(arr1, n);
        String[] sa2 = DecimaltoBinary(arr2, n);
        
        StringBuilder[] result = new StringBuilder[n];
        for (int i = 0; i < n; i++) {
            result[i] = new StringBuilder("");
        }
        
        for(int i = 0; i < n; i++) {
        	StringBuilder sb1 = new StringBuilder();
        	StringBuilder sb2 = new StringBuilder();
        	sb1.append(sa1[i]);
        	sb2.append(sa2[i]);
        	for(int j = 0; j < n; j++) {
        		if(sb1.charAt(j) == '0' && sb2.charAt(j) == '0') {
        			result[i].append(' ');
        		}
        		else {
        			result[i].append('#');
        		}
        	}
        }
        for(int i = 0; i < n; i++) {
        	answer[i] = result[i].toString();
        }
        return answer;
    }
	
	public static String[] DecimaltoBinary(int[] arr, int n) {
		String[] sa = new String[n];
		StringBuilder sb = new StringBuilder("%0nd");
		
		String num = String.valueOf(n);
		sb = sb.replace(2, 3, num);
		num = sb.toString();
		
		for(int i = 0; i < n; i++) {
			sa[i] = String.format(num, Long.parseLong(Integer.toBinaryString(arr[i])));
		}
		return sa;
	}
}
