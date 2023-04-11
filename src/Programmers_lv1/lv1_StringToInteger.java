package Programmers_lv1;

public class lv1_StringToInteger {
	public static void main(String[] args) {
		String s = "-1234";
		System.out.println(solution(s));
	}
	
	public static int solution(String s) {
//        char[] arr = s.toCharArray();
//        String s2 = "";
//        if(isDigit(arr[0])){
//        	return Integer.parseInt(s);
//        }
//        else {
//        	for(int i = 1; i < arr.length; i++) s2 += arr[i];
//        	return -1 * Integer.parseInt(s2);
//        }
		return Integer.parseInt(s); // 부호도 변환 되네... 수바..
    }
	
//	public static boolean isDigit(char a) {
//		if((a >= '0' && a <= '9') || a == '+') return true;
//		else return false;
//	}
}
