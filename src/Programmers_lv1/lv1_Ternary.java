package Programmers_lv1;

public class lv1_Ternary {
	public static void main(String[] args) {
		int n = 45;
		System.out.println(solution(n));
	}
	
	public static int solution(int n) {
        int answer = 0;
        
        StringBuilder sb = new StringBuilder();
        
        int p = 0;
        while(true) {
        	if(n - Math.pow(3,  ++p) < 0) {
        		for(; 0 < p; p--) {
        			if(n > 0) {
	        			sb.append(String.valueOf(n / (int)Math.pow(3, p - 1)));
	        			n -= (n / (int)Math.pow(3, p - 1)) * Math.pow(3, p - 1);
        			}
        			else {
        				sb.append("0");
        			}
        		}
        		break;
        	}
        }
        sb = sb.reverse();
        for(int i = 0; i < sb.length(); i++) {
        	answer += ((int)sb.charAt(i) - '0') * Math.pow(3, sb.length() - i - 1);
        }
        
        return answer;
        
//        String a = "";
//
//        while(n > 0){
//            a = (n % 3) + a;
//            n /= 3;
//        }
//        a = new StringBuilder(a).reverse().toString();
//
//
//        return Integer.parseInt(a,3);
    }
}
