package 객체지향프로그래밍6주차;
public class Circle {
	int radius;       // 원의 반지름 필드
	String name;   // 원의 이름 필드


public Circle()  {}

public double getArea() {
	return 3.14*radius*radius;
 }

	public static void main(String[] args) {
/* class 키워드로 선언 
 * 클래스는 {로 시작하여}로 닫으며 이곳에 모든 필드와 메소드 구현
 * 클래스의 접근 권한, public -> 다른 클래스들에서 Circle 클래스를 사용하거나 접근하 수 있음을 선언 
 * 
 * 필드와 메소드
 * - 필드(field) : 객체 내에 값을 저장하는 멤버 변수
 * - 메소드 (method) : 함수이며 객체의 행동(행위)를 구현
 * 
 * 필드의 접근 지정자, public
 * - 필드나 메소드 앞에 붙어 다른 클래스의 접근 허용을 표시
 * - public 접근 지정자 : 다른 모든 클래스의 접근 허용
 * 
 * 생성자
 * - 클래스의 이름과 동일한 특별한 메소드
 * - 객체가 생성될 때 자동으로 한 번 호출되는 메소드
 * 
 * 객체 생성
 * - 반드시 new 키워드를 이용하여 생성
 */
		Circle pizza;
		pizza = new Circle();     // Circle 객체 생성
		pizza.radius = 10;         // 피자의 반지름을 10으로 설정
		pizza.name = "자바피자";  // 피자의 이름 설정
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle donut = new Circle();     // Circle 객체 생성
		donut.radius = 2;         // 피자의 반지름을 10으로 설정
		donut.name = "자바도넛";  // 피자의 이름 설정
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
	}
}

