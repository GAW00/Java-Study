package Programmers_lv0;

public class lv0_Decoding {
	public static void main(String[] args) {
		String cipher = "dfjardstddetckdaccccdegk";
		int code = 4;
		System.out.println(solution(cipher, code));
	}
	
	public static String solution(String cipher, int code) {
        String answer = "";
        char[] arr = cipher.toCharArray();
        for(int i = code - 1; i < arr.length; i += code) answer += arr[i];
        return answer;
    }
}
