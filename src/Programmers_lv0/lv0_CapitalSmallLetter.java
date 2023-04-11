package Programmers_lv0;

public class lv0_CapitalSmallLetter {
	public static void main(String[] args) {
		String my_string = "abCdEfghIJ";
		System.out.println(solution(my_string));
	}
	
	public static String solution(String my_string) {
		String answer = "";
        char[] arr = my_string.toCharArray();
        for(int i = 0; i < arr.length; i++) {
        	if(Character.isUpperCase(arr[i])) answer += Character.toLowerCase(arr[i]);
        	else answer += Character.toUpperCase(arr[i]);
        }
        return answer;
    }
}
