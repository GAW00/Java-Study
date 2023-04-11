package Programmers_lv1;

public class lv1_CollatzConjecture {
	public static void main(String[] args) {
		int n = 626331;
		System.out.println(solution(n));
	}
	
	public static int solution(int num) {
        int answer = 0;
        answer = Collatz((long)num, answer);
        return answer;
    }
	
	public static int Collatz(long num, int count) {
		if(count > 500) return -1;
		if(num == 1) return count;
		else if(num % 2 == 0) return Collatz(num / 2, ++count);
		else return Collatz(num * 3 + 1, ++count);
	}
}
