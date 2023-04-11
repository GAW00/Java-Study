package JAVA_2023_03_22;

import java.util.Scanner;

public class Trapezoid {
	int down;
	int up;
	int height;
		
	public Trapezoid(int down, int up, int height) {
		this.down = down;
		this.up = up;
		this.height = height;
	}

	double getArea(){
		return (down + up) * height / 2;	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(">>");
		Trapezoid t = new Trapezoid(sc.nextInt(), sc.nextInt(),sc.nextInt());
		
		System.out.println("사다리꼴의 면적은 " + t.getArea());
		sc.close();
	}
}
