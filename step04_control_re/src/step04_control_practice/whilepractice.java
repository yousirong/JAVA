package step04_control_practice;

public class whilepractice {

	public static void main(String[] args) {
		System.out.println("1. 1~100���� �� 3�� ��� �̸鼭 5�� ����ΰ��� ���");
		int num1 =3,num2 =5; 
		
		while(num1*num2 <100)
		{
			for(num1=3;num1<16;num1++)
			{
				for(num2=5;num2<15;num2++)
				{
					if(num1*num2 %15==0 &&num1*num2<100)
					{
					System.out.println(num1+"*"+num2+ "=" +num1*num2);
					}
					else
					{
						
					}
				}
			}
		}
		
		/*
		System.out.println("2.10���� �Ǻ���ġ ����");
		int k =0;
		int[] a;
		a = new int[10];
		int j=0;
		a[0]=0; a[1]=1; a[2]=2;
		while(k<10)
		{
			
			a[j+2] = a[j]+ a[j+1]; 
			a[j] = a[j+1];
			a[j+1]=a[j+2];
		    j++;		
			k++;
		}
		for(int i=0;i<=10;i++)
		{
			System.out.println(a[i]);
		}
		*/
		System.out.println("3.369��");

	  int g=1;
	   while(g<=100)
	   {
			   if(g%10==3 ||g%10==6||g%10==9)
			   {
				   System.out.print("¦ \t");
			   }
			   else if(g>=30&&g%30!=0&&g<40)
			   {
				   System.out.print("¦ \t");

			   }
			   else if(g>=60&&g%60!=0&&g<70)
			   {
				   System.out.print("¦ \t");

			   }
			   else if(g>=90&&g%90!=0&&g<100)
			   {
				   System.out.print("¦ \t");

			   }
			   
			   else{
			   System.out.print(g+"\t");
			   }
			   g++;
		   }
	   
	   
	   
	   
	   }

	}
	
	

