package Programmers_lv1;

public class lv1_BasicHandlingTheString {
	public static void main(String[] args) {
		String s = "123f56";
		System.out.println(solution(s));
	}
	
//	public static boolean solution(String s) {
//        if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");
//        return false;
//  }
	
	public static boolean solution(String s) {
        if(s.length() != 4 && s.length() != 6) {
        	return false;
        }
        if(!isDigit(s)) {
        	return false;
        }
        return true;
    }
	
	public static boolean isDigit(String s) {
		char[] arr = s.toCharArray();
		for(int i = 0; i < arr.length; i++) {
			if(Character.isDigit(arr[i]) == false) return false;
		}
		return true;
	}
}
