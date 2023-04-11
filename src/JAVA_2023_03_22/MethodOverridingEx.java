package JAVA_2023_03_22;

class Shape{
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape{
//	메소드 오버라이딩
	@Override // @ = 어노테이션(시스템 주석)
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape{
	// @Override 없어도 가능(자바는)
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}

public class MethodOverridingEx {
	static void paint(Shape p) {
//		업캐스팅에 의해서 슈퍼클래스의 draw()메소드로 갔다가 오버라이딩이 되어서 Line으로 간다
		p.draw();
	}
	
	public static void main(String[] args) {
		Line line = new Line();
		paint(line); 		 // Shape p = new Line(); 업캐스팅 발생!
		paint(new Shape());  // Shape p = new Shape();
		paint(new Line()); 	 // Shape p = new Line(); 업캐스팅 발생!
		paint(new Rect());	 // Shape p = new Rect(); 업캐스팅 발생!
		paint(new Circle()); // Shape p = new Circle(); 업캐스팅 발생!
	}
}
