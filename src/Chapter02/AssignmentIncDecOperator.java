package Chapter02;

public class AssignmentIncDecOperator {
	public static void main(String[] args) {
		int a = 3, b = 3, c = 3;
		
		a += 3;	// a = a + 3
		b *= 3; // b = b + 3
		c %= 2; // c = c % 2
		System.out.printf("%d, %d, %d\n", a, b, c);
		
		int d = 3;
		a = d++;
		System.out.print(a);
		System.out.println(d);
		
		a = ++d;
		System.out.print(a);
		System.out.println(d);
		
		a=d--;
		System.out.print(a);
		System.out.println(d);
		
		a= --d;
		System.out.print(a);
		System.out.println(d);
		
	}
}
