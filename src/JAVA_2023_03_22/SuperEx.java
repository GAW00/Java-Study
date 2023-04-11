package JAVA_2023_03_22;

/*
 * super()를 사용
 */

// 슈퍼클래스(상대적인것)
class Point2{
	private int x, y;
	
	public Point2() {
		this.x = this.y = 0;
	}
	public Point2(int x, int y) {
		this.x = x; this.y = y;
	}
	
	public void showPoint() {
		System.out.println("(" + x + ", " + y + ")");
	}
}

// 서브클래스(상대적인것)
class ColorPoint2 extends Point2{
	private String color;
	
	public ColorPoint2(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.println(color);
		showPoint();
	}
}

public class SuperEx {
	public static void main(String[] args) {
//		생성자를 통해 ColorPoint2 클래스 객체를 생성하기 위해 ColorPoint2클래스의 생성자를 호출
		ColorPoint2 cp = new ColorPoint2(5, 6, "blue");
//		ColorPoint2 클래스는 부모를 가지므로 부모 클래스의 생성자를 호출
//		이때 호출한 ColorPoint2 클래스의 생성자에 호출 할 부모 클래스의 생성자를 지정하지 않았으면
//		부모 클래스의 기본 생성자를 호출, 지정했다면 (ex> super(x, y))해당 형식에 맞는 생성자를 호출
//		ColorPoint2의 생성자에서 super(x, y)의 주석처리를 통해 알아보기
//		호출된 부모 클래스의 생성자가 실행되고 따라서 자식 클래스인 ColorPoint2 클래스의 생성자도 실행 됨
		cp.showColorPoint();
	}
}

