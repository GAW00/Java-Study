package Chapter03;

/*
 * 문자열에서 r 알파벳 갯수 구하기
 * 알파벳 대/소문자 상관없음
 * toCharArray() 메소드 이용
 */

public class Ex3_8 {
	public static void main(String[] args) {
		int count = 0;
		String str = "Programming is fun! Right?";
		char[] ch_arr = str.toCharArray();
		for(int i = 0; i < str.length(); i++) {
			char ch = Character.toUpperCase(ch_arr[i]);
			if(ch == 'R') count++;
		}
		System.out.println(count);
	}
}
