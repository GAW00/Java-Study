package Chapter03;

public class DoWhileTest {
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		do {
			sum += i++;
		}while(i < 100);
		System.out.println(sum);
	}
}
