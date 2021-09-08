package step07_static;

public class Library {
	//멤버 변수: 책 배열
	private static int totalBook; //책수량
	private Book[] books = new Book[100];
	
	//생성자
	public Library() {}
	public Library(Book[] books)
	{
		this.books = books;
		totalBook = books.length;
	}
	
	
	//메소드 =getter, setter     오른쪽 클릭-> sourse -> generate getters and setters
	public static int getTotalbook() {
		return totalBook;
	}
	
	public static void setTotalbook(int totalBook) {
		Library.totalBook = totalBook;
	}
	
	public Book[] getBooks() {
		return books;
	}
	public void setBooks(Book[] books) {
		this.books = books;
	}
	
	public String toString() {
		String str =" === 책정보 ==="+"\n";
		for(int idx=0; idx<totalBook; idx ++)
		{
			str +=books[idx].toString()+"\n";
		}
		return str;
	}
	
	public void addBook(Book book) {
		books[totalBook] =book;
		totalBook++;
	}
	
	public void checkBookOut(String title) {
		for(int idx =0; idx < totalBook; idx++) {
			if(books[idx].getTitle().equals(title)) { //스트링을 반환함
				int oldAmount = books[idx].getAmount();
				if(oldAmount != 0)
					books[idx].setAmount(oldAmount-1);
				break;
			}
		}
	}
	
	public void checkBookout(int bookNumber) 
	{
		for(int idx =0; idx < totalBook; idx++) {
			if(books[idx].getBookNumber() ==bookNumber) { //스트링을 반환함
				int oldAmount = books[idx].getAmount();
				if(oldAmount != 0)
					books[idx].setAmount(oldAmount-1);
				break;
			}
		}
	}
	
	public void returnBook(String title)
	{
		for(int idx =0; idx < totalBook; idx++) {
			if(books[idx].getTitle().equals(title)) { //스트링을 반환함
				int oldAmount = books[idx].getAmount();
				if(oldAmount != 0)
					books[idx].setAmount(oldAmount-1);
				break;
			}
		}
	}
	public void deleteBook(String title)    //배열에 있는 책 삭제.
	{
		int loc = -1;  //찾는 bookl의 index위치
		for(int idx =0; idx < totalBook; idx++) {
			if(books[idx].getTitle().equals(title)) { //스트링을 반환함
				loc= idx;  //북의 인덱스 loc에 저장
				
			}
		}
		if(loc !=-1) {
			for(int idx =loc ; idx < totalBook -1 ; idx ++) {
				books[idx] = books[idx+1];  //그 다음 book의 객체를 앞으로 하나식 가져옴
			}
		}
		totalBook--; //전체 book의 갯수 1 감소
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
