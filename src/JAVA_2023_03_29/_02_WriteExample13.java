package JAVA_2023_03_29;

import java.io.FileWriter;
import java.io.Writer;

public class _02_WriteExample13 {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("D:/output.txt");
		char[] data = "홍길동2".toCharArray(); 
		
//		writer.write(data);
//		길동 : "홍길동2"에서 인덱스 1번부터 2글자를 읽어서 파일로 저장
		writer.write(data, 1, 2);
		writer.close();
	}
}
