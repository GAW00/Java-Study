package Programmers_lv1;

public class lv1_SumAtoB {
	public static void main(String[] args) {
		int a = 3, b = 5;
		System.out.println(solution(a, b));
	}
	
	public static long solution(int a, int b) {
        long answer = 0;
        for(int i = Math.min(a, b); i <= Math.max(a, b); i++) answer += i;
        return answer;
    }
}
