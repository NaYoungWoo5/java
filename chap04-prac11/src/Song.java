
public class Song {
	private String title;
	private String artist;
	private int year;
	private String country;

	public Song() {
	}

	public Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}

	public void show() {
		System.out.println(year + "년");
		System.out.println(country + "국적의");
		System.out.println(artist + "가 부른");
		System.out.println(title);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song myFavorite = new Song("Dancig Queen", "ABBA", 1978, "스웨던");
		myFavorite.show();
	}

}
