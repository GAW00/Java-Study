package Programmers_lv1;

public class lv1_MinimumRectangle {
	public static void main(String[] args) {
		int[][] sizes = {{60, 50},
						 {30, 70},
						 {60, 30},
						 {80, 40}
				
		};
		System.out.println(solution(sizes));
	}
	
	public static int solution(int[][] sizes) {
        int[] max = new int[2];
        int tmp;
        
        for(int i = 0; i < sizes.length; i++) {
        	if(sizes[i][0] < sizes[i][1]) {
        		tmp = sizes[i][0];
        		sizes[i][0] = sizes[i][1];
        		sizes[i][1] = tmp;
        	}
        	if(max[0] < sizes[i][0]) max[0] = sizes[i][0];
        	if(max[1] < sizes[i][1]) max[1] = sizes[i][1];
        }
        return max[0] * max[1];
    }
}



//class Solution {
//    public int solution(int[][] sizes) {
//        int length = 0, height = 0;
//        for (int[] card : sizes) {
//            length = Math.max(length, Math.max(card[0], card[1]));
//            height = Math.max(height, Math.min(card[0], card[1]));
//        }
//        int answer = length * height;
//        return answer;
//    }
//}