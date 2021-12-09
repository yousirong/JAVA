package step04_control_practice;

public class Forpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("1.구구단");
		
		for(int i =1 ; i < 10 ; i++)
		{
			for (int j =1 ; j <10; j++)
			{
				System.out.print(i + "*"+ j+ "="+ i*j+"\t");
				
			}
			System.out.println();
			
		}
		
		System.out.println("2.*많은거에서 하나씩 줄어듦");
		
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("3.문자열을 거꿀로출력");
		
		String aaa = "abcdefg";
		int length = aaa.length()-1;
		for (int idx =length; idx >=0; idx--)
		{
			System.out.print(aaa.charAt(idx));
		}
	}
}