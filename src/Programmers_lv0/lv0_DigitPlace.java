package Programmers_lv0;

public class lv0_DigitPlace {
//	private static int sum = 0;
//	
//	public static void main(String[] args) {
//		int n = 1234;
//		int n2 = 930211;
//		System.out.println(solution(n));
//	}
//	
//	public static int solution(int n) {
//		if(n / 10 > 0) {
//        	sum += n % 10;
//        	return solution(n / 10);
//        }
//        else {
//        	return sum += n;
//        }        
//    }
	public static void main(String[] args) {
		// int n = 1234;
		int n2 = 930211;
		System.out.println(solution(n2));
	}
	
	public static int solution(int n) {
		int sum = 0;
		while(n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
    }
}
