package JAVA_2023_03_24;

class Point3{
	private int x, y;

	public Point3(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
//	Object.equals(Object obj)메소드는 원래 오브젝트의 레퍼런스를 비교하는 메소드이다
//	만약 Point3클래스 안에서 오버라이딩을 하지 않는다면 main메소드에서 2, 3번째 if문의 출력은  둘 다 "a is not equal to c"가 된다
//	String.equals(String str)메소드 또한 이와 같은 경우다
//	Stirng클래스는 슈퍼클래스 Object클래스로 부터 equals메소드를 상속 받은 후 그대로 사용하는 것이 아니라 오버라이딩을 통해
//	문자열들의 주소가 아닌 값을 비교하는 메소드로 정의를 변경하여 사용하는 것이다
//	@Override
//	public boolean equals(Object obj) {
//		Point3 p = (Point3)obj;	 // 다운캐스팅 발생!
//		if(x == p.x && y == p.y) return true;
//		else return false;
//	}
}

public class EqualsEx {
	public static void main(String[] args) {
		Point3 a = new Point3(2, 3);
		Point3 b = new Point3(2, 3);
		Point3 c = new Point3(3, 4);
		
		if(a == b) System.out.println("a == b");
		else System.out.println("a != b");
		
		if(a.equals(b)) System.out.println("a is equal to b");  // Object obj = new Point3(2, 3) -> 업캐스팅 발생!
		else System.out.println("a is not equal to b");
		
		if(a.equals(c)) System.out.println("a is equal to c");  // Object obj = new Point3(3, 4) -> 업캐스팅 발생!
		else System.out.println("a is not equal to c");
	}
}
