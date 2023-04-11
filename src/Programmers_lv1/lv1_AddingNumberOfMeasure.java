package Programmers_lv1;

public class lv1_AddingNumberOfMeasure {
	public static void main(String[] args) {
		int left = 13, right = 17;
		System.out.println(solution(left, right));
	}
	
	public static int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i <= right; i++) {
        	if(numberOfMeasure(i) % 2 == 0) answer += i;
        	else answer -= i;
        }
        return answer;
        
//        int answer = 0;
//
//        for (int i=left;i<=right;i++) {
//            //제곱수인 경우 약수의 개수가 홀수
//            if (i % Math.sqrt(i) == 0) {
//                answer -= i;
//            }
//            //제곱수가 아닌 경우 약수의 개수가 짝수
//            else {
//                answer += i;
//            }
//        }
//
//        return answer;
    }
	
	public static int numberOfMeasure(int n) {
		int count = 1;
		for(int i = 1; i <= n / 2; i++) {
			if(n % i == 0) count++;
		}
		return count;
	}
}
