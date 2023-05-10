package JAVA_2023_04_20;

import java.util.HashMap;
import java.util.Scanner;

public class T_hashmap {
	public static void main(String[] args) {
		init();
		search_Word(set_Dic());
		
	}
	public static HashMap<String, String> set_Dic() {
		HashMap<String, String> dictionary = new HashMap<>();
		dictionary.put("사랑", "love");
		dictionary.put("아가", "baby");
		dictionary.put("돈", "money");
		dictionary.put("미래", "future");
		dictionary.put("희망", "hope");
		return dictionary;
	}
	public static void init() {
		System.out.println("한영 단어 검색 프로그램 입니다.");
	}
	public static void search_Word(HashMap dic) {
		while(true) {
			System.out.print("한글 단어? ");
			String word = set_Word();
			if(word.equals("그만")) break;
			String result = (String) dic.get(word);
			if(result != null) System.out.println(word + "은(는) " + result);
			else System.out.println(word + "은(는) 저의 사전에 없습니다.");
		}
	}
	public static String set_Word() {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		return word;
	}
}
