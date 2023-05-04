package JAVA_2023_04_20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class T_Client_Cal {
	public static void main(String[] args) {
		Socket socket = null;		  // 클라이넌트 소켓 선언
		BufferedReader in = null;	  // 입력 : 클라이언트에서 드러오는 데이터
		BufferedWriter out = null;	  // 출력 : 서버에서 보내는 데이터
		Scanner sc = new Scanner(System.in); 
		
		try {
			// 서버 ip와 포트로 소켓 객체 생성
			// 소켓 객체로 데이터를 주고 받음
			socket = new Socket("localhost", 9999);
			// 입력 : 서버에서 클라이언트로 들어오는 데이터
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// 출력 : 클라이언트에서 서버로 보내는 데이터
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				String inputMessage = in.readLine();
				System.out.print("계산식(빈칸으로 띄어 입력, 예 : 24 + 42)>>");
				System.out.println(inputMessage);
				if(inputMessage.equals("bye")) {
					break;
				}
				String[] strA = inputMessage.split(" ");
				double answer = calc(strA);
				System.out.println("계산결과 : " + Math.round(answer * 100) / 100.0);
			}
		} catch (Exception e) {
			e.printStackTrace(); // 예외처리시 sys에서 자동으로 출력되는 메세지
		} finally {
			// 반납시의 예외발생도 고려
			try {
				// 자원 반납
				sc.close();
				socket.close();
			} catch (Exception e2) {	// 서버와 클라이언트 간 입출력시 예외 발생
				System.out.println("클라이언트와 채팅 중 오류가 발생했습니다.");
			}
		}
	}
	
	public static double calc(String[] s) {
		double answer = 0;
		int n1 = Integer.parseInt(s[0]);
		int n2 = Integer.parseInt(s[2]);
		
		switch (s[1]) {
		case "+":
			answer = n1 + n2;
			break;
		case "-":
			answer = n1 - n2;
			break;
		case "*":
			answer = n1 * n2;
			break;
		case "/":
			if(n2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				break;
			}
			answer = n1 / (double)n2;
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}
		return answer;
	}
}
