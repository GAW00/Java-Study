package JAVA_2023_03_27;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample12 {
	public static void main(String[] args) throws Exception {
//		FileReader : 문자 단위 입력을 위한 하위 스트림 클래스
//		Reader : 문자 단위 입력을 위한 최상위 스트림 클래스
		Reader reader = new FileReader("D:\\test.txt");	// 업캐스팅 발생
		int readData;
		
		while(true) {
			readData = reader.read();	// 한개 문자단위로 읽는다
			if(reader.read() == -1) {
				break;
			}
			System.out.print((char)readData);	// 유니코드를 문자로 변환해서 출력
		}
		reader.close();
	}
}
