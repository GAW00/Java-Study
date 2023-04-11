package Programmers_lv0;

public class lv0_NumberOfDice {
	public static void main(String[] args) {
		int[] box = {10, 8, 6};
		int n = 3;
		System.out.println(solution(box, n));
	}
	
	public static int solution(int[] box, int n) {
        return (box[0] / n) * (box[1] / n) * (box [2] / n);
    }
}
