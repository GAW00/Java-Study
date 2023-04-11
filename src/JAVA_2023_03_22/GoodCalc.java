package JAVA_2023_03_22;

abstract class Calculator{
//	public int add(int a, int b) {return 1;}
//	public abstract int add(int a, int b) {return 1;} // 추상 메소드에는 body가 있으면 안됨
	public abstract int add(int a, int b); 		// 추상 메소드가 클래스 내에 존재하면 해당 클래스도 abstract 선언 해야함
	public abstract int subtract(int a, int b); // 추상 메소드 선언
	public abstract double average(int[] a); 	// 추상 메소드 선언
}

//Calculator 클래스로 부터 상속 받은 추상 메소드를 GoodCalc 클래스 내에서 구현(오버라이딩)하지 않았다면 abstract 선언 해야 함
//public abstract class GoodCalc extends Calculator{
public class GoodCalc extends Calculator{ // 추상 메소드를 오버라이딩 하면 abstract 선언 하지 않음
	public static void main(String[] args) {
//		new Calculator(); // 추상 클래스는 객체 생성을 할 수 없다
		GoodCalc c = new GoodCalc();
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.average(new int[] {2, 3, 4}));
	}
	
	@Override
	public int add(int a, int b) {
		return a + b;
	}
	
	@Override
	public int subtract(int a, int b) {
		return a - b;
	}
	
	@Override
	public double average(int[] a) {
		double sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum / a.length;
	}
}
