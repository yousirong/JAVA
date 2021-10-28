class Point1 {
	private int x, y; // �� ���� �����ϴ� x, y ��ǥ
	public void set(int x, int y) {
		this.x = x; this.y = y;
	}
	public void showPoint() { // ���� ��ǥ ���
		System.out.println("(" + x + "," + y + ")");
	}
}
// Point�� ��ӹ��� ColorPoint ����
class ColorPoint extends Point1 { 
	private String color; // ���� ��
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() { // �÷� ���� ��ǥ ���
		System.out.print(color);
		showPoint(); // Point Ŭ������ showPoint() ȣ�� 
	}
}

public class ����Ǽ��� {

	public static void main(String[] args) {
		
		Point1 p = new Point1(); // Point ��ü ����
		p.set(1, 2); // Point Ŭ������ set() ȣ��
		p.showPoint();

		ColorPoint cp = new ColorPoint(); // ColorPoint ��ü 
		cp.set(3, 4); // Point�� set() ȣ��
		cp.setColor("red"); // ColorPoint�� setColor() ȣ��
		cp.showColorPoint(); // �÷��� ��ǥ ���
	}

}
