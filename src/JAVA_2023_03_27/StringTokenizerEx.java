package JAVA_2023_03_27;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		String str = "홍길동/장화/&홍련/콩쥐&팥쥐";
		
		StringTokenizer st = new StringTokenizer(str, "/&");
		while(st.hasMoreTokens()) {				// 아직 토큰이 남음 : true
			System.out.println(st.nextToken());	// 토큰 꺼내오기
		}
		
		String[] arr = str.split("/&");
		System.out.println(Arrays.toString(arr));
	}
}
