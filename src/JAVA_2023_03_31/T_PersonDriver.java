package JAVA_2023_03_31;

import java.util.Scanner;

public class T_PersonDriver {
	public static void main(String[] args) {
		String fname;
		String lname;

		Scanner sc = new Scanner(System.in);
		System.out.print("성을 입력하세요 : ");
		lname = sc.next();
		System.out.print("이름을 입력하세요 : ");
		fname = sc.next();
		
		T_Person person1 = new T_Person();
		person1.firstName = fname;
		person1.lastName = lname;
		
		System.out.println("성은 : " + person1.getLastName());
		System.out.println("이름은 : " + person1.getFirstName());
		System.out.println("성명의 길이는 : " + person1.getLength());
		
		System.out.print("성을 입력하세요 : ");
		lname = sc.next();
		System.out.print("이름을 입력하세요 : ");
		fname = sc.next();
		
		T_Person person2 = new T_Person();
		person2.firstName = fname;
		person2.lastName = lname;
		
		System.out.println("성은 : " + person2.getLastName());
		System.out.println("이름은 : " + person2.getFirstName());
		System.out.println("성명의 길이는 : " + person2.getLength());
		
		sc.close();
	}
}
