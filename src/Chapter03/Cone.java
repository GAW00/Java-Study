package Chapter03;

import java.util.Scanner;

public class Cone {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원뿔 밑의 원의 반지름을 입력하십시오 : ");
		double radius = sc.nextDouble();
		System.out.print("원뿔의 높이를 입력하십시오 : ");
		double height = sc.nextDouble();
		
		double volume = (Math.PI * Math.pow(radius, 2) * height) / 3;
		
		System.out.println("원뿔 밑의 원의 반지름 : " + radius);
		System.out.println("원뿔의 높이 : " + height);
		System.out.println("원뿔의 부피 : " + volume);
		
		sc.close();
	}
}
