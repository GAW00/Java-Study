package Programmers_lv0;

public class lv0_Factorial {
	public static void main(String[] args) {
		int n = 3628800;
		System.out.println(solution(n));
	}
	
	public static int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= 10; i++){
            if(factorial(i) > n) break;
            else answer = i;
        }
        return answer;
    }
    
    public static int factorial(int i) {
        if(i == 1) return 1;
        else return factorial(i - 1) * i;
    }
}
