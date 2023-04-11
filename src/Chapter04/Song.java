package Chapter04;

public class Song {
	public String title;
	public String artist;
	public String country;
	public int year;

	public Song() {}
	public Song(String title, String artist, String country, int year) {
		this.title = title;
		this.artist = artist;
		this.country = country;
		this.year = year;
	}

	public void show() {
		System.out.printf("%d년 %s국적의 %s가 부른 %s\n", year, country, artist, title);
	}

	public static void main(String[] args) {
		Song s = new Song("Dancing Queen", "ABBA", "스웨덴", 1978);
		s.show();
	}
}
