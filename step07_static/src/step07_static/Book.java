package step07_static;

public class Book {
	private static int number = 1111;
	private String title;
	private int bookNumber;
	private int amount;

	public Book() {
	}

	public Book(String title, int amount) {
		this.title = title;
		this.amount = amount;
		this.bookNumber = number++;
	}

	public static int getNumber() {
		return number;
	}

	public static void setNumber(int number) {
		Book.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "title=" + title + ", bookNumber=" + bookNumber + ", amount=" + amount;
	}
}
