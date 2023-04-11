package Programmers_lv0;

import java.lang.Character;

public class lv0_AddHiddenNum {
	public static void main(String[] args) {
		String my_string = "aAb1B2cC34oOp";
		System.out.println(solution(my_string));
	}
	
	public static int solution(String my_string) {
		char[] chs = my_string.toCharArray();
        int sum = 0;
		for(int i = 0; i < chs.length; i++) {
			if(Character.isDigit(chs[i])) {
				sum += (int) chs[i] - 48;
			}
		}
		return sum;
    }
}
