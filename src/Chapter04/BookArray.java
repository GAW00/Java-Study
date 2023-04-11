package Chapter04;

import java.util.Scanner;

class Book3{
	public String title;
	public String author;
	
	public Book3(String title, String author) {
		this.title = title;
		this.author = author;
	}
}

public class BookArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Book3[] book = new Book3[2]; // Book3를 참조하는 참조변수 2칸짜리 객체배열 book를 선언 및 생성 (book[0] ~ book[1])
		
		for(int i = 0; i < book.length; i++) {
			System.out.print("제목>> ");
			String title = sc.nextLine();
			System.out.print("작가>> ");
			String author = sc.nextLine();
			
			book[i] = new Book3(title, author);
		}
		for(int i = 0; i < book.length; i++) {
			System.out.println("(" + book[i].title + ", " + book[i].author + ")");
		}
		
		sc.close();
	}
}
