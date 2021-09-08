package step08_interface;

public class Rectangle implements Shape {
	int width;
	int height;
	
	public Rectangle(int width, int height) {
		this.width =width;
		this.height = height;
	}
	public double getArea() {
		return width*height;
	}
	public String name() {
		String a = "사각형";
		return a;
	}
}
