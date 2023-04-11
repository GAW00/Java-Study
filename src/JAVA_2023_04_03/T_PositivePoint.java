package JAVA_2023_04_03;

class PointFour{
	private int x, y;

	public PointFour(int x, int y) {this.x = x; this.y = y;}
	
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x, int y) {this.x = x; this.y = y;}
}

public class T_PositivePoint extends PointFour{
	public T_PositivePoint() {super(0, 0);}
	public T_PositivePoint(int x, int y) {
		super(0, 0);
		if(x >= 0 && y >= 0) this.move(x, y);
	}
	@Override
	protected void move(int x, int y) {
		if(x >= 0 && y >= 0) super.move(x, y);
	}
	@Override
	public String toString() {
		return "(" + this.getX() + ", " + this.getY() +  ")의 점";
	}
	public static void main(String[] args) {
		T_PositivePoint p = new T_PositivePoint(); 
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");
		
		p.move(-5, 5); // 객체 p는 음수 공간으로 이동되지 않음
		System.out.println(p.toString() + "입니다.");
		T_PositivePoint p2 = new T_PositivePoint(-10, -10);
		System.out.println(p2.toString() + "입니다.");
	}
}
