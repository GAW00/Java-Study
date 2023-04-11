package Chapter04;

public class Book2 {
	String title;
	String author;
	
	public Book2(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public Book2(String title) {
		this(title, "작자미상");
	}
	public Book2() {
		this("", ""); // 첫 라인에 안 오면 오류 발생
		System.out.println("생성자 호출됨");
	}
	
	void show() {
		System.out.println(title + " " + author);
	}
	
	public static void main(String[] args) {
		Book2 book = new Book2("어린왕자", "생텍쥐베리");
		Book2 book2 = new Book2("춘향전");
		Book2 book3 = new Book2();
		book.show();
		book2.show();
		book3.show();
	}
	
}
