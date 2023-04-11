package Chapter02;

import java.util.Scanner;

/*
 * 점수를 입력받아서 학점 출력
 */

public class Grading {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요>>");
		
		int score = sc.nextInt();
		char grade;
		
		if(score >= 90) grade = 'A';
		else if(score >= 80) grade = 'B';
		else if(score >= 70) grade = 'C';
		else grade = 'F';
		
		System.out.println("학점은 " + grade + "입니다.");
		
		sc.close();
	}
}
