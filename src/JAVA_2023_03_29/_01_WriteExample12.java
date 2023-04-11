package JAVA_2023_03_29;

import java.io.FileWriter;
import java.io.Writer;

public class _01_WriteExample12 {
	public static void main(String[] args) throws Exception {
//		Writer writer = new FileWriter("D:\\output.txt");	// 업캐스팅 발생!
//		운영체제에 따라서 경로설정을 다르게 해야 작동하는 경우도 있다(ex> unix, linux, mac)
		Writer writer = new FileWriter("D:/output.txt");
		char[] data = "홍길동2".toCharArray(); 
		
		writer.write(data);
		
//		for (int i = 0; i < data.length; i++) {
//			writer.write(data[i]);
//		}
		writer.close();
	}
}
