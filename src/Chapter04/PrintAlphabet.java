package Chapter04;

import java.util.Scanner;

public class PrintAlphabet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		char alp = sc.next().charAt(0);
		
		StringBuilder sb = new StringBuilder();
		sb.append("abcdefghijklmnopqrstuvwxyz");
		for(int i = 25; i >= 0; i--) {
			if(alp >= sb.charAt(i)) {
				System.out.println(sb.substring(0, i + 1).toString());
			}
		}
		sc.close();
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("소문자 알파벳 하나를 입력하시오>>");
//		char alp = sc.next().charAt(0);
//		
//		for(char i = alp; i >= 'a'; i--) {
//			for(char j = 'a'; j <= i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
//		sc.close();
	}
}
