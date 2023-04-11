package JAVA_2023_03_31;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class _15_MainTest2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();	// 업캐스팅 발생!
		
		for (int i = 1; i < 8; i++) {
			list.add(i);
		}
		System.out.println(list);
		
//		스트림 생성
		Stream<Integer> myStream = list.stream();
//		중간 연산이 filter or map
//		마지막 연산이 forEach
		myStream.filter(s -> (s >= 5)).forEach(n -> System.out.println(n));
		
//		Stream 개체 에서 터미널 작업이 호출될 때마다 인스턴스가 소비되고 닫힙니다.
//		따라서 Stream 을 사용하는 단일 작업만 수행할 수 있습니다 . 그렇지 않으면 Stream 이 이미 작업되었거나 닫혔다 는 예외가 발생합니다 .
//		간단히 말해서 솔루션은 필요할 때마다 새로운 스트림을 생성하는 것으로 구성됩니다. supplier이용하는게 좋긴 함
		Stream<Integer> myStream2 = list.stream();
		myStream2.filter(s -> (s >= 5)).forEach(System.out::println);
//		스트림 연산하더라도 list 원 데이트는 변하지 않음
		System.out.println(list);
	}
}
