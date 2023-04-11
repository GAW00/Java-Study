package Programmers_lv1;

public class lv1_RestIsOne {
	public static void main(String[] args) {
		int n = 12;
		System.out.println(solution(n));
	}
	
	public static int solution(int n) {
		int i;
		for(i = 2; i <= n; i++) if(n % i == 1) break;
		return i;
    }
}
