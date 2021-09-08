package step04_control;

public class BreakContinue {

	public static void main(String[] args) {
		//break;  <--- loop Ż�� switch,for, while, do - while
		
		int val1 =1 , sum =0;
		while(true)
		{
			
			if(val1 >10)
			{
				break;
			}
			sum = sum + val1; // sum +=val1
		    val1++;
		}
		System.out.println("1. 1~10 ���K�� : " + sum);
		
		
		
		
		//for - �ּ� �����
		int num1 =3, num2 = 7 , result = 0;
		 
		for(int val2 =1; ;val2++) {
			result = num1 * val2;
			if(result % num2 ==0) {
				break;
			}
			System.out.println("2. 3,7�� �ּҰ����: "+result);
		}
		
		// Label �ݺ��� ,  ���
		Loop1 : {
			int val3=0;
			do {
				if(val3==5)
					break Loop1;
				val3++;  
				
			}while(val3 <10);
			System.out.println("in Loop1");
		}
		System.out.println("out Loop1");
		
		
		// Label �ݺ���
		System.out.println("3. (for: Loop), 5�̸� ���");
		Loop2 : for(int j =0; j<10 ; j++)
		{
			if(j==5)
				break Loop2;
			System.out.println(j+" ");
			
		}
		
		System.out.println();	
		
		//continue - ��� ����
		//1 ~10�� ¦���� ���ϱ�
		
		int sum4 =0;
		for(int val4=0; val4<=10; val4++)
		{
			if(val4 % 2 ==1) // Ȧ����
				
				continue;
			sum4+=val4;
		}
		
		System.out.println("4. ¦���� ��: "+sum4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
