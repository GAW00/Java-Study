package Chapter02;

public class rollDice {
	public static void main(String[] args) {
		int n = rollDice();
	}
	
	
	public static int rollDice() {
//		random() : 0 ~ 1미만 난수 발생
//		Math.random()
		double x = 6 * Math.random();
		int temp = (int)x;
		
		return temp + 1;
	}
}
