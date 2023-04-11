package Chapter03;

public class CoronaSum {
	public static void main(String[] args) {
		int coronasum = 0;
		int[][] ca = new int[3][12];
		
		for(int i = 1; i < 4; i++) {
			for(int j = 1; j < 13; j++) {
				ca[i - 1][j - 1] = j * 10 + i;
				coronasum += ca[i - 1][j - 1];
			}
		}
		System.out.println(coronasum);
	}
}
