package step08_overridingTest;

class Animalsound {
	String sound;
	String Any;
	
	Animalsound(String sound) {
		this.sound = sound;
	}
    void run() {
		System.out.println("동물울음소리");
		System.out.println(Any);
	}
	
}


class Dog extends Animalsound{
	Dog(String sound) {
		super(sound);
		Any = "멍멍";
	}
	void run() {
		System.out.println("______________");
		System.out.println(sound + " : "+ Any);
	}
}

class Cat extends Animalsound{
	Cat(String sound) {
		super(sound);
		Any = "야옹";
	}
	void run() {
		System.out.println("______________");
		System.out.println(sound + " : "+ Any);
	}
}

class Chicken extends Animalsound{
	Chicken(String sound) {
		super(sound);
		Any = "꼬꼬딹";
	}
	void run() {
		System.out.println("______________");
		System.out.println(sound + " : "+ Any);
	}
}
public class AnimalTest {

	public static void main(String[] args) {
		System.out.println("동물울음소리");
		Animalsound[] animals = new Animalsound[3];
		animals[0] = new Dog("강아지");
		animals[1] = new Cat("고양이");
		animals[2] = new Chicken("닭");

		for(Animalsound a1 : animals)
		{
			a1.run();
		}
	}

}
