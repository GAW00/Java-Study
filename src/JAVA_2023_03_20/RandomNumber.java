package JAVA_2023_03_20;

import java.util.Random;

/*
 * 난수를 발생 => Math(클래스), Random(클래스)
 */

public class RandomNumber {
	public static void main(String[] args) {
		int rNumber;
		Random generator = new Random();
		/*
		rNumber = generator.nextInt(); // 난수 발생(범위 : int타입 범위 -> -2^31 ~ 2^31  - 1)
		rNumber = generator.nextInt(10); // 난수 발생(0 ~ 9)
		rNumber = generator.nextInt(10) + 1; // 난수 발생(0 ~ 9) + 1 -> 1 ~ 10
		rNumber = generator.nextInt(10) * (-1); // 난수 발생(0 ~ 9) * (-1) -> -9 ~ 0
		generator.nextDouble(), generator.nextFloat(),generator.nextLong(), generator.nextBoolean()
		*/
		while(true) {
			rNumber = generator.nextInt(10) + 1;
			System.out.println(rNumber);
			if(rNumber == 7) break;
		}
	}
}

