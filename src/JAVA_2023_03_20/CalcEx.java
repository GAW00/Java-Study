package JAVA_2023_03_20;

// default 접근 지정자
class Calc{
//	public static int abs(int a) {
//	public int abs(int a) {
//	private 접근 지정자는 같은 클래스 안에서만 접근 가능
//	private static int abs(int a) { // 오류
//	default 접근 지정자는 같은 패키지 안에서만 접근 가능
//	static int abs(int a) {
//	protected 접근 지정자는 같은 패키지안 or 다른 패키지여도 자식 클래스면 접근 가능
	protected static int abs(int a) {
		return a > 0 ? a : -a; // 절대값 반환
	}
	static int max(int a, int b) {
		return a > b ? a : b; // 큰 수 반환
	}
	static int min(int a, int b) {
		return a < b ? a : b; // 작은 수 반환
	}
}

//public 접근 지정자
public class CalcEx {
	public static void main(String[] args) {
//		abs : static 멤버로서 객체 생성 없이 접근 가능
//		non-static은 객체 생성해야 접근 가능
		System.out.println(Calc.abs(-5));
		System.out.println(Calc.max(10, 8));
		System.out.println(Calc.min(-3, -8));
	}
}

