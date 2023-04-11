package JAVA_2023_03_20;

/*
 * Point 클래스 : (x, y) 한점을 표현
 * Point 클래스를 상속받는 ColorPoint 클래스(색을 가진 점)
 */

// ColorPoint클래스의 슈퍼클래스(부모)
class Point{
	private int x, y;
	
	public void set(int x, int y) {
		this.x = x; this.y = y;
	}
	public void showPoint() {
		System.out.println("(" + x + ", " + y + ")");
	}
}

// Point클래스의 서브클래스(자식)
class ColorPoint extends Point{
	private String color;
	
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print(color);
//		상속받은 메소드 호출
		showPoint();
	}
}

public class ColorPointEx {
	public static void main(String[] args) {
		Point p = new Point(); // 객체를 생성, 멤버는 4개, 생성자 호출(default)
		p.set(1, 2);
		p.showPoint();
		
//		객체를 생성, 멤버는 7개, 생성자 호출(기본) : Point(슈퍼) -> ColorPpint(서브)
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4); // 상속받은 메소드 호출
		cp.setColor("red");
		cp.showColorPoint();
	}
}

