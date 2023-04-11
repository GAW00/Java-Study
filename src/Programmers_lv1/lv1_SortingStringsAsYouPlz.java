package Programmers_lv1;

import java.util.*;

public class lv1_SortingStringsAsYouPlz {
	public static void main(String[] args) {
//		String[] strings = {"sun", "bed", "car"};
		String[] strings = {"sunglasses", "bedtime", "carracer", "batmansuperman"};
		int n = 4;
		
		System.out.println(Arrays.toString(solution(strings, n)));
	}
	
	public static String[] solution(String[] strings, int n) {
		String[] answer = {};
		List<String> lst = new ArrayList<>();
		for (int i = 0; i < strings.length; i++) {
			lst.add(strings[i].charAt(n) + strings[i]);
		}
		Collections.sort(lst);
		answer = new String[lst.size()];
		for (int i = 0; i < lst.size(); i++) {
			answer[i] = lst.get(i).substring(1);
		}
		return answer;
    }
}
