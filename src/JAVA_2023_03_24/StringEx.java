package JAVA_2023_03_24;

public class StringEx {
	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(",C++ ");
		
		System.out.println(a + "의 길이는 " + a.length());			// String.length() : 문자열의길이
		System.out.println(a.contains("#"));					// String.contains() : 문자열 포함 여부
		System.out.println(a.contains("*"));					// String.contains() : 문자열 포함 여부
		

		/* ------------------------------------------------------------------- */
		
		a = a.concat(b);										// String.concat() : 문자열 연결
		System.out.println(a);
		

		/* ------------------------------------------------------------------- */
		
		a = a.trim();											// String.trim() : 문자열 앞, 뒤 공백 제거
		System.out.println(a);
		

		/* ------------------------------------------------------------------- */
		
		a = a.replace("C#", "Java");							// String.replace() : 문자열 대체 
		System.out.println(a);
		

		/* ------------------------------------------------------------------- */
		
		String s[] = a.split(",");								// Stirng.splin() : 토큰으로 문자열 분리
		for(int i = 0; i < s.length; i++) {
			System.out.println("분리된 문자열 " + i + " : " + s[i]);
		}
		

		/* ------------------------------------------------------------------- */
		
		a = a.substring(5);
		System.out.println(a);									// String.substring() : 인덱스 번 문자 부터 문자열의 일부분 자르기
		

		/* ------------------------------------------------------------------- */
		
		char c = a.charAt(2);									// String.charAt() : 인덱스에 해당하는 문자
		System.out.println(c);
	}
}
