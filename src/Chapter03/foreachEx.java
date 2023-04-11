package Chapter03;

/*
 * 열거형 이용(+values() 메소드 이용)
 * foreach 이용
 */

public class foreachEx {
	public enum Week{월, 화, 수, 목, 금, 토, 일};
	
	public static void main(String[] args) {
		int[] n = {1, 2, 3, 4, 5};
		String names[] = {"사과", "배", "바나나", "체리", "딸기", "포도"};
		int sum = 0;
		
//		int 타입 배열 n 의 원소를 k로 하나씩 받는다
		for(int k : n) {
			System.out.print(k + " ");
			sum += k;
		}
		System.out.println("합은 " + sum);
		
		for(String str : names) {
			System.out.print(str + " ");
		}
		System.out.println();
		
//		Week 타입 값을 day로 하나씩 받는다.
		for(Week day : Week.values()) {
//			String 타입으로 받을 수 없음
			Week str = day;
//			System.out.print(day + "요일 ");
			System.out.print(str + "요일 ");
		}
	}
}
