package step10_java10.review3;

public class Cow extends Animal implements AnimalFunc{
	public Cow(String name) {
		super(name);
		
	}
	public void run() {
		
		System.out.println(name +"는 뛸 수 있습니다.");
	}
	public void sound() {
		System.out.println(name + ":  음메!");
	}
}
