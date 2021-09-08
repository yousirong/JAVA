package step08_abstract;

public class AbstractExample {

	public static void main(String[] args) {
		Shape circle = new Circle(10);
		
		System.out.println("원의 넚이는 :"+ circle.getArea());
		System.out.println("도형의 위치는 :"+ circle.position());
	}

}
