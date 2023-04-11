package JAVA_2023_03_24;

public class AutoBoxingUnBoxingEx {
	public static void main(String[] args) {
		int n = 10;
//		n을 값으로 가지는 객체 생성(intObject : 참조변수)
		Integer intObject = Integer.valueOf(n);
		
//		auto boxing
		Integer intObject2 = n;
		
		System.out.println("intObject = " + intObject);		// 10
		System.out.println("intObject2 = " + intObject2);	// 10

//		unboxing
		int m = intObject.intValue() + intObject.intValue();
		System.out.println("m = " + m);
//		auto unboxing
		int m2 = intObject2 + intObject2;
		System.out.println("m2 = " + m2);
	}
}
