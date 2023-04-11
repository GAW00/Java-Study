package Programmers_lv0;

public class lv0_AgeOfExtraterrestrialPlanet {
	public static void main(String[] args) {
//		int age = 23;
//		int age2 = 51;
//		int age3 = 100;
		int age4 = 1000;
		
		System.out.println(solution(age4));
	}
	
	public static String solution(int age) {
		char[] p_age = new char[26];
        for(int i = 0; i < p_age.length; i++) {    
            p_age[i] = (char)(97+i);
        }
        
        int tmp = age;
        int place = 1;
        if(tmp / 10 != 0) {
        	place++;
        	tmp /= 10;
	        if(tmp / 10 != 0) {
	        	place++;
	        	tmp /= 10;
	        	if(tmp / 10 != 0) {
	        		place++;
	        	}
	        }
        }
        
        int radix = 10; //10진수
        char[] original_age = new char[place];
        
        for(int i = place - 1; i >= 0; i--) {
        	original_age[i] = Character.forDigit(age % 10 , radix);
        	age /= 10;
        }
        
        for(int i = 0; i < place; i++) {
        	for(int j = 0; j < 26; j++) {
        		if(original_age[i] == Character.forDigit(j, radix)) {
        			original_age[i] = p_age[j];
        		}
        	}
        }
        String answer = String.valueOf(original_age);
        return answer;
    }
	// 1)
//	public String solution(int age) {
//        String answer = "";
//        String[] alpha = new String[]{"a","b","c","d","e","f","g","h","i","j"};
//
//        while(age>0){
//            answer = alpha[age % 10] + answer;
//            age /= 10;
//        }
//
//        return answer;
//    }
	
	// 2)
//	class Solution {
//	    public String solution(int age) {
//	        StringBuilder sb = new StringBuilder();
//
//	        while(age > 0) {
//	            sb.insert(0, (char) ((age % 10) + (int)'a'));
//	            age /= 10;
//	        }
//
//	        return sb.toString();
//	    }
//	}
	
}
