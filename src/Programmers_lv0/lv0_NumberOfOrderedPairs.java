package Programmers_lv0;

public class lv0_NumberOfOrderedPairs {
	public static void main(String[] args) {
		int n = 20;
		// int n2 = 100;
		System.out.println(solution(n));
	}
	
	public static int solution(int n) {
		// 1 <= n <= 1,000,000
		int count = 0;
		for(int i = n; i >= Math.sqrt(n); i--) {
			if(n % i == 0) {
				if(n / i == i) count++;
				else count += 2;
			}
		}
		return count;
	}
}
