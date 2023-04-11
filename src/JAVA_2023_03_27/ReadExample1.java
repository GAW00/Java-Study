package JAVA_2023_03_27;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample1 {
	public static void main(String[] args) throws Exception {
//		FileInputStream : 바이트 단위 입력을 위한 하위 스트림 클래스
//		InputStream : 바이트 단위 입력을 위한 최상위 스트림 클래스
		InputStream is = new FileInputStream("D:\\test.txt");	// 업캐스팅 발생!
		int readByte;
		
//		1))
		while((readByte = is.read()) != -1) {	// 읽은 값이 -1(EOF) 이 아닐떄 까지 읽음
			System.out.print((char)readByte);
		}
		
//		2))
//		while(true) {
//			readByte = is.read();	// byte 단위로 읽는다.(정수로 받음)
////			파일의 끝에는 -1이 존재한다(모든 프로그래밍 언어 동일) : EOF(End Of File)
//			if(readByte == -1) {
//				break;
//			}
//			/*
//			aaa : a = 97
//			bb  : b = 98
//			c   : c = 99
//			13  : 개행(엔터)
//			10  : 커서 처음으로
//			97 97 97 13 10 98 98 13 10 99 
//			*/
////			System.out.print(readByte + " ");
//			System.out.print((char)readByte);
//		}
		is.close();
	}
}
