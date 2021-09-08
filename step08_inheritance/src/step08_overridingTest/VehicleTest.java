package step08_overridingTest;


class Vehicle{
	int speed;
	String owner;
	
	Vehicle(String owner){
		this.owner = owner;
	}
	void run() {
		System.out.println(speed);
	}
}

class Bike extends Vehicle{
	Bike(String owner) {
		super(owner);
		speed =5;
	}
	void run() {
		System.out.println(owner+"님의 자전거가 "+speed+"로 달립니다.");
	}
}

class Car extends Vehicle{
	Car(String owner) {
		super(owner);
		speed =10;
	}
	void run() {
		System.out.println(owner+"님의 자동차가 "+speed+"로 달립니다.");
	}
}

class Bus extends Vehicle{
	Bus(String owner) {
		super(owner);
		speed =20;
	}
	void run() {
		System.out.println(owner+"님의 버스가 "+speed+"로 달립니다.");
	}
}
public class VehicleTest {

	public static void main(String[] args) {
			
			
		Bike bike = new Bike("jane");
		bike.run();
		Car car = new Car("junyong");
		car.run();
		Bus bus = new Bus("junyongLee");
		bus.run();
		
		//부모타입 변수에서 자식 참조 가능.
		//사용할 수 있는 변수 , 메소드는 모두 부모 클래스에 한함.
		// 그렇지만 !!!!! 재정의된 메소드는 참조하고 있는 자식 메소드.
		
		System.out.println("_______________________________________");
		Vehicle vehicle = new Bike("Kim");
		vehicle.run();
		//vehicle.Bike 자식 멤버변수 , 메소드 사용 불가
		//재정의된 메소드만 실행.
		//vehicle.bRun();
		
		
		vehicle = new Car("Lee");
		vehicle.run();
		
		vehicle = new Bus("jung");
		vehicle.run();
		
		System.out.println("__________________________");
		Vehicle[] vehicles = new Vehicle[3];
		vehicles[0]= new Bike("kim");
		vehicles[1]= new Car("lee");
		vehicles[2]= new Bus("jung");
		
		for(Vehicle v1 : vehicles) {
			v1.run();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
