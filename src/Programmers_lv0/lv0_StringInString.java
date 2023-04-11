package Programmers_lv0;

public class lv0_StringInString {
	public static void main(String[] args) {
//		String s1 = "ab6CDE443fgh22iJKlmn1o", s2 = "6CD";
//		String s3 = "ppprrrogrammers", s4 = "pppp";
		String s5 = "AbcAbcA", s6 = "AAA";
		
		System.out.println(solution(s5, s6));
	}
	
	public static int solution(String str1, String str2) {
		return (str1.contains(str2)? 1 : 2); // 이런;
	}
	
//	public static int solution(String str1, String str2) {
//        char[] arr1 = str1.toCharArray();
//        char[] arr2 = str2.toCharArray();
//        int answer = 2;
//        for(int i = 0; i < arr1.length; i++) {
//        	int count = 1;
//        	answer = isIn(i, arr1, arr2, count);
//        	if(answer == 1) break;
//        }
//        return answer;
//    }
//	
//	public static int isIn(int i, char[] arr1, char[] arr2, int count) {
//		try {
//			for(int j = 0; j < arr2.length; j++) {
//				if(arr1[i] != arr2[j]) {
//					break;
//				}
//				else {
//					if(count == arr2.length) {
//						return 1;
//					}
//					count++;
//					i++;
//				}
//			}
//		}catch(Exception e) {
//	    	return 2;
//		}
//    	return 2;
//	}
}
