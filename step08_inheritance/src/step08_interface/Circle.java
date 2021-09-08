package step08_interface;

public class Circle implements Shape	{
	int radius;
	public final double PI = 3.14;
	public Circle ( int radius) {
		this.radius =radius;
	}
	public double getArea() {
		return(Math.round(PI * radius * radius*100)/100.00);
	}
	public String name() {
		String a = "원";
		return a;
	}
}
