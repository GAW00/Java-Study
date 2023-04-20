package JAVA_2023_04_06;

import java.util.Date;

public class T_trueman {
	public static void main(String[] args) {
		Date date = new Date();	// Calendar cal = new Calendar();
		int hour = date.getHours();
		int minute = date.getMinutes();

		System.out.println("현재 시간은 " + hour + "시 " + minute + "분입니다.");
		if(hour >= 4 && hour < 12) System.out.println("Good Morning");
		else if(hour >= 12 && hour < 18) System.out.println("Good Afternoon");
		else if(hour >= 18 && hour < 22) System.out.println("Good Evening");
		else System.out.println("Good Night");
	}
}
