package step08_interface;



public class InterfaceExample {
	// 인터페이스는 다형성이 적용된다.
	// 재정의된 추상메서드를 구현한 메서드를 참조할 수 있다.

	public static void main(String[] args) {
		String[] Shape = new String[3];
		
		Rectangle rect = new Rectangle(10,2);
		Triangle tri = new Triangle (10 ,2);
		Circle cir = new Circle(3);
		Shape[0] =rect.name()+"'s Area =" + rect.getArea() ;
		Shape[1] =tri.name()+"'s Area ="+ tri.getArea();
		Shape[2] =cir.name()+"'s Area ="+ cir.getArea();
		System.out.println(Shape[0]);
		System.out.println(Shape[1]);
		System.out.println(Shape[2]);
		
		
	}

}
