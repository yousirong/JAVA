package �������̵�;

class Weapon {
	protected int fire() {
		return 1; // ����� �⺻������ �� �� ���
	}
}
class Cannon extends Weapon {
	@Override
	protected int fire() { // �������̵�
		return 10; // ������ �� ���� 10���� ���
	}
}
public class Overriding {
	public static void main(String[] args) {
		Weapon weapon;
		weapon = new Weapon();
		System.out.println("�⺻ ������ ��� �ɷ��� " + 
										weapon.fire());
		weapon = new Cannon();
		System.out.println("������ ��� �ɷ��� " + 
										weapon.fire());
	}
}
