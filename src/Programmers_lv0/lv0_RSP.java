package Programmers_lv0;

public class lv0_RSP {
	public static void main(String[] args) {
		String rsp = "502";
		System.out.println(solution(rsp));
	}
	
	public static String solution(String rsp) {
        String[] splited_rsp = rsp.split("");
        String answer = "";
        for(String i : splited_rsp) {
        	if(i.equals("2")) {
        		answer += "0";
        	}
        	else if(i.equals("0")) {
        		answer += "5";
        	}
        	else if(i.equals("5")) {
        		answer += "2";
        	}
        }
        return answer;
    }
}
