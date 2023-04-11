package Programmers_lv0;

public class lv0_IsSquare {
	public static void main(String[] args) {
		int a = 144;
		System.out.println(solution(a));
	}
	
	public static int solution(int n) {
        if(Math.sqrt(n) == (int)Math.sqrt(n)){
			return 1;
		}
		return 2;
    }
}
