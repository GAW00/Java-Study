package Chapter03;

/*
 * 4년 전체 평점(평균 학점) 평균 구하기
 * 2차원 배ㅕㅇㄹ 이용해 서 원소로 초기화
 * 1행1열부터 4행 2열까지
 * length 필드 이용(행/열 크기)
 */

public class Ex3_10 {
	public static void main(String[] args) {
		double sum = 0;
		int count = 0;
		double score[][] = {{3.3, 3.4}, // 1, 2학기
							{3.5, 3.6},
							{3.7, 4.0},
							{4.1, 4.2}};
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[0].length; j++) {
				sum+= score[i][j];
				count++;
			}
		}
		System.out.println(sum / count);
	}
}
