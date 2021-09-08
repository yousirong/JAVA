package step10_java10.review3;

public class Sparrow extends Animal implements AnimalFunc{
	public Sparrow(String name) {
		super(name);
		
	}
	public void run() {
		
		System.out.println(name +"는 하늘을 날 수 있습니다.");
	}
	public void sound() {
		System.out.println(name + ":  짺짺!");
	}
}
