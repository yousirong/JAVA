package 모듈과_패키지_개념_자바_기본_패키지;
/* String toString()
 * 		객체를 문자열로 반환
 * 		Object 클래스에 구현된 toString()이 반환하는 문자열
 * public String toString() {
 * 		return getClass().getName() +"@" + interger.toHexString(hashCode());
 * }
 * 
 * '객체 + 문자열' -> '객체.toString() + 문자열'로 자동변환
 * 		point p = new Point(2,3);					System.out.println(p.toString());
 * 		System.out.println(p);              ->      String s = p.toString() + "점";
 * 		String s = p + "점";    					답 : Point@15db9742점
 * 
 * 개발자는 자신만의 toString() 작성 필요
 * 		Object의 toString() 오버라이딩  		public String toString();
 * 
 */

// Point클래스에 Point 객체를 문자열로 리턴하는 toString() 메소드를 작성하라.
class Point {
	int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "Point(" + x + "," + y + ")";
	}
}
public class 객체를_문자열로_변환 {

	public static void main(String[] args) {
		Point p = new Point(2,3);
		System.out.println(p.toString()	);
		System.out.println(p);  // p는 p.toString()으로 자동 변환
		System.out.println(p + "입니다."); // p.toString() + "입니다"로 자동 변환
	}

}
