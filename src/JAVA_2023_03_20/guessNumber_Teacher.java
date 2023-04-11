package JAVA_2023_03_20;

import java.util.Random;
import java.util.Scanner;

public class guessNumber_Teacher {
	public static void main(String[] args) {
		int numberToGuess, guess;
		Random ge = new Random();
		Scanner sc = new Scanner(System.in);
		numberToGuess = ge.nextInt(10) + 1;
		guess = sc.nextInt();
		
		while(guess != numberToGuess) {
			System.out.println("추측한 숫자가 틀렸습니다.");
			if(guess > numberToGuess) {
				System.out.println("추측한 숫자가 너무 큽니다.");
			}
			else {
				System.out.println("추측한 숫자가 너무 작습니다.");
			}
			System.out.print("추측한 숫자를 입력하세요 : ");
			guess = sc.nextInt();
		}
		System.out.println("맞추셨습니다.");
		sc.close();
	}
}
