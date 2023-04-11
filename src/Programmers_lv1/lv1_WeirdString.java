package Programmers_lv1;

public class lv1_WeirdString {
	public static void main(String[] args) {
		String s = " tRy  heLLo  WORLD    ";
		System.out.println(solution(s));
	}
	
	public static String solution(String s) {
		String answer = "";
		String[] arr = s.split("");
		
		int count = 0;
		for(String ss : arr) {
			count = ss.equals(" ") ?  0 : count + 1;
			answer += count % 2 == 0 ?  ss.toLowerCase() : ss.toUpperCase();
		}
		return answer;
    }
}
