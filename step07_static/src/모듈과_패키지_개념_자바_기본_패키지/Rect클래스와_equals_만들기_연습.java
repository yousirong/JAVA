package 모듈과_패키지_개념_자바_기본_패키지;
/* int 타입의 width(너비)와 height(높이) 필드를 가지는 Rect클래스를 작성하고, 면적이
 * 같으면 두 Rect 객체가 같은 것으로 판별하는 equals()를 작성하라. 생성자에서 너비와 
 * 높이를 받아 width, height 필드를 초기화하라.
 * 
 */
class Rect { 
	int width;
	int height;
	public Rect (int width, int height) { 
		this.height = height;
		this.width = width;
	}
	public boolean equals(Object obj) {
		Rect p = (Rect)obj;
		if(width*height == p.width*p.height)
			return true;
		else
			return false;
	}
}
public class Rect클래스와_equals_만들기_연습 {

	public static void main(String[] args) {
		Rect a = new Rect(2,3);
		Rect b = new Rect(3,2);
		Rect c = new Rect(3,4);
		if(a.equals(b))
			System.out.println("a is equal to b");
		if(a.equals(c))
			System.out.println("a is equal to c");
		if(b.equals(c))
			System.out.println("b is equal to c");
		
	}
}
