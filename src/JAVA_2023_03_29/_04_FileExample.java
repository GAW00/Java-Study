package JAVA_2023_03_29;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class _04_FileExample {
	public static void main(String[] args) throws Exception {
//		File dir = new File("d://test"); // uri : url + 파일경로 + db경로 + 지도경로
		File dir = new File("d://test/dir");
		File file1 = new File("d://test/file1.txt");
		File file2 = new File("d://test/file2.txt");
		File file3 = new File("d://test/file3.txt");
		
		dir.mkdir();			// 디렉토리 만들기
		dir.mkdirs();			// 디렉토리 만들기(하위 디렉토리 포함)
		file1.createNewFile();	// 파일 만들기
		file2.createNewFile();	// 파일 만들기
		file3.createNewFile();	// 파일 만들기
		
		File test = new File("d:/test");	// 디렉토리 정보를 가지고 test 객체 생성
		File[] contents = test.listFiles();	// 파일 생성 디렉토리의 정보를 가져온다(하위 디렉토리 + 파일들 모두)
		System.out.println("날짜		시간		형태		크기		이름");
		System.out.println("--------------------------------------------------------------------------------");
		
//		년월일 오전/오후 시분
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		for (int i = 0; i < contents.length; i++) {
//			1680054484008 : 1970년 1월 1일 기준으로 오늘까지의 milisec(1/1000초)로 계산된 값(long type)
//			System.out.println(contents[i].lastModified());	// 마지막 생성일자
//			System.out.println(new Date(contents[i].lastModified()));	// 마지막 생성일자
			System.out.print(sdf.format(new Date(contents[i].lastModified())));	// 마지막 생성일자
			
			if (contents[i].isDirectory()) { // 디렉토리 일때
				System.out.print("\t<DIR>\t\t" + contents[i].getName()); // 디렉토리 이름
			}
			else { // 파일일때
				System.out.print("\t\t" + contents[i].length() + "\t" + contents[i].getName());
			}
			System.out.println();
		}
	}
}

