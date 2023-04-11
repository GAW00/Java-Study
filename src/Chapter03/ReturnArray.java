package Chapter03;

import java.util.Arrays;

/*
 * 배열 리턴(메소드 이용)
 */

public class ReturnArray {
//	makeArray() : 메소드
	static int[] makeArray() {
//		배열 생성시 타입이 불일치시 오류
//		int tmp[] = new String[4];
		int tmp[] = new int[4];
		
		for(int i = 0; i< tmp.length; i++) {
			tmp[i] = i;
		}
		
		return tmp;
	}
	
	public static void main(String[] args) {
		int[] intArray;
//		메소드 호출
		intArray = makeArray(); // tmp 배열({0, 1, 2, 3})
		System.out.println(Arrays.toString(intArray));
	}
}
