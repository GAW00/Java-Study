package JAVA_2023_03_27;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		// List 컬렉션에서 ArrayList 클래스로 객체 생성(제네릭 타입파라미터를 String)
		List<String> list = new ArrayList<String>();	// 업캐스팅 발생!
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");	// 2번 인덱스에 삽입되어서 2번이 밀려남 => 3 : "Servlet/JSP"
		list.add("Spring");
		
		
		int size = list.size();
		System.out.println("총 list 개수 : " + size);	// 총 리스트 개수 : 5
		
		System.out.println("--------------------------");
		
		String skill = list.get(2);
		System.out.println(skill);	// list 리스트의 2번째 인덱스 : "Database"
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		
		System.out.println("--------------------------");
		
		list.remove(2);	// list 리스트의 2번째 인덱스의 객체 삭제
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		
		System.out.println("--------------------------");
		
		list.remove("Spring");	// list 리스트의 "Sprint" value 값을 가지는 객체 삭제
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
	}
}
