package JAVA_2023_03_27;

public class BoxExample2 {
	public static void main(String[] args) {
//		Box2<String> new Box2<T>();
//		Box2<String> box1 = new Box2<String>();
		Box2<String> box1 = new Box2<>();	// 자바7부터 다이아몬드 파라미터<> 생략 가능 // Box2클래스의 타입파라미터 T가 String이 된다
		box1.set("Hello");
//		box1.set(777);						// 제네릭 컴파일 단계에서 타입 감지(String이 아님)
		String greet = box1.get();			// 캐스팅 없이 바로 받을 수 있다!
		System.out.println(greet);
		
		Box2<Integer> box2 = new Box2<Integer>();	// Box2클래스의 타입파라미터 T가 Integer가 된다
		box2.set(777);
		int value = box2.get();				// auto unboxing // Integer 객체 -> int 자료형 변수
		System.out.println(value);
		
	}
}
