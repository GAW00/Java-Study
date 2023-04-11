package Programmers_lv0;

public class lv0_Babbling {
	public static void main(String[] args) {
		String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa", "yemaye"};
		System.out.println(solution(babbling));
	}
	
	public static int solution(String[] babbling) {
		int count = 0;
		String[] can_pron = {"aya", "ye", "woo", "ma"};
		for(String b : babbling) {
			for(String w : can_pron) {
				b = b.replace(w, " ");
			}
			if(b.trim().length() == 0) {
				count++;
			}
		}
		return count;
	}
}
