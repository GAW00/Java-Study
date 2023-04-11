package Chapter03;

public class ForSamlple {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
			if(i == 10) { System.out.print(i + " = " + sum); break; }
			System.out.print(i + " + ");
		}
	}
}
