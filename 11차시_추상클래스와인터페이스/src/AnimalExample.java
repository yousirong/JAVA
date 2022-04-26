abstract class Animal {
	public String kind;
	public void breath() {
		System.out.println("���� ���ϴ�.");
	}
	public abstract void sound();
}

class Cat extends Animal {
	public Cat() {
		this.kind = "������";
	}
	@Override
	public void sound() {
		System.out.println("�߿�");
	}
}
class Dog extends Animal {
	public Dog() {
		this.kind ="������";
	}
	@Override
	public void sound() {
		System.out.println("�۸�");
	}
		
}
class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("------");	
		
		//������ �ڵ� Ÿ�� ��ȯ
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("------");
		
		//�Ű������� �ڵ� Ÿ�� ��ȯ
		animalSound(new Dog());
		animalSound(new Cat());
		
		
		}
		public static void animalSound(Animal animal) {
			animal.sound();
	}

}
