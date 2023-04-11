package JAVA_2023_03_24;

class Point{
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class ObjectPropertyEx {
	public static void main(String[] args) {
		Point p = new Point(2, 3);
		print(p);	// Object obj = new Point(2, 3) -> 업캐스팅 발생!
	}
	
//	매개변수로 객체를 받음
	public static void print(Object obj) {
		System.out.println(obj.getClass().getName());	// JAVA_2023_03_24.Point 		  : 패키지.클래스
		System.out.println(obj.hashCode());				// 366712642			 		  : 객체의 서명(10진수 해시코드)
		System.out.println(obj.toString());				// JAVA_2023_03_24.Point@15db9742 : 패키지.클래스@16진수 해시코드
		System.out.println(obj);						// JAVA_2023_03_24.Point@15db9742 : toString() 생략된것
	}
}
