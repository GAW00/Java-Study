package Chapter02;

import java.util.Scanner;

/*
 * 점수를 입력받아서 학점 출력
 */

public class GradingSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요>>");
		
		int score = sc.nextInt();
		char grade;
		
//		if(score >= 90) grade = 'A';
//		else if(score >= 80) grade = 'B';
//		else if(score >= 70) grade = 'C';
//		else if(score >= 60) grade = 'D';
//		else grade = 'F';
		
		switch (score / 10){
		case 10: // 100점
			grade = 'A';
			break;
		case 9: //90 ~ 99점
			grade = 'B';
			break;
		case 8: //80 ~ 89점
			grade = 'C';
			break;
		case 7: //70 ~ 79점
			grade = 'D';
			break;
		default: //0 ~ 69점
			grade = 'F';
			break;
		}
		
		System.out.println("학점은 " + grade + "입니다.");
		
		sc.close();
	}
}
