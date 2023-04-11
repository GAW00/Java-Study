package JAVA_2023_03_29;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T_ArrayListEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> names = new ArrayList<>();
		for(int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요>>");
			names.add(sc.next());
		}
		
		int longest = 0;
		for(int i = 0; i < names.size(); i++) {
			System.out.print(names.get(i) + " ");
			if(names.get(longest).length() < names.get(i).length()) {
				longest = i;
			}
		}
		System.out.println();
		System.out.println("가장 긴 이름은 : " + names.get(longest));
		
		sc.close();
	}
}

