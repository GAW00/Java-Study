package Programmers_lv1;

public class lv1_SumOfDigitPlace {
	public static void main(String[] args) {
		int N = 123;
		System.out.println(solution(N));
	}
	
	public static int solution(int n) {
        int answer = 0;
        while(true) {
        	answer += n % 10;
        	if(n / 10 == 0) break;
        	n /= 10;
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
