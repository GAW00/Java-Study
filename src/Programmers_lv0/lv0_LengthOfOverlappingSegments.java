package Programmers_lv0;

import java.util.Arrays;

public class lv0_LengthOfOverlappingSegments {
	public static void main(String[] args) {
		int[][] lines = {{0,1}, {2,5}, {3,9}};
		int[][] lines2 = {{-1,1}, {1,3}, {3,9}};
		int[][] lines3 = {{0,2}, {-3,-1}, {-2,1}};
		int[][] lines4 = {{0,5}, {3,9}, {1,10}};
		int[][] lines5 = {{-100,-20}, {-50,70}, {0,100}};
		
		
		System.out.println(solution(lines5));
	}
	
	public static int solution(int[][] lines) {
		// 1) 201칸 배열생성해 전원 0으로 초기화(-100 ~ 100까지는 201개 숫자)
		// 2) lines[0] ~ lines[2]까지 읽으면서 나오는 값들 마다 배열 값 1부터 증가
		// 3) 값이 2 이상인 번호만 카운트후 반환
		
		int[] counting = new int[201];
		int[] counting1 = new int[201];
		int[] counting2 = new int[201];
		int count = 0;
		
		for(int i = 0; i < lines.length; i++) {
			for(int j = lines[i][0]; j <= lines[i][1]; j++) {
				// -100을 counting[0]에 배치, 0을 counting[99]에 배치, 100을 counting[199]에 배치
				if(i == 0) counting[j + 100]++;
				else if(i == 1) counting1[j + 100]++;
				else counting2[j + 100]++;
			}
		}
//		System.out.println(Arrays.toString(counting));
//		System.out.println(Arrays.toString(counting1));
//		System.out.println(Arrays.toString(counting2));
		
		for(int i = 0; i < 200; i++) {
			int j = i + 1;
			if(((counting[i] > 0 && counting[j] >0) && (counting1[i] > 0 && counting1[j] > 0))
					|| ((counting2[i] > 0 && counting2[j] >0) && (counting1[i] > 0 && counting1[j] > 0))
					|| ((counting[i] > 0 && counting[j] >0) && (counting2[i] > 0 && counting2[j] > 0))) {
				count++;
			}
		}
		return count;
	}
}