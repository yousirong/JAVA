interface OperateCar {
  	void start();
	void stop();
	void setSpeed(int speed);
	void turn(int degree);
}
class AutoCar implements OperateCar {
			public void start() {
				System.out.println("�ڵ����� ����մϴ�.");
			}
  
			public void stop() {
				System.out.println("�ڵ����� �����մϴ�.");
			}
  
			public void setSpeed(int speed) {
				System.out.println("�ڵ����� �ӵ��� " + speed + "km/h�� �ٲߴϴ�.");
			}
  
			public void turn(int degree) {
				System.out.println("�ڵ����� ������ " + degree + "�� ��ŭ �ٲߴϴ�.");
			}
}


public class ���������ڵ������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperateCar obj = new AutoCar();
		obj.start();
		obj.setSpeed(30);
		obj.turn(15);
		obj.stop();
	}
}


