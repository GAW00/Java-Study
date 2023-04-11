package Programmers_lv1;

public class lv1_EvenOdd {
	public static void main(String[] args) {
		int num = 3;
		System.out.println(solution(num));
	}
	
	public static String solution(int num) {
//        String answer = "";
//        if(num % 2 == 0) answer += "Even";
//        else answer += "Odd";
//        return answer;
        return num % 2 == 0 ? "Even" : "Odd";
    }
}
