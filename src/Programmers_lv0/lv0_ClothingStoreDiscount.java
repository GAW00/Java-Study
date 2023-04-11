package Programmers_lv0;

public class lv0_ClothingStoreDiscount {
	public static void main(String[] args) {
		int price = 150000;
		System.out.println(solution(price));
	}
	
	public static int solution(int price) {
        int answer = 0;
        if(price >= 500000) answer = (int)(0.8 * price);
        else if(price >= 300000) answer = (int)(0.9 * price);
        else if(price >= 100000) answer = (int)(0.95 * price);
        else answer = price;
        
        return answer;
    }
}
