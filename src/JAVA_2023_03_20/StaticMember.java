package JAVA_2023_03_20;

import java.util.Scanner;

/*
 * static 사용(필드, 메소드)
 * 클래스 이름으로 static 멤버 접근
 * 환율을 입력 받아 100만원 이 몇 달러인지 구한다
 * 환율 -> 100달러 = ?원
 */

// 접근 지정자 : default
class CurrencyConverter{
//	자기 클래스 내에서마 접근 가능(객체 생성 없이)
//	멤버 변수는 일반적으로 private 많이 사용(보안)
//	jsp, spring 할때도 자주 사용
//	메소드를 사용해서 멤버 변수에 접근, 사용한다(직접적인 값 변경 막음 -> 보안↑)
//	getter(ex> getAbc : 값을 가져올 때), setter(ex> setAbc : 값을 저장할 때) 메소드 정의, 사용해서 멤버변수 사용
	private static double rate;
	
	public static void setRate(double rate) {
		CurrencyConverter.rate = rate;
	}
	public static double getRate() {
		return rate;
	}
	// ex) rate = 1300원 -> 1300원 / 환율 1300원 = 1달러
	public static double toDollar(double won) {
		return won / rate;
	}
	// ex) rate = 1300원 -> 1달러 * 환율 1300원 = 1300원
	public static double toKRW(double dollar) {
		return dollar * rate;
	}
}

public class StaticMember {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("환율(1달러)>>");
		double rate = sc.nextDouble();
		
		CurrencyConverter.setRate(rate);
		System.out.println("백만원은 $" + CurrencyConverter.toDollar(1000000) + "입니다.");
		System.out.println("100$는 " + CurrencyConverter.toKRW(100) + "원 입니다.");
		
		sc.close();
	}
}
