package 객체지향프로그래밍6주차;
/*this reference 
 * - 객체 자신에 대한 레퍼런스 
 * -> 컴파일러에 의해 자동 관리, 개발자는 사용하기만 하면됨 
 * this.멤버 형태로 멤버 사용
 * 
 * this의 필요성
 * - 객체의 멤버 변수와 메소드 변수의 이름이 같은 경우
 * - 다른 메소드 호출 시 객체 자신의 레퍼런스를 전달할 때
 * - 메소드가 객체 자신의 레퍼런스를 반환할 때
*/
public class Book1 {
	String title;
	String author;
	void show() { System.out.println(title + " " + author);}
	
	public Book1() {
		this("","");
		System.out.println("생성자 호출됨");
	}
	public Book1(String title) {
		this(title, "작자미상");
	}
	
	public Book1(String title, String author) {
		this.title = title; this.author = author;
	}
	public static void main(String[] args) {
		Book1 littlePrince = new Book1("어린완자", "생텍쥐페리");
		Book1 loveStory = new Book1("춘향전");
		Book1 emptyBook = new Book1();
		loveStory.show();
	}

}
