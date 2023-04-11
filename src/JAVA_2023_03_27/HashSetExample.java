package JAVA_2023_03_27;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class AA {
	
}

public class HashSetExample {
	public static void main(String[] args) {
//		Set 인터페이스 컬렉션 타입으로 HashSet 클래스 객체 생성
//		Set은 각자 다른 구슬이 든 주머니
		Set<String> set = new HashSet<String>();	// 업캐스팅 발생!
//		Set<Object> set = new HashSet<>();	// 업캐스팅 발생!
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");	// set컬렉션은 중복 객체를 추가하지 않는다
		set.add("iBatis");
		
//		Set<String> set = new HashSet<String>();으로 set 생성시에는 불가
//		타입파라미터를 Object로 변경해준다
//		AA a = new AA();
//		set.add(a);
		
		int size = set.size();
		System.out.println("총 객체수 : " + size);
		
//		set 컬렉션은 iterator 메소드 호출해서 Iterator 인터페이스 타입으로 갑을 받음
		Iterator<String> iterator = set.iterator();
//		Iterator<Object> iterator = set.iterator();
		while(iterator.hasNext()) {	// iterator 객체 값이 있으면
			String element = iterator.next();
//			String element = iterator.next().toString();
//			set 컬렉션은 순서가 없으므로 출력이 랜덤하다
			System.out.println("\t" + element);
		}
		
		System.out.println("---------------------");
		
		set.remove("JDBC");	// 객체 value가 "JDBC"인 객체 삭제
		size = set.size();
		
		
		for(String string : set) {	// foreach문으로 컬렉션에서 객체를 가져옴
			System.out.println("\t" + string);	// 삭제된 객체 제외하고 출력
		}
		
		System.out.println("총 객체수 : " + size);
		
		System.out.println("---------------------");
		
		if (set.isEmpty()) {  // 객체 하나라도 있는지
			System.out.println("비어 있음");
		}
		else {
			System.out.println("객체 있음");
		}
		
		System.out.println("---------------------");
		
		set.clear();
		if (set.isEmpty()) {  // 객체 하나라도 있는지
			System.out.println("비어 있음");
		}
		else {
			System.out.println("객체 있음");
		}
	}
}
