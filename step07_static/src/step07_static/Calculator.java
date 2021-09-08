package step07_static;

public class Calculator {
	public static int add(int num1, int num2) {
		return num1+num2;
		}
	public static int sub(int num1, int num2) {
			int result = num1 - num2;
			return result;
		}
	public static int mul(int num1, int num2) {
		int result = num1*num2;
		return result;
	}
	public static double div(int num1, int num2) {
		double result = num1/num2;
		return result;
	}
	public static int pow(int num1, int num2 ) {
		int pow1= 1;
		for(int i=0; i<=num2;i++)
		{
			pow1 = num1*num1;
		}
		return pow1;
	}
	public static int abs(int num1 ) { 
		if(num1>0)
		{
			return num1;
		}else {
			return (-1)*num1;
		}
	}
	public static int digitNumber(int num) {
		int result =1;
		while(num >0) {
			if(num/10 >0 ) 
				result++;
				num = num/10;
			}
			
			return result;
		}
		public static String toString(int num) {
			//return num+"";
			return String.valueOf(num);
		}
	
	public static int parseInt(String str) {
		int result =0;
		for(int idx =0; idx <str.length(); idx++)
		{
			result = result*10 + (str.charAt(idx)-'0');
		}
		return result;
		//return Integer.perseInt(str);
	}
	
}
