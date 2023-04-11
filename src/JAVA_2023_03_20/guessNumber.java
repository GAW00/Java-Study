package JAVA_2023_03_20;

import java.util.Scanner;

public class guessNumber {
	public static void main(String[] args) {
		int numberToGuess, guess; // 발생시킨 난수, 사용자가 추측한 난수
		numberToGuess = (int)(Math.random() * 10) + 1; // 난수값 저장
		
		Scanner sc = new Scanner(System.in); // 입력을 받기위해 Scanner객체 생성
		while (true) { // break를 만날때 까지 반복
			System.out.print("추측한 숫자를 입력하세요 : "); // 추측값 입력 요청
			guess = sc.nextInt(); // 입력 값을 guess에 저장
			if(guess == numberToGuess) { // 조건 1) 추측값과 난수의 값이 같다면
				System.out.println("맞추셨습니다"); // 정답이다!
				break; // 반복문 종료
			}
			else if(guess > numberToGuess) System.out.println("추측한 숫자가 너무 큽니다"); // 조건문 2) 추측값이 난수보다 클 경우 너무 큽니다 출력
			else System.out.println("추측한 숫자가 너무 작습니다"); // 조건문 3) 추측값이 난수보다 작을 경우 너무 작습니다 출력
		}
		sc.close(); // 사용한 Scanner객체 반환
	}
}
