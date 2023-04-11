package Chapter03;

/*
 * 문자열을 정수로 변환
 * 변환 안될때는 예외 처리
 */

public class NumberFormatException {
	public static void main(String[] args) {
		String[] strNumber = {"23", "12", "3.141592", "998"};
		int i;
		
		for(i = 0; i < strNumber.length; i++) {
//			문자열을 정수로 받을때 오류
//			int j = strNumber[i];
//			String 변수로 받을 수 있음
//			String j strNumber[i];
//			Integer : Wrapper 클래스
//			parseInt : 문자여릉ㄹ 정수로 변환하는 메소드
//			NumberFormatException.main(NumberFormatException.java:20)
			try {
				int j = Integer.parseInt(strNumber[i]);
				System.out.println("숫자로 변환된 값은 " + j);
			} catch (Exception e) {
				System.out.println(strNumber[i] + "는 정수로 변환할 수 없습니다.");
			}
		}
	}
}
