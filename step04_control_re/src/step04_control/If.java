package step04_control;
public class If {

	public static void main(String[] args) {
		//If 
		System.out.println("-------------------If------------------");
		int math = 95, english = 80;
		
		if (math > 90) 
		{
			System.out.println("���� ������ 90�� �̻��Դϴ�.");
		}
		if(english >90)
		{
			System.out.println("���� ������ 90�� �̻��Դϴ�.");
		}
		
	    System.out.println("----------------If - else--------------");
	    if (math >90)
	    {
	    	System.out.println("���� ������ 90�� �̻��Դϴ�.");
	    }
	    else
	    {
	    	System.out.println("���� ������ 90�� �̸��Դϴ�.");
	    }
		if(english > 90)
		{
	    	System.out.println("���� ������ 90�� �̻��Դϴ�.");
		}
		 else
		{
		    System.out.println("���� ������ 90�� �̸��Դϴ�.");
		}
		
		int val1 = 21;
		if (val1%2==0)
		{
			System.out.println(val1 + "�� ¦���Դϴ�.");
		}
		else {
			System.out.println(val1 + "�� Ȧ���Դϴ�.");
		}
		
		String jumin = "950313-1221251";
		if(jumin.charAt(7)==1)
		{
			System.out.println("����");
		}
		else
		{
			System.out.println("����");
		}
		
		
		System.out.println("------------If -else if------------");
		
		if(jumin.charAt(7)=='1')
		{
			System.out.println("����");
		}
		else if(jumin.charAt(7)=='2')
		{
			System.out.println("����");
		}
		else if(jumin.charAt(7)=='3')
		{
			System.out.println("����");
		}
		else
		{
			System.out.println("����");
		}
		
		int num = -3;
		
		if (num >0)
		{
			System.out.println(num+"���");
			
		}
		else if(num ==0)
		{
			System.out.println(num + "�� 0");
		}
		else
		{
			System.out.println(num + "�� ����");
		}	
		
		
		System.out.println("-----------��ø if --------------");
		 
		//20�� �߿��� �ʹ� (20 ~23) / �߹� (24~26) / �Ĺ� (27~29)
		
		int age =29;
		String range;
		
		if(age >= 20 && age <30	)
		{
			if(age <24)
			{
				range ="20�� �ʹ��Դϴ�.";
			}
			else if(age <27)
			{
				range = "20�� �߹��Դϴ�.";
			}
			else
			{
				range ="20�� �Ĺ��Դϴ�.";
			}
		}
		else {
			range = "20�밡 �ƴմϴ�.";
		}
		
		System.out.println(age + "��" +range);
		
		//20�� ~ 40��
		
		int c = 32;
		String range1;
		
		if(c<20)
		{
			range1 ="20�� �̸��Դϴ�.";
		}
		else if (c <30)
		{
			if(c <24)
			{
				range1 ="20�� �ʹ��Դϴ�.";
			}
			else if(c <27)
			{
				range1 = "20�� �߹��Դϴ�.";
			}
			else
			{
				range1 ="20�� �Ĺ��Դϴ�.";
			}
		}
		else if (c <40)
		{
			if(c <34)
			{
				range1 ="30�� �ʹ��Դϴ�.";
			}
			else if(c <37)
			{
				range1 = "30�� �߹��Դϴ�.";
			}
			else
			{
				range1 ="30�� �Ĺ��Դϴ�.";
			}
		}
		else
		{
			range1 ="40�� �̻��Դϴ�.";
		}
		
		System.out.println(c + "��" +range1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
