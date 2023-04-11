package Programmers_lv1;

public class lv1_SumOfMeasures {
	public static void main(String[] args) {
		int n = 12;
		System.out.println(solution(n));
	}
	
	public static int solution(int n) {
        int sum = 0;
        for(int i = 1; i <= n / 2; i++) {
        	if(n % i == 0) sum += i;
        }
        return sum + n;
    }
}
