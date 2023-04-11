package Programmers_lv0;

public class lv0_FindingCompositeNumber {
	public static void main(String[] args) {
		int n = 10;
		System.out.println(solution(n));
	}
	
	public static int solution(int n) {
        int count = 0;        
        for(int i = 1; i <= n; i++) {
        	int isComp = 0;
        	for(int j = 1; j <= i; j++) if(i % j == 0) isComp++;
        	if(isComp > 2) count++;
        }
        return count;
    }
}
