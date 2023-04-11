package Programmers_lv1;

public class lv1_HarshadNumber {
	public static void main(String[] args) {
		int arr = 11;
		System.out.println(solution(arr));
	}
	
	public static boolean solution(int x) {
        boolean answer = true;
        int sum = SumDigitPlace(x);
        if(x % sum == 0) return answer;
        else return false;
    }
	
	public static int SumDigitPlace(int x) {
		int sum = 0;
		while(x > 0) {
			sum += x % 10;
			x /= 10;
		}
		return sum;
	}
}
