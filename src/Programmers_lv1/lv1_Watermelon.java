package Programmers_lv1;

public class lv1_Watermelon {
	public static void main(String[] args) {
		int n = 3;
		System.out.println(solution(n));
	}
	
	public static String solution(int n) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
        	if(i % 2 == 0) {
        		sb.append("수");
        	}
        	else {
        		sb.append("박");
        	}
        }
        answer = sb.toString();
        return answer;
    }
}
