package JAVA_2023_04_20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class T_Server_Cal {
	public static void main(String[] args) {
		ServerSocket listener = null; // 서버 소켓 선언
		Socket socket = null;		  // 클라이넌트 소켓 선언
//		데이터 전송 기본단위 = byte --> 문자인 경우 데이터 전송시 문자를 바이트로, 수신시 바이트를 문자로 변환 필요
//		이 변환을 편하게 하기위해 자바에서 제공하는 InputStreamReader, OutputStreamWriter 클래스 존재
//		또, 데이터 입출력 효율을 위해 바로 전달 X, 중간에 버퍼를 이용 = BufferedReader, BufferedWriter
		BufferedReader in = null;	  // 입력 : 클라이언트에서 들어오는 데이터
		BufferedWriter out = null;	  // 출력 : 서버에서 보내는 데이터
		Scanner sc = new Scanner(System.in); 
		
		try {
			listener = new ServerSocket(9999);	// 서버소켓 객체 생성, 9999 = 포트번호
			System.out.println("연결을 기다리고 있습니다.....");
			// 소켓 객체로 데이터를 주고 받음
			socket = listener.accept();	// 클라이언트의 연결을 대기 (Block 상태)
			
			// 입력 : 클라이언트에서 서버로 들어오는 데이터
			// 수신 데이터 버퍼에 저장( input 스트림을 통한 데이터 수신[클라 -> 서버]( 데이터 수신을 위한 input 스트림 생성 ) )
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));	// 기본은 InputStream But, 단위 2byte인 한글은 깨지므로 char단위인 InputStreamReader사용
			
			// 출력 : 서버에서 클라이언트로 보내는 데이터
			// 송신 데이터 버퍼에 저장( output 스트림을 통한 데이터 송신[서버-> 클라]( 데이터 송신을 위한 output 스트림 생성 ) )
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			System.out.println("연결되었습니다.");
			while(true) {
				String outputMessage = sc.nextLine();
				if(outputMessage.equals("bye")) {
					out.write(outputMessage + "\n");
					out.flush();
					break;
				}
				out.write(outputMessage + "\n");
				out.flush();
			}
		} catch (Exception e) {
			e.printStackTrace(); // 예외처리시 sys에서 자동으로 출력되는 메세지
		} finally {
			// 반납시의 예외발생도 고려
			try {
				// 자원 반납을 통한 메모리 정리
				sc.close();
				socket.close();
				listener.close();
			} catch (Exception e2) {	// 서버와 클라이언트 간 입출력시 예외 발생
				System.out.println("클라이언트와 채팅 중 오류가 발생했습니다.");
			}
		}
	}
}
