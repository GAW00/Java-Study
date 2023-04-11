package JAVA_2023_03_27;

// 대문자 알파벳 T를 타입파라미터로 받은 제네릭
public class Box2<T> {
	private T t;			// 타입파라미터(T)를 t의 타입으로 사용
	
	public T get() {		// 타입파라미터(T)를 메소드의 리턴타입으로 사용
		return t;
	}
	public void set(T t) {	// 타입파라미터(T)를 메소드의 매개변수 타입으로 사용
		this.t = t;
	}
}
