package Programmers_lv1;

public class lv1_SmallSizeSubString {
	public static void main(String[] args) {
		String t = "500220839878";
		String p  = "7";
		System.out.println(solution(t, p));
	}
	
	public static int solution(String t, String p) {
        int answer = 0;
        
        char[] numt = t.toCharArray();
        int nump = Integer.parseInt(p);
        int sum_numt = 0; 
        for(int i = 0; i < t.length() - p.length() + 1; i++) {
        	
        	
        	// 1))
//        	if((numt[i] - 48) * 100 + (numt[i + 1] - 48) * 10 + numt[i + 2] -48 <= nump) {	// 이건 p가 3자리 수일때만;;; 자제해줘
//        		answer++;
//        	}
        	
        	// 2))
        	for(int j = 0; j < p.length(); j++) {
        		int count = 0;
        		sum_numt += (numt[i + j] - 48) * Math.pow(10, j);
        		count++;
        		if(count == p.length()) {
        			answer++;
        		}
        	}
        }
        return answer;
    }
}
