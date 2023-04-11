package Programmers_lv0;

public class lv0_DeliteVowel {
	public static void main(String[] args) {
		String my_string = "nice to meet you";
		System.out.println(solution(my_string));
	}
	
	public static String solution(String my_string) {
		String[] vowel = {"a", "e", "i", "o", "u"};
		String answer = my_string;
		for(String i : vowel) {
			answer = answer.replace(i, "");
		}
        return answer;
    }
}
