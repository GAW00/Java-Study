package JAVA_2023_04_05;

interface Shape{
	final double PI = 3.14;
	
	void draw(); // 도형을 그리는 추상 메소드
	double getArea(); // 도형의 면적을 리턴하는 추상 메소드
	default public void redraw() { // 디폴트 메소드
		System.out.print("--- 다시 그립니다.");
		draw();
	}
}

class Circle implements Shape{
	public int radius;
	
	Circle(int r){radius = r;}
	
	@Override
	public void draw() {
		System.out.println("반지름이 " + radius + "인 원 입니다.");
	}
	@Override
	public double getArea() {
		return PI * Math.pow(radius, 2);
	}
}

public class T_Shapes {
	public static void main(String[] args) {
		Shape donut = new Circle(10);	//반지름이 10인 원 객체, 업캐스팅 발생!
		donut.redraw();
		System.out.println("면적은 " + donut.getArea());
	}
}
