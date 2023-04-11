package Chapter03;

/*
 * 예외처리
 * 배열 인덱스 벗어나는 것
 */

public class ArrayException {
	public static void main(String[] args) {
		int[] intArray = new int[5];
		intArray[0] = 0;
		
		try {
			for (int i = 0; i < intArray.length; i++) {
				// 0 + 1 + 0 => intArray[1] = 1; i = 0
				intArray[i + 1] = intArray[i] + i + 1;
				System.out.println(intArray[i]);
			}
		} catch (Exception e) {
			System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
		}
	}
}
