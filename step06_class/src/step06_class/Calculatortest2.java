package step06_class;

public class Calculatortest2 {

	public static void main(String[] args) {
		Calculator c1 = new Calculator(10,2);
		int cal1 = c1.add();
		int cal2 = c1.sub();
		int cal3 = c1 .mul();
		int cal4 = c1.div();
		System.out.println("add() : "+cal1);
		System.out.println("sub() : "+cal2);
		System.out.println("mul() : "+cal3);
		System.out.println("div()  : "+cal4);
		
		int[] nums =new int[] {1,2,3,4,5};
		Calculator c2 = new Calculator();
		int cal5 = c2.min(5, 2);
		int cal6 = c2.max(5, 2);
		int cal7 = c2.pow(5, 2);
		int cal8 = c2.abs(-50, 2);
		int cal9 = c2.min(nums);
		int cal10 = c2.max(nums);
		System.out.println("min(5,2) : "+cal5);
		System.out.println("max(5,2) : "+cal6);
		System.out.println("pow(5^2) : "+cal7);
		System.out.println("abs(-50*2)  : "+cal8);
		System.out.println("min[] ()  : "+cal9);
		System.out.println("max[] ()  : "+cal10);
		
		System.out.println(Math.pow(19, 2));
	}

}
