package Chapter03;

/*
 * a ~ z 출력(with "do while")
 */

public class DoWhileSample {
	public static void main(String[] args) {
		char c = 'a';
		do {
			System.out.println(c);
			// c++;
			c = (char)(c + 1);
		}
		while(c <= 'z');
	}
}
