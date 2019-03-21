
public class Book {
	String title;
	String auhor;

	void show() {
		System.out.println(title + "" + auhor);
	}

	public Book() {
		this("", "");
	}

	public Book(String title) {
		this(title, "작자");
	}

	public Book(String title, String auhor) {
		this.title = title;
		this.auhor = auhor;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book Prince = new Book("어른", "나영우");
		Book love = new Book("나영웅전");
		Book EBook = new Book();
		Prince.show();
		love.show();
		EBook.show();

	}

}
