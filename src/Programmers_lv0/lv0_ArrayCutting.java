package Programmers_lv0;

import java.util.Arrays;

public class lv0_ArrayCutting {
	public static void main(String[] args) {
		int num1 = 1, num2 = 3;
		int[] numbers = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(solution(numbers, num1, num2)));
		System.out.println(Arrays.toString(Arrays.copyOf(numbers, 3)));
		System.out.println(Arrays.toString(Arrays.copyOfRange(numbers, num1, num2 + 1)));
	}
	
	public static int[] solution(int[] numbers, int num1, int num2) {
		int[] answer = new int[num2 - num1 + 1];
		
		for(int i=num1; i<=num2; i++) {
			answer[i - num1] = numbers[i];
		}
		
        return answer;
    }
}
