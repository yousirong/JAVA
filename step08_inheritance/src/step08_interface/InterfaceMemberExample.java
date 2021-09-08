package step08_interface;

public class InterfaceMemberExample implements ISomething{
	
	public void run() {   //재정의 해주어야 함.
		//my_int = 33;  // Error  -  ISomething 인터페이스의 final 변수임.
		System.out.println("run() :" + ISomething.A);
	}
	public static void main(String[] args) {
		System.out.println(ISomething.my_int);
		System.out.println(InterfaceMemberExample.my_int);
		ISomething is = new InterfaceMemberExample();
		is.run();
		InterfaceMemberExample im = new InterfaceMemberExample();
		im.run();
	}

}
