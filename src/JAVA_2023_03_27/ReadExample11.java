package JAVA_2023_03_27;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample11 {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("D:\\test.txt");	// 업캐스팅 발생
		int readData;
		char[] cbuf = new char[2];
		String data = "";
		
		while(true) {
//			readData = reader.read();		// 한개 문자단위로 읽는다	ex> 호미
			readData = reader.read(cbuf);	// 두개 문자단위로 읽는다	ex> 삽
			if(reader.read() == -1) {
				break;
			}
//			System.out.print((char)readData);	// 유니코드를 문자로 변환해서 출력
//			2개의 문자로 0 번째 인덱스부터 readData 만큼 읽어서 data 문자열에 누적
			data += new String(cbuf, 0, readData);
		}
		System.out.println(data);
		reader.close();
	}
}
