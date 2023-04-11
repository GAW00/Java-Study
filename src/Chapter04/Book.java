package Chapter04;

public class Book {
	String title;
	String author;
	
	public Book(String t, String a) {
		title = t;
		author = a;
	}
	public Book(String t) {
		title = t;
		author = "작자미상";
	}
	
	public static void main(String[] args) {
		Book book = new Book("어린왕자", "생텍쥐베리");
		Book book2 = new Book("춘향전");
		
		System.out.println(book.title + " " + book.author);
		System.out.println(book2.title + " " + book2.author);
	}
}
