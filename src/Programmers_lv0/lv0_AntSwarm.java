package Programmers_lv0;

public class lv0_AntSwarm {
	public static void main(String[] args) {
		int hp = 23;
		System.out.println(solution(hp));
	}
	
	public static int solution(int hp) {
        return hp / 5 + hp % 5 / 3 + hp % 5 % 3;
    }
//	
//	public static int solution(int hp) {
//        int[] str = {5, 3, 1};
//        int[] count = {0, 0, 0};
//        int sum = 0;
//
//        for(int i = 0; i < 3; i++){
//            count[i] = hp / str[i];
//            hp -= str[i] * count[i];
//            sum += count[i];
//        }
//        return sum;
//    }
}
