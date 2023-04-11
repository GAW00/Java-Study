package JAVA_2023_03_24;

public class WrraperEx {
	public static void main(String[] args) {
		char c1 = '4', c2 = 'F';
		
//		Character Wrrapper 클래스
//		isDigit : char 타입 변수의 숫자 판별 메소드
		if(Character.isDigit(c1)) {
			System.out.println("숫자");
		}
		else {
			System.out.println("숫자 아님");
		}
		
		if(Character.isDigit(c2)) {
			System.out.println("숫자");
		}
		else {
			System.out.println("숫자 아님");
		}
		
//		idAlphabetic : char 타입 변수가 영문인지 판별 메소드
		if(Character.isAlphabetic(c1)) {
			System.out.println("알파벳");
		}
		else {
			System.out.println("알파벳 아님");
		}
		
		if(Character.isAlphabetic(c2)) {
			System.out.println("알파벳");
		}
		else {
			System.out.println("알파벳 아님");
		}
		
//		Integer : Wrapper클래스, parseInt : 문자열을 int 타입으로 변환하는 메소드
		System.out.println(Integer.parseInt("-123"));
		System.out.println(Integer.parseInt("27"));
		System.out.println(Integer.toHexString(27));
		System.out.println(Integer.toBinaryString(27));
		System.out.println(Integer.bitCount(27));
		
		Double d = Double.valueOf(3.14);				// 3.14를 포함하는객체를 가리키는 d 참조변수
		System.out.println(d);							// 문자열 3.14를 출력(Integer.toString() 생략된것)
		System.out.println(Double.parseDouble("3.14"));	// 실수 3.14를 출력
		
		boolean b = (4 > 3);
		System.out.println(b);							   // 문자열 true를 출력(Boolean.toString 생략된것)
		System.out.println(Boolean.parseBoolean("false")); // boolean값 false를 출력
	}
}
