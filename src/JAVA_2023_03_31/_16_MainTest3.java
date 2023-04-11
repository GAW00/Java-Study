package JAVA_2023_03_31;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class _16_MainTest3 {
	public static void main(String[] args) {
		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		System.out.println(sList);
		
		Stream<String> stream = sList.stream();
		
//		어떤 요소 가지고 있나 확인
		stream.forEach(s->System.out.print(s + " "));
		System.out.println("\n------------------------");
		
//		정렬하는 기능(오름차순) --> sorted()
		sList.stream().sorted().forEach(s->System.out.print(s + " "));
		System.out.println("\n------------------------");
		
//		데이터를 변형 할 때 사용하는 map --> 길이로 변경!
		sList.stream().map(s->s.length()).forEach(n->System.out.print(n + " "));
		System.out.println("\n------------------------");
		
//		이름의 길이가 5글자 이상인 경우
		sList.stream().filter(s->s.length() >= 5).forEach(n->System.out.print(n + " "));
		System.out.println("\n------------------------");
	}
}
