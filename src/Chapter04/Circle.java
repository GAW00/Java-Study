package Chapter04;

public class Circle {
	int radius; // 멤버변수(필드)
	String name;
	
	// 오버로딩
	public Circle() {}
	public Circle(int a) {}
	public Circle(int a, int c) {}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	public static void main(String[] args) {
//		pizza 참조변수 선언, Circle이 클래스
		Circle pizza;
		pizza = new Circle(); // 객체 생성
		pizza.radius = 10; // 멤버 변수 
		pizza.name = "자바피자"; // 멤버변수 값 세팅
		System.out.println(pizza.getArea());
		
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "자바도넛";
		double area = donut.getArea();
		System.out.println(donut.name + area);
	}
}
