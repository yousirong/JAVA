package step04_control;

public class For {

	public static void main(String[] args) {
		//For
		
		//1~10 ���� ���
		for(int i =1;i <=10;i++)
		{
			System.out.println(i + " ");
		}
		
		System.out.println();
		
		for(int i =10; i >=1; i--)
		{
			System.out.println(i+ " ");
		}
		
		System.out.println();
		
		int sum =0;
		 
		for(int i =1 ; i <= 10 ; i++)
		{
			sum = sum + i;
			
		}
		
		System.out.println("1~10�� ��"+ sum);
		
		int factorial = 1;
		
		for(int i =1; i<=10; i++)
		{
			factorial *=i;   //factorial = factorial *i;
		}
		
		System.out.println();

		System.out.println("1~10�� �� : "+factorial);
		
		
		//�� ����� �Ƕ�̵� ���
		
		System.out.println("�Ƕ�̵�");
		
		for(int s =1; s <=5;s ++)
		{
			for(int g =1; g <= s; g ++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("1.������");
		
		for(int i =1 ; i < 10 ; i++)
		{
			for (int j =1 ; j <10; j++)
			{
				System.out.println(i + "*"+ j+ "="+ i*j);
				
			}
			System.out.println("\t");
			
		}
		
		System.out.println("2.��ǥ���");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<i;j--)
				System.out.print("*");
		}
		System.out.println();
		
	}

}
