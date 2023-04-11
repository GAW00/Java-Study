package JAVA_2023_03_27;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {
	public static void main(String[] args) throws Exception {
//		FileOutputStream : 바이트 단위 출력을 위한 하위 스트림 클래스
//		FileOutputStream 객체 생성해서 output.txt를 만든다.
		OutputStream os = new FileOutputStream("d:\\output.txt");	// 업캐스팅 발생!
		
//		바이트 단위로 파일에 넣을 문자열("ABC")을 읽는다
		byte[] data = "DEF".getBytes();
//		os.write(data);
		os.write(data, 1, 2);	// EF : 바이트 배열 data 에서 인덱스 1 부터 2 글자
		os.flush();				// 인터넷이 불안정한 상태에서 네트워크가 끊겼을 때 전송되지 못한 데이터를 보낸다
		
//		for (int i = 0; i < data.length; i++) {
////			FileOutputStream 객체에 바이트 배열 원소를 넣는다
//			os.write(data[i]);
//		}
		os.close();
		
	}
}
