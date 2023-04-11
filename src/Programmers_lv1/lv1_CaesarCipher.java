package Programmers_lv1;

public class lv1_CaesarCipher {
	public static void main(String[] args) {
		String s = "a B z";
		int n = 4;
		System.out.println(solution(s, n));
	}
	
	public static String solution(String s, int n) {
        String answer = "";
        
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i] != ' ') {
	        	if(arr[i] < 91) {
	        		arr[i] += n;
		        	arr[i] = arr[i] > 90 ? (char)(arr[i] - 'Z' + 'A'- 1) : arr[i];
	        	}
	        	else {
	        		arr[i] += n;
	        		arr[i] = arr[i] > 122 ? (char)(arr[i] - 'z' + 'a' - 1) : arr[i];
	        	}
        	}
        }
        answer = String.valueOf(arr);
        return answer;
    }
}
