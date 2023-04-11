package JAVA_2023_04_05;

interface Shape2{
	final double PI = 3.14;
	
	void draw(); // 도형을 그리는 추상 메소드
	double getArea(); // 도형의 면적을 리턴하는 추상 메소드
	default public void redraw() { // 디폴트 메소드
		System.out.print("--- 다시 그립니다.");
		draw();
	}
}

class Circle2 implements Shape2{
	public int radius;
	
	Circle2(int r){radius = r;}
	
	@Override
	public void draw() {
		System.out.println("반지름이 " + radius + "인 원 입니다.");
	}
	@Override
	public double getArea() {
		return PI * Math.pow(radius, 2);
	}
}

class Oval implements Shape2{
	public int width, height;
	
	Oval(int w, int h){width = w; height = h;}
	
	@Override
	public void draw() {
		System.out.println(width + " * " + height + "에 내접하는 타원입니다.");

	}
	@Override
	public double getArea() {
		return PI * width * height / 4;
	}
}

class Rect implements Shape2{
public int width, height;
	
	Rect(int w, int h){width = w; height = h;}
	
	@Override
	public void draw() {
		System.out.println(width + " * " + height + "크기의 사각형입니다.");
	}
	@Override
	public double getArea() {
		return width * height;
	}
}

public class T_Shapes2 {
	public static void main(String[] args) {
		Shape2 [] list = new Shape2[3]; // Shape 인터페이스 타입인 레퍼런스 배열
		list[0] = new Circle2(10); // 반지름이 10인 원 객체
		list[1] = new Oval(20, 30); // 20x30 사각형에 내접하는 타원
		list[2] = new Rect(10, 40); // 10x40 크기의 사각형
		for(int i=0; i<list.length; i++) list[i].redraw();
		for(int i=0; i<list.length; i++) System.out.println("면적은 " + list[i].getArea());
	}
}
