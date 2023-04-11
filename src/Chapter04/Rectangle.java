package Chapter04;

import java.util.Scanner;

public class Rectangle {
	int width;
	int height;
	
	public int getArea() {
		return width * height;
	}
	
	public static void main(String[] args) {
		Rectangle a = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.print(">>");
		a.width = sc.nextInt();
		a.height = sc.nextInt();
		System.out.println("사각형의 면적은 " + a.getArea());
		sc.close();
	}
}
