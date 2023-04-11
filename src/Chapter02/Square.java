package Chapter02;

public class Square {
	public static void main(String[] args) {
		int length = 4;
		System.out.println(square(length));
	}
		
	public static int square(int length) {
		return (int) Math.pow(length, 2);
	}
}
