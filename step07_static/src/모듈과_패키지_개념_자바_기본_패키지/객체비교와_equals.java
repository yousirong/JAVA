package 모듈과_패키지_개념_자바_기본_패키지;
// Point 클래스에 두 점의 좌표가 같으면 true를 리턴하는 equals()를 작성하라.
class Point3 {
	int x,y;
	public Point3 (int x, int y) {
		this.x = x;
		this.y = y;
	}
	public boolean equals(Object obj) {
		Point3 p = (Point3)obj;
		if(x == p.x && y == p.y) return true;
		else return false;
	}
}
public class 객체비교와_equals {

	public static void main(String[] args) {
		Point3 a = new Point3(2,3);
		Point3 b = new Point3(2,3);
		Point3 c = new Point3(3,4);
		
		if(a == b)  //false
			System.out.println("a==b");
		if(a.equals(b))  // true    얘 만 출력됨
			System.out.println("a is equals to b");
		if(a.equals(c))  // false
			System.out.println("a is equal to c");
	}

}
