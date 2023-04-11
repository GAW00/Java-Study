package JAVA_2023_03_20;

public class ArrayParameterEx {
	public static void main(String[] args) {
		char c[] = { 'T', 'h', 'i' , 's' , ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.'};
//		1. 메소드 호출
		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);
	}
	
//	2. 메소드 호출됨
	static void printCharArray(char a[]) {
//		매개변수의 길이만큼 반복
//		3. 배열원소 출력
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}
	
//	공백을 쉼표로 바꾸는 메소드
	static void replaceSpace(char a[]) {
		for (int i = 0; i < a.length; i++) {
			if(a[i] == ' ') a[i] = ',';
		}
	}
}

