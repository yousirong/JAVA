package step08_overridingTest;

import java.util.Scanner;

public class AnimalTest2 extends AnimalTest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Animalsound animal =new Animalsound ("");
		
		System.out.println("울음소리");
		System.out.println("1.  강아지");
		System.out.println("2.  고양이");
		System.out.println("3.  닭");
		System.out.print(">>");
		int userInput =sc.nextInt();
		switch(userInput) {
		case 1:
			animal = new Dog("강아지");
			animal.run();
		break;
		case 2:
			animal = new Cat("고양이");
			animal.run();
		break;
		default :
			animal = new Chicken("닭");
			animal.run();
		break;
		}
		
		sc.close();
	}

}
