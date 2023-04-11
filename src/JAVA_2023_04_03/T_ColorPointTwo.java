package JAVA_2023_04_03;

class PointTwo{
	private int x, y;

	public PointTwo(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class T_ColorPointTwo extends PointTwo{
	String color;
	
	public T_ColorPointTwo(){
		this(0, 0);	// super?
	}
	public T_ColorPointTwo(int x, int y) {
		super(x, y);
		color = "BLACK";
	}
	public void setXY(int x, int y) {
		this.move(x, y);
	}
	public void setColor(String color) {
		this.color=color;
	}
	@Override
	public String toString() {
		return color + "색의 (" + getX() + ", " + getY() + ")의 점";
	}
	public static void main(String[] args) {
		T_ColorPointTwo zeroPoint = new T_ColorPointTwo();	// BLACK 색에 (0,0)위치
		System.out.println(zeroPoint.toString() + "입니다.");
		T_ColorPointTwo cp = new T_ColorPointTwo(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다");
	}
}
