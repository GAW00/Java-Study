package JAVA_2023_03_31;

import java.util.Arrays;
import java.util.Collections;

public class _02_Arraystest2 {
	public static void main(String[] args) {
		String[] a = {"a", "b", "c", "d"};
		int[] b = {1, 5, 5, 7, 3, 3, 42, 6, 8, 45323, 4, 63, 2, 1};
		System.out.println(Arrays.asList(a));	// List로
		
		Arrays.sort(b, 4, 14);	// 인덱스정렬( 4 ~ 13 까지만 정렬 )
		System.out.println(Arrays.toString(b));
		
		Arrays.sort(b);	// 오름차순 정렬
		System.out.println(Arrays.toString(b));
		
		Arrays.sort(a, Collections.reverseOrder());	// 내림차순 정렬
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a, 2, 4, Collections.reverseOrder());
		System.out.println(Arrays.toString(a));
		
		System.out.println("-------------------------------------------------");
		
		String[] cc = {"11", "12", "13", "23", "53", "223", "145", "53"};
		
		Arrays.sort(cc, Collections.reverseOrder());
		System.out.println(Arrays.toString(cc));
		
		int[] c = Arrays.copyOf(b, b.length);	// 배열객체를 복사
		System.out.println(Arrays.toString(c));
		
		String[] d = Arrays.copyOf(a, 3);
		System.out.println(Arrays.toString(d));
	}
}
