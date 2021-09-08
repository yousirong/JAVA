package step06_class;

public class Calculatortest {

	public static void main(String[] args) {
		Calculator c1= new Calculator();
		System.out.println(c1);
		System.out.println(c1.x+", "+c1.y);
		
		c1.x =1;
		c1.y =2 ;
		System.out.println(c1.x+", "+c1.y);
		
		Calculator c2 = new Calculator(3,4);
		System.out.println(c2.x+", "+c2.y);
		
		int sum1 = c2.add();
		System.out.println("(1) add() = "+ sum1);
		
		int sum2 = c2.add(10,20);	
		System.out.println("(2) add() = " + sum2);
		
		
		
	}

}
