package Programmers_lv1;

import java.util.Arrays;

public class lv1_FindingKimFromSeoul {
	public static void main(String[] args) {
		String[] seoul = {"Jane", "Kim"};
		System.out.println(solution(seoul));
	}
	
	public static String solution(String[] seoul) {
//        String answer = "";
//        for(int i = 0; i < seoul.length; i++) {
//        	if(seoul[i].equals("Kim")) {
//        		answer = "김서방은 " + i + "에 있다";
//        		break;
//        	}
//        }  
//        return answer;
		int x = Arrays.asList(seoul).indexOf("Kim");
		return "김서방은 " + x + "에 있다";
    }
}
