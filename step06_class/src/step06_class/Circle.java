package step06_class;

public class Circle {
	final double pi =3.14; // 원주율 상수 선언
	double radius;
	double area;
	double circum;
	
	//생성자
	public Circle() {}
	public Circle(double radius)
	{
		this.radius = radius;
		area= getArea();
		circum =getCircum();
	}
	
	//
	double getArea() {
		double area = radius * radius * pi;
		return area;
		
	
	}
	
	double getCircum() {
		double circum =2 * radius * pi;
		return circum;
	}
	
	void print() {
		System.out.println(radius + ", "+area+", "+circum);
	}
}
