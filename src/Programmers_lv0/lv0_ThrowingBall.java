package Programmers_lv0;

public class lv0_ThrowingBall {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3};
		int k = 3;
		System.out.println(solution(numbers, k));
	}
	
	// 한명을 건너띄고 던지므로 인덱스는 2 증가하고 첫번째에 공을 던지는 것은 항상 0번 인덱스이므로 (k-1) 이다.
	public static int solution(int[] numbers, int k) {
        return (k-1)*2 % numbers.length+1;
    }
	
//	public static int solution(int[] numbers, int k) {
//        int len = numbers.length;
//        int ball = 1, past_ball = ball, count = 0;
//        boolean eo = isOdd(len);
//        
//        while(true) {
//        	if(count < k) {
//        		past_ball = ball;
//	        	ball += 2;
//	        	count++;
//        	}
//        	if(count == k) break;
//        	if(ball > len) {
//        		// 배열길이 홀수
//        		if(eo == true) {
//	        		if(isOdd(ball) == false) ball = 1;
//	        		else ball = 2;
//        		}
//        		// 배열길이 짝수
//        		else {
//	        		if(isOdd(ball) == false) ball = 2;
//	        		else ball = 1;
//        		}
//        	}
//        }
//        
//        return past_ball;
//    }
//	
//	// isOdd는 n이 홀수면 true, 짝수면 false
//	public static boolean isOdd(int n) {
//		if(n % 2 == 0) return false;
//		else return true;
//	}
	
}
