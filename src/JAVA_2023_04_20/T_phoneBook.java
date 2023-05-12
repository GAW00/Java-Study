package JAVA_2023_04_20;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class T_phoneBook {
	public static void main(String[] args) {
		search_pNumber(set_pNumber(init()));
	}
	public static int init() {
		System.out.print("인원수>> ");
		return set_Int();
	}
	public static HashMap<String, String> set_pNumber(int n) {
		Map<String, String> pBook = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < n; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력)>> ");
			String name = set_Str(sc);
			String pnumber = set_Str(sc);
			pBook.put(name, pnumber);
		}
		System.out.println("저장되었습니다...");
		return (HashMap<String, String>) pBook;
	}
	public static void search_pNumber(HashMap pnum) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("검색할 이름>> ");
			String name = set_Str(sc);
			if(name.equals("그만")) { sc.close(); break; }
			String result = (String) pnum.get(name);
			if(result != null) System.out.println(name + " 의 번호는 " + result + "입니다.");
			else System.out.println(name + " 이(가) 없습니다.");
		}
	}
	public static int set_Int() {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		return i;
	}
	public static String set_Str(Scanner sc) {
		String str = sc.next();
		return str;
	}
}
