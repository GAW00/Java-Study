package JAVA_2023_04_05;

import java.util.Scanner;

abstract class Calc2{
	public int a;
	public int b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public abstract void calc();
}

class Add2 extends Calc2{
	public void calc() {
		System.out.println(a + b);
	}
}

class Sub2 extends Calc2{
	public void calc() {
		System.out.println(a - b);
	}
}

class Mul2 extends Calc2{
	public void calc() {
		System.out.println(a * b);
	}
}

class Div2 extends Calc2{
	public void calc() {
		try {
			System.out.println(a / b);
		} catch (Exception e) {
			System.out.println("0으로는 나눌 수 없습니다.");
		}
	}
}

public class T_Calculator_Teacher {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>>");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.next();
		
		sc.close();
		
		Calc2 exp = null;
		
		switch(s) {
		case "+":
			exp = new Add2();
			break;
		case "-":
			exp = new Sub2();
			break;
		case "*":
			exp = new Mul2();
			break;
		case "/":
			exp = new Div2();
			break;
		default:
			System.out.println("잘못된 연산자 입니다.");
			break;
		}
		
		exp.setValue(a, b);
		if(exp instanceof Div2 && b == 0) {
			System.out.println("계산할 수 없습니다");
		}
		else {
			exp.calc();
		}
	}
}
