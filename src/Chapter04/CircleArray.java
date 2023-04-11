package Chapter04;

class Circle3{
//	Circle3 클래스의 필드
	public int radius;
	
//	Circle3 클래스의 생성자
	public Circle3(int radius) {
		this.radius = radius;
	}

//	Circle3 클래스의 메소드
	public double getArea() {
		return 3.14 * radius * radius;
	}
}

public class CircleArray {
	public static void main(String[] args) {
		Circle3[] c = new Circle3[5]; // Circle3를 참조하는 참조변수 5칸짜리 객체배열 c를 선언 및 생성 (c[0] ~ c[4])
		
		for(int i = 0; i < c.length; i++) {
//			i = 0 : 객체생성 -> 생성자 호출 -> 멤버 저장(메소드 호출 -> 원 면적 구함)
//			...
//			i = 4 : ~
			c[i] = new Circle3(i); // 객체 생성 (c[0] ~ c[4] 참조변수가 객체를 가리킴)
		}
		
		for(int i = 0; i< c.length; i++) {
//			5개 객체의 각각의 메소드 호출을 통해 5가지 원의 넓이를 구함
			System.out.println((int)c[i].getArea());
		}
		
	}
}
