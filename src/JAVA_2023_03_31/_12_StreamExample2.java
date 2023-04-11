package JAVA_2023_03_31;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _12_StreamExample2 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java", "Stream", "Library");
		System.out.println("입력 데이터 = " + words);
		
//		List를 Stream으로 생성해서 연산한 후 다시 List로 받음
		List<Integer> result = words.stream()	// 스트림 생성
				.map(String::length)			// 메소드 참조로 문자열 길이 구함
				.collect(Collectors.toList());	// 결과 위해 List로 변환
		
		System.out.println("실행결과 = " + result);
	}
}
