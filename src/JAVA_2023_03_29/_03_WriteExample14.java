package JAVA_2023_03_29;

import java.io.FileWriter;
import java.io.Writer;

public class _03_WriteExample14 {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("D:/output.txt");
//		char[] data = "홍길동2".toCharArray(); 
		String data = "안녕 자바 프로그램"; 
		
//		자바 : "안녕 자바 프로그램"에서 인덱스 3번부터 2글자를 읽어 파일로 저장
		writer.write(data, 3, 2);
		writer.close();
	}
}
