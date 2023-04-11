package Programmers_lv1;

public class lv1_SquareRoot {
	public static void main(String[] args) {
		long n = 121L;
		System.out.println(solution(n));
	}
	
	public static long solution(long n) {
		long x = isPow(n);
        if(x > -1) return (long) Math.pow(x + 1, 2);  
        return x;
    }
	
	public static long isPow(long n) {
		double x = Math.sqrt(n);
		if(Math.ceil(x) == x) return (long)x; // if(Math.pow(x, 2) == n) return (long)x;
		else return -1;
	}
}
