package JAVA_2023_03_20;

public class ValuePassing {
	public static void main(String[] args) {
		int n = 10;
		increase(n); //	n의 '값'만을 넘기는 것이지 n자체를 넘기는 것이 아님
		System.out.println("n = " + n);
	}

//	increase 메소드 : 매개변수를 받아서 1증가
	static void increase(int m) {
//		3. 매개변수 값 1 증가
		m += 1;
		System.out.println("m = " + m);
	}
}

