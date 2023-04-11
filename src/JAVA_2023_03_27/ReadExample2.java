package JAVA_2023_03_27;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class ReadExample2 {
	public static void main(String[] args) throws Exception {
//		FileInputStream : 바이트 단위 입력을 위한 하위 스트림 클래스
//		InputStream : 바이트 단위 입력을 위한 최상위 스트림 클래스
		InputStream is = new FileInputStream("D:\\test.txt");	// 업캐스팅 발생!
		int readByte;
		byte[] readBytes = new byte[3];
//		System.out.println(Arrays.toString(readBytes));
		String data = "";
		
//		while((readByte = is.read()) != -1) {	// 읽은 값이 -1(EOF) 이 아닐때 까지 읽음
//			System.out.print((char)readByte);
//		}
		
		while(true) {
//			readByte = is.read();			// 1byte 단위로 읽는다.(정수로 받음)	ex> 호미
			readByte = is.read(readBytes);	// 3byte 단위로 읽는다.(정수로 받음)	ex> 삽 (크기 3배)
			
			
//			파일의 끝에는 -1이 존재한다(모든 프로그래밍 언어 동일) : EOF(End Of File)
			if(readByte == -1) {
				break;
			}
			System.out.println(readByte);
			System.out.println(Arrays.toString(readBytes));
//			System.out.print((char)readByte);
//			System.out.print(readByte);
//			readBytes 를 0 인덱스부터 readByte 길이만큼 읽는다
			data += new String(readBytes, 0, readByte);
		}
		System.out.println("-------------------------");
		System.out.println(data);
		is.close();
	}
}