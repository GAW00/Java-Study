package JAVA_2023_03_31;

// Ctrl + Shift + o : 사용하지 않는 import 요소들 정리
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _11_StreamExample1 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		System.out.println("입력 데이터 = " + numbers);
		
//		스트림 생성하고 바로 리스트로 변환
//		List<Integer> result = numbers.stream().collect(Collectors.toList());	// 그냥은 의미 X
		List<Integer> result = numbers.stream()
				.filter(n -> {return n % 2 == 0;})			// filter 메소드로 짝수만 추출
				.map(n -> {return (int)Math.pow(n, 2);})	// map 메소드로 전체 값을 계산
				.collect(Collectors.toList());				// 종말 단계
		System.out.println("실행 결과 = " + result);
	}
}
