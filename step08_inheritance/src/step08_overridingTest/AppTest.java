package step08_overridingTest;

import java.util.Date;
import java.util.Scanner;

class Application{
	protected String name;
	int number;
	
	public void printAppName(String name) {
		this.name = name;
	}
	public void start() {
		System.out.println("-----실행할 앱----");
		System.out.println("1.  시계");
		System.out.println("2.  전화");
		System.out.println("3.  인터넷");
		System.out.println("4.  종료");
		System.out.print(">>");
	}
	void run() {
		System.out.println("실행할 앱");
		
		System.out.println(number);
	}
}

class Clock extends Application{
	Clock(String name) {
		number =1;
	}
	void run () {
		System.out.println("____________");
		System.out.println(number + ". "+ "시계");
		Date day =new Date();
		System.out.println(day);
		System.out.println(new Date());
	}
	
}

class Phone extends Application{
	Phone(String name) {
		number =2;
	}
	void run() {
		System.out.println("____________");
		System.out.println(number + ". "+ "전화");
		System.out.println("전화번호를 입력해주세요.");
	}
}
class Internet extends Application{
	Internet(String name) {
		number =3;
	}
	void run() {
		System.out.println("____________");
		System.out.println(number + ". "+ "인터넷");
		System.out.println("www.naver.com");
	}
}

public class AppTest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Application app =new Application();
		
		
			System.out.println("-----실행할 앱----");
			System.out.println("1.  시계");
			System.out.println("2.  전화");
			System.out.println("3.  인터넷");
			System.out.println("4.  종료");
			System.out.print(">>");
		
		int userInput = sc.nextInt();
		switch(userInput) {
		case 1:
			app =new Clock("1");
			
			break;
		case 2:
			app =new Phone("2");
			
			break;
		case 3:
			app =new Internet("3");
			
			break;
		default :
			System.out.println("앱을 종료합니다.");
			break;
		}
		app.run();
		app.start();
	}
	

}
