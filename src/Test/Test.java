package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.text.SimpleDateFormat;

interface F1{
	int add(int x, int y);
}

interface F1_1<T>{
	T add(T x, T y);
}

class F3<T>{
	static int add(int x, int y) {
		return x + y;
	}
}



public class Test {
//	public static void main(String[] args) {
////		int n = 15, n2 = 16;
////		System.out.println(n % Math.sqrt(n));
////		System.out.println(n2 % Math.sqrt(n2));
//		
////		String txt2 = "power987*-;";
////		String result1 = txt2.replaceAll("[^a-z0-9]","0"); // 영문자와 숫자를 제외한 문자를 모두 0으로 치환
////		String result2 = txt2.replaceAll("[a-z0-9]","0");
////		System.out.println(result1); // power987000
////		System.out.println(result2); // 00000000*-;
//		
//		String str = "Hello Java Programming!";
//
//		String[] strToStrArray = str.split(" ");
//
//		for (int i=0; i < strToStrArray.length; i++)
//		    System.out.println("strToStrArray[" + i+ "]=" + strToStrArray[i]);
//	}
	
//	public static void main(String[] args) throws IOException {
//		
////		1) x + y를 계산하기 위해 ( Q. 10 + 13 = ?)
////		1-1)) interface F1 정의해 풀기
//		F1 f1 = (x, y) -> x + y;
//		System.out.println(f1.add(10, 13));
//		
//		System.out.println("----------------------------------");
//		
////		1-1-1)) interface F1_1이 제네릭 타입 변수 받을때
//		F1_1<Integer> f_1 = (x, y) -> x + y;
//		System.out.println(f_1.add(10, 13));
//		
//		System.out.println("----------------------------------");
//		
////		1-2)) Function 인터페이스 사용해 풀기
//		BiFunction<Integer, Integer, Integer> f2 = (x, y) -> x + y; 
//		System.out.println(f2.apply(10, 13));
//		
//		System.out.println("----------------------------------");
//		
////		1-3)) class F3 정의해 메소드 참조로 풀기
//		BiFunction<Integer, Integer, Integer> f3 = F3::add;
//		System.out.println(f3.apply(10, 13));
//		
//		System.out.println("----------------------------------");
//		
////		2) String[] arr1 = {"Java", "Library", "Stream"}, int[] arr2 = {10, 5, 2, 4, 7, 1, 3, 8, 6, 9};에 대해
////		2-1)) arr1을 list와 stream을 이용해서 'r'이 포함된 문자열들을 모두 대문자로 변환한 후 내림차순으로 정렬해 리스트로 출력하라
//		List<String> lst = Arrays.asList("Java", "Library" ,"Stream");
//		System.out.println("입력 데이터 = " + lst);
//		
//		List<String> result = lst.stream()
//				.filter(s -> s.contains("r"))
//				.map(s -> s.toUpperCase())
//				.sorted(Comparator.reverseOrder())
//				.collect(Collectors.toList());
//		
//		System.out.println("결과 = " + result);
//		System.out.println("원 데이터 = " + lst);
//		
//		System.out.println("----------------------------------");
//		
////		2-2)) arr2를 list와 stream을 이용해서 숫자들 중 홀수 값들을 2배한 값을 모두 합한 결과를 출력하라
////		2-2-1)) reduce 이용해서 합 구하기
//		List<Integer> lst2 = Arrays.asList(10, 5, 2, 4, 7, 1, 3, 8, 6, 9);
//		System.out.println("입력 데이터 = " + lst2);
//		
//		int sum = lst2.stream()
//				.filter(n -> n % 2 != 0)
//				.map(n -> n * 2)
//				.reduce(0, (x, y) -> x + y);
//		
//		System.out.println(sum);
//		
////		2-2-2)) sum 이용해서 합 구하기
//		int sum2 = lst2.stream()
//				.filter(n -> n % 2 != 0)
//				.map(n -> n * 2)
//				.mapToInt(n->n)
//				.sum();
//		
//		System.out.println(sum2);
//	}
	public static void main(String args[]) {
//	    List<Integer> list = new ArrayList<>();
//	    list.add(1);
//	    list.add(2);
//	    list.add(3);
//	    
//	    // 방법 1
//	    int[] arr1 = new int[list.size()];
//	    for (int i = 0 ; i < list.size() ; i++) 
//	        arr1[i] = list.get(i).intValue();
//	    
////	    // 방법 2
////	    int[] arr2 = list.stream()
////	                .mapToInt(i -> i)
////	                .toArray();
////	    
////	    // 방법 3
////	    int[] arr3 = list.stream()
////	                .mapToInt(Integer::intValue)
////	                .toArray();
////
////	    // 방법 4
////	    int[] arr4 = list.stream()
////	                .filter(i -> i != null)
////	                .mapToInt(i -> i)
////	                .toArray();
//	    
//	    System.out.println(Arrays.toString(arr1));
		
		
//		String str="this-string-=includes=delims";
//		StringTokenizer stk=new StringTokenizer(str,"-=",true);
//		System.out.println(str);
//		System.out.println();
//			
//		System.out.println("total tokens:"+stk.countTokens());
//		System.out.println("================tokens==================");
//		while(stk.hasMoreTokens()){
//			System.out.println(stk.nextToken());
//		}
//		System.out.println("total tokens:"+stk.countTokens());
		
		
		System.out.println(Math.round(66.6666 * 100) / 100.00);
		System.out.println(Math.round(66.6666 * 100) / 100.0);
		System.out.println(Math.round(66 * 100) / 100);
	}
}
	

