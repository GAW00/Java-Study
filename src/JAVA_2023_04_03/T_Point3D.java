package JAVA_2023_04_03;

class PointThree{
	private int x, y;

	public PointThree(int x, int y) {this.x = x; this.y = y;}
	
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x, int y) {this.x = x; this.y = y;}
}

public class T_Point3D extends PointThree{
	private int z;
	
	public T_Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	public void moveUp() {z++;}
	public void moveDown() {z--;}
	protected void move(int x, int y, int z) {
		this.move(x, y);
		this.z = z;
	}
	@Override
	public String toString() {
		return "(" + this.getX() + ", " + this.getY() + ", " + z + ")의 점";
	}
	
	public static void main(String[] args) {
		T_Point3D p = new T_Point3D(1, 2, 3);	// 각각 x, y, z축 값
		System.out.println(p.toString() + "입니다.");
		
		p.moveUp();				// z축으로 위쪽 이동
		System.out.println(p.toString() + "입니다.");
		
		p.moveDown();			// z축으로 아래쪽 이동
		p.move(10, 10);		// x, y 축으로 이동
		System.out.println(p.toString() + "입니다.");
		
		p.move(100, 200, 300);	// x, y, z 축으로 이동
		System.out.println(p.toString() + "입니다.");
	}
}
