package Chapter03;

public class Ex3_5 {
	public static void main(String[] args) {
//		new int[5] : 배열 생성 크기
		int[] sales = new int[5];
		
//		배열원소를 다른 값으로 저장
		sales[0] = 52;
		sales[1] = 50;
		sales[2] = 55;
		sales[3] = 35;
		sales[4] = 38;
		
		int sum = 0;
		for(int i = 0; i < sales.length; i++) {
			sum += sales[i];
		}
		System.out.println(sum);
	}
}
