package Programmers_lv0;

import java.util.Arrays;

public class lv0_AdditionOfFractions {
	public static void main(String[] args) {
		//int n1 = 1, d1 = 2, n2 = 3, d2 = 4;
		int n1 = 9, d1 = 2, n2 = 1, d2 = 3;
		
		System.out.println(Arrays.toString(solution(n1, d1, n2, d2)));
	}
	
	public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int gcd = getGCD(denom1, denom2);
        int lcm = denom1 * denom2 / gcd;
        
        int a = lcm / denom1, b = lcm / denom2;
        int res_num = numer1 * a + numer2 * b;
        
        if(getGCD(res_num, lcm) == 1) {
        	int[] answer = {res_num, lcm};
            return answer;
        }
        else {
        	int[] answer = {res_num / getGCD(res_num, lcm), lcm / getGCD(res_num, lcm)};
        	return answer;
        }
    } 
	
	public static int getGCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return getGCD(num2, num1%num2);
    }
}
