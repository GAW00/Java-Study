package Programmers_lv1;

public class lv1_Average {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		System.out.println(solution(arr));
	}
	
	public static double solution(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) sum += arr[i];
        return (double)sum / arr.length;
//		return Arrays.stream(arr).average().getAsDouble();
    }
}
