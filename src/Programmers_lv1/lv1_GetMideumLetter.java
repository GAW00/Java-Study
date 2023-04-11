package Programmers_lv1;

public class lv1_GetMideumLetter {
	public static void main(String[] args) {
		String s = "abcde";
		System.out.println(solution(s));
	}
	
	public static String solution(String s) {
        String answer = "";
        
        boolean eo = s.length() % 2 == 0;
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
    	if(eo) {
    		sb.append(arr[arr.length / 2 - 1]);
    		sb.append(arr[arr.length / 2]);
    	}
    	else {
    		sb.append(arr[arr.length / 2]);
    	}
    	answer = sb.toString();
        return answer;
    }
}
