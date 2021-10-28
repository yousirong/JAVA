class oint {
	private int x, y; // �� ���� �����ϴ� x, y ��ǥ
	public oint() {
		this.x = this.y = 0;
	}
	public oint(int x, int y) {
		this.x = x; this.y = y;
	}
	public void showPoint() { // ���� ��ǥ ���
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColPoint extends oint { 
	private String color; // ���� ��
	public ColPoint(int x, int y, String color) {
		super(x, y); // Point�� ������ Point(x, y) ȣ��
		this.color = color;
	}
	public void showColorPoint() { // �÷� ���� ��ǥ ���
		System.out.print(color);
		showPoint(); // Point Ŭ������ showPoint() ȣ��
	}
}
public class �����_������_ȣ��_���� {
	public static void main(String[] args) {
		ColPoint cp = new ColPoint(5, 6, "blue");
		cp.showColorPoint();
	}
}