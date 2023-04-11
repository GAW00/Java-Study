package JAVA_2023_03_27;

import java.util.ArrayList;

public class ArrayListExample2 {
	public static void main(String[] args) {
//	ArrayList 클래스 타입으로 ArrayList 클래스로 객체 생성(제네릭 타입파라미터를 String)
		ArrayList<String> arr = new ArrayList<String>();
		boolean aaa = arr.add("oracle");
		System.out.println(aaa);
		boolean bbb = arr.add("mysql");
		System.out.println(bbb);
		boolean ccc = arr.add("oracle");	// 중복된 객체를 추가해도 문제 없음
		System.out.println(ccc);
		
		System.out.println("----------------------");
		
		for (int i = 0; i < arr.size(); i++) {
			String str = arr.get(i);
			System.out.println(i + " : " + str);
		}
	}
}
