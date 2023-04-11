package JAVA_2023_03_20;

public class RandomTen {
	public static void main(String[] args) {
		int[] arr = new int[10]; // 랜덤한 정수들을 담을 배열 arr
		int sum = 0; // arr배열의 요소들의 합을 저장할 sum
		
		System.out.print("랜덤한 정수들 : ");
		for(int i = 0; i < 10; i++) {
			arr[i] = (int)(Math.random() * 10) + 1; // arr의 i번째 칸에 1 ~ 10 사이 정수를 저장
			System.out.print(arr[i] + " "); // 해당 요소 출력
			sum += arr[i]; // sum에 해당 요소를 더함
		}
		System.out.println();
		System.out.println("평균은 " + (double)(sum / 10)); // 평균은 총합 / 개수
	}
}

