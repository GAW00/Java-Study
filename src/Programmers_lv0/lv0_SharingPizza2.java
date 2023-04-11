package Programmers_lv0;

public class lv0_SharingPizza2 {
	public static void main(String[] args) {
		int n = 6;
		// int n2 = 10;
		System.out.println(solution(n));
	}
	
	public static int solution(int n) {
        return n / getGCD(6, n);
    }
    
    public static int getGCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return getGCD(num2, num1%num2);
    }
}

