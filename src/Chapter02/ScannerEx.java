package Chapter02;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요>>");
//		System.in : 바이트 표준 입력 스트림
//		Scanner : 참조 변수
//		new Scanner(System.in) : 객체 생성;
//		Scanner 객체를 생성하고, Scanner 클래스 타입의 sc 참조변수를 가리킴
//		System.in : 매개변수(인자, 파라미터)
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String city = sc.next();
		String age = sc.next();
		String weight = sc.next();
		String marrige = sc.next();
		
		sc.close(); // scanner 객체 종료(자원 반남)
//		=> 메모리를 더 사용할 수 있고, 안하면 garbage collector(쓰레기 청소부)가 자동으로 정리
		
		System.out.printf("%s, %s, %s, %s, %s\n", name, city, age, weight, marrige);
	}
}
