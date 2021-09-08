package step07_static;

public class StaticVarExample {

	public static void main(String[] args) {
		Count c1 = new Count();
		c1.a++;
		c1.b++;
		System.out.printf("Non-Static a : "+ c1.a);
		System.out.printf("Static b : ", c1.b);
		
		Count c2 = new Count() ;
		c2.a++;
		c2.b++;
		System.out.printf("Non-Static a : "+ c2.a);
		System.out.printf("Static b : ", c2.b);
		
		Count.b++;
		System.out.printf("Non-Static b : "+ c1.b);
		System.out.printf("Static b : "+ c2.b);
		System.out.printf("Count b : ", Count.b);
	}

}
