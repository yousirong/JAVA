class Rectangle implements Comparable {
	public int width = 0;
	public int height = 0;
  
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
  
	public Rectangle(int w, int h) {
		width = w;
		height = h;
		System.out.println(this);
	}
  
	public int getArea() {
		return width * height;
	}
 	@Override
	public int compareTo(Object other) {
		Rectangle otherRect = (Rectangle) other;
		if (this.getArea() < otherRect.getArea())
			return -1;
		else if (this.getArea() > otherRect.getArea())
			return 1;
		else
			return 0;
	}
}

public class �׸���̺��Լ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(100, 30);
		Rectangle r2 = new Rectangle(200, 10);
		int result = r1.compareTo(r2);
		if (result == 1)
			System.out.println(r1 + "�� �� Ů�ϴ�.");
		else if (result == 0)
			System.out.println("�����ϴ�");
		else
			System.out.println(r2 + "�� �� Ů�ϴ�.");
	}

}
