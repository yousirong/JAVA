package step07_static;

public class LibraryTest {

	public static void main(String[] args) {
		Library library = new Library();
		Book book1 = new Book("책1",1);
		library.addBook(book1);
		library.addBook(new Book("책2",2));
		library.addBook(new Book("책3",2));
		System.out.println(library);
		
		library.checkBookOut("책1");
		library.checkBookOut("책2");
		System.out.println(library);
		
	}
}
