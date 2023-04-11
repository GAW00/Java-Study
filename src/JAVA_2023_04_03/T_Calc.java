package JAVA_2023_04_03;

import java.util.Scanner;

abstract class Calculate{
	public int a;
	public int b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public abstract void calculate();
}

class Add extends Calculate{
	public void calculate() {
		System.out.println(a + b);
	}
}

class Sub extends Calculate{
	public void calculate() {
		System.out.println(a - b);
	}
}

class Mul extends Calculate{
	public void calculate() {
		System.out.println(a * b);
	}
}

class Div extends Calculate{
	public void calculate() {
		try {
			System.out.println(a / b);
		} catch (Exception e) {
			System.out.println("0으로는 나눌 수 없습니다.");
		}
	}
}

public class T_Calc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>>");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.next();
		
		sc.close();
		
		switch(s) {
		case "+":
			Add add = new Add();
			add.setValue(a, b);
			add.calculate();
			break;
		case "-":
			Sub sub = new Sub();
			sub.setValue(a, b);
			sub.calculate();
			break;
		case "*":
			Mul mul= new Mul();
			mul.setValue(a, b);
			mul.calculate();
			break;
		case "/":
			Div div = new Div();
			div.setValue(a, b);
			div.calculate();
			break;
		default:
			System.out.println("잘못된 연산자 입니다.");
			break;
		}
	}
}
