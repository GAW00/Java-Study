package Programmers_lv1;

import java.util.Arrays;

public class lv1_GCDAndLCM {
	public static void main(String[] args) {
		int n = 3, m = 12;
		System.out.println(Arrays.toString(solution(n, m)));
	}
	
	public static int[] solution(int n, int m) {
		int[] answer = {getGCD(n, m), n * m / getGCD(n, m)};
        return answer;
    }
	
	public static int getGCD(int n, int m) {
		if(n % m == 0) {
			return m;
		}
		else {
			return getGCD(m, n % m);
		}
	}
}
