package Programmers_lv0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class lv0_MorseCode {
	public static void main(String[] args) {
		String letter = "--- --- --- ---";
		System.out.println(solution(letter));
		//solution(letter);
	}
	
	public static String solution(String letter) {
		String answer = "";
		List<String> lst = new ArrayList<String>();
		
		HashMap<String, String> hm = new HashMap<String, String>(); // HashMap 선언
		hm.put(".-", "a");
		hm.put("-...", "b");
		hm.put("-.-.", "c");
		hm.put("-..", "d");
		hm.put(".", "e");
		hm.put("..-.", "f");
		hm.put("--.", "g");
		hm.put("....", "h");
		hm.put("..", "i");
		hm.put("---", "j");
		hm.put("-.-", "k");
		hm.put(".-..", "l");
		hm.put("--", "m");
		hm.put("-.", "n");
		hm.put("---", "o");
		hm.put(".--.", "p");
		hm.put("--.-", "q");
		hm.put(".-.", "r");
		hm.put("...", "s");
		hm.put("-", "t");
		hm.put("..-", "u");
		hm.put("...-", "v");
		hm.put(".--", "w");
		hm.put("-..-", "x");
		hm.put("-.--", "y");
		hm.put("--..", "z");
        
		StringTokenizer st = new StringTokenizer(letter, " ");
		while(st.hasMoreTokens()) {
			//System.out.println(hm.get(st.nextToken()));
			lst.add(hm.get(st.nextToken()));
		}
		answer = String.join("", lst);
        return answer;
    }
}
