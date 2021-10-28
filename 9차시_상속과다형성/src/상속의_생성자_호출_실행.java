class oint {
	private int x, y; // 한 점을 구성하는 x, y 좌표
	public oint() {
		this.x = this.y = 0;
	}
	public oint(int x, int y) {
		this.x = x; this.y = y;
	}
	public void showPoint() { // 점의 좌표 출력
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColPoint extends oint { 
	private String color; // 점의 색
	public ColPoint(int x, int y, String color) {
		super(x, y); // Point의 생성자 Point(x, y) 호출
		this.color = color;
	}
	public void showColorPoint() { // 컬러 점의 좌표 출력
		System.out.print(color);
		showPoint(); // Point 클래스의 showPoint() 호출
	}
}
public class 상속의_생성자_호출_실행 {
	public static void main(String[] args) {
		ColPoint cp = new ColPoint(5, 6, "blue");
		cp.showColorPoint();
	}
}