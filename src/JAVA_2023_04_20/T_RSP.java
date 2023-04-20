package JAVA_2023_04_20;

import java.util.Scanner;

public class T_RSP {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String u_rsp = get_u_rsp(sc);
			if(u_rsp.equals("그만")) break;
			String c_rsp = get_c_rsp();
			get_result(u_rsp, c_rsp);
		}
		sc.close();
		System.out.println("게임을 종료합니다...");
	}
	public static String get_u_rsp(Scanner sc) {
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		System.out.print("가위 바위 보!>>");
		return sc.next();
	}
	public static String get_c_rsp() {
		String[] rsp = {"가위", "바위", "보"};
		return rsp[(int)(Math.random() * 3)];
	}
	
	public static String choice_winner(String u, String c) {
		StringBuilder winner = new StringBuilder();
		int i = win_logic(u, c);
		if(i == 0) winner.append("무승부 입니다.");
		else if(i == 1)winner.append("사용자가 이겼습니다.");
		else if(i == 2)winner.append("컴퓨터가 이겼습니다.");
		return winner.toString();
	}
	public static int win_logic(String u, String c) {
		if(u.equals("가위")) {
			if(c.equals("가위")) return 0;
			if(c.equals("바위")) return 2;
			if(c.equals("보")) return 1;
		}
		if(u.equals("바위")) {
			if(c.equals("가위")) return 1;
			if(c.equals("바위")) return 0;
			if(c.equals("보")) return 2;
		}
		if(u.equals("보")) {
			if(c.equals("가위")) return 2;
			if(c.equals("바위")) return 1;
			if(c.equals("보")) return 0;
		}
		return -1;
	}
	public static void get_result(String u_rsp, String c_rsp) {
		System.out.println("사용자는 = " + u_rsp
				+ ", 컴퓨터는 = " + c_rsp
				+ ", " + choice_winner(u_rsp, c_rsp));
	}
}
