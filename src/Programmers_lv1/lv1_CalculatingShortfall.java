package Programmers_lv1;

public class lv1_CalculatingShortfall {
	public static void main(String[] args) {
		int price = 2500, money = 1, count = 2500;
		System.out.println(solution(price, money, count));
	}
	
	public static long solution(int price, int money, int count) {
        int cnt = 0;
        long charge = money;
        while(cnt != count) {
        	charge -= price * ++cnt;
        }
        if(charge < 0) return Math.abs(charge);
        else return 0;
        
//        return Math.max(price * ((long)count * (count + 1) / 2) - money, 0);
    }
}
