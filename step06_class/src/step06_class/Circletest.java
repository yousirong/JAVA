package step06_class;

public class Circletest {

	public static void main(String[] args) {
		Circle circle1 = new Circle();
		circle1.radius =3;
		Circle circle2 = new Circle (3);
		System.out.println("Circle2");
		System.out.println("radius"+ circle2.radius);
		System.out.println("area"+ circle2.area);
		System.out.println("circum"+ circle2.circum);
		circle2.print();
	}

}
