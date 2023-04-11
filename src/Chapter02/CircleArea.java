package Chapter02;

public class CircleArea {
	public static void main(String[] args) {
		double pi = 3.14;
		double radius = 10;
		//원의 넓이 공식
//		double circleArea = Math.pow(radius,2) * pi; // Math.PI
		double circleArea = Math.pow(radius,2) * Math.PI; // Math.PI
		System.out.println("원 면적 : " + circleArea);
	}
}
