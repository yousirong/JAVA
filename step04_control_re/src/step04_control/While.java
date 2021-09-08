package step04_control;
public class While {

	public static void main(String[] args) {
		// while ��
		
		int val1 =1;
		while (val1<= 10)
		{
			System.out.print(val1 + " ");
			val1++;
		}
		System.out.println();
		System.out.println("val1 ="+val1);
		
		
		//2�� ���
		int val2 =1;
		while (val2 <= 9)
		{
			System.out.println("2*"+val2+"="+2*val2);
			val2++;
		}
		
		//�ִ� ����� ���غ��� , �� ���� ���� �� �ִ� �� �� ���� ū ��
		System.out.println("�ִ� ����� ���ϱ�");
		
		int val3=10, val4 =6;
		int num =1, result =1;
		
		while(num <= val4)
		{
			if(val3 %num ==0 && val4 %num == 0)
			{
				result = num;
			}
			num++;
		}
		System.out.println(result);
		
	}

}
