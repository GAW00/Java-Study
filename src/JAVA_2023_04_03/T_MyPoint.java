package JAVA_2023_04_03;

public class T_MyPoint {
	public int x, y;
	
	public T_MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point(" + x + ", " + y + ")";
	}
	
	public static void main(String[] args) {
		T_MyPoint p = new T_MyPoint(3, 50);
		T_MyPoint q = new T_MyPoint(4, 50);
		
		System.out.println(p);
		
//		equals 메소드로 객체 자체를 비교
//		문자열은 값을 비교
		if(p.equals(q)) System.out.println("같은 점");
		else System.out.println("다른 점");
	}
}
