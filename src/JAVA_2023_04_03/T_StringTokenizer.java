package JAVA_2023_04_03;

import java.util.StringTokenizer;

public class T_StringTokenizer {
	public static void main(String[] args) {
		String str = "홍길동/장화/홍련/콩쥐/팥쥐";
		StringTokenizer token = new StringTokenizer(str, "/");
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
	}
}
