package Chapter02;

public class LongOperationExample {
	public static void main(String[] args) {
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000;
		
		int result = (int) (value1 + value2 + value3); // 가장 큰 타입인 long 타입이 default -> int로 변환
		System.out.println(result);
	}
}
