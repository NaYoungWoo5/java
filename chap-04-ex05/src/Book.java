
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
		this(title, "����");
	}

	public Book(String title, String auhor) {
		this.title = title;
		this.auhor = auhor;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book Prince = new Book("�", "������");
		Book love = new Book("��������");
		Book EBook = new Book();
		Prince.show();
		love.show();
		EBook.show();

	}

}
