package step02_type;



public class TypeCasting {

	public static void main(String[] args) {
      
		//�ڵ� ����ȯ
		byte val1 =10;
		int val2 = val1;       // int���� 4byte �̰� byte���� 1byte �̹Ƿ�  �����ص� �������.
		System.out.println(val2);
		
		
		char val3= 'a';
		int val4 =val3;
		System.out.println(val4);
		
		int val5 =500;
		long val6 = val5;
		System.out.println(val6);
		
		int val7= 500;
		long val8 =val7;
		System.out.println(val8);
				
		
		//���� ����ȯ
		int val9= 10;
		byte val10 = (byte)val9;
		System.out.println(val10);
		
		int val11 =1019415315;
		byte val12= (byte)val11;
		System.out.println(val12);
		
		long val13 =300;
		int val14 =(byte)val13;
		System.out.println(val14);
		
		int val15= 'A';
		char val16 = (char)val15;
		System.out.println(val16);
		
		double val17= 3.14;   //�Ҽ����� ����� �ڵ����� double������ �ν���.
		int val18 = (int)val17;
		System.out.println(val18);
		
		int val19 = 128;
		
		if(val19 >= Byte.MIN_VALUE && val19 <= Byte.MAX_VALUE) 
		{
			System.out.println((byte)val19);
		}
		else 
		{
			System.out.println("��ȯ�Ұ�");
		}
		
		if(val19 < Byte.MIN_VALUE || val19 > Byte.MAX_VALUE)
		{
			System.out.println("��ȯ�Ұ�");
		}
		else
		{
			byte val20= (byte)val19;
			System.out.println(val20);
					
		}
		
		long val21 =10000000000L;  // 0  10��
		if(val21 >= Integer.MIN_VALUE && val21 <= Integer.MAX_VALUE)
		{
			System.out.println((byte)val21);
		}
		else	
		{
			System.out.println("��ȯ�Ұ�");
		}
		
		if(val21 < Integer.MIN_VALUE || val21 > Integer.MAX_VALUE)
		{
			System.out.println("��ȯ�Ұ�");
		}
		else	
		{
			byte val22= (byte)val21;
			System.out.println(val22);
		}
	
		
		int val23=10;
		double val24 =5.5;
		double val25 =val23 + val24;
		System.out.println(val25);
		
		int val26 = val23 + (int)val24;
		System.out.println(val26);
		
		char val27 = 'A';
		int val28 = val27 +1;
		System.out.println(val28);
		System.out.println((char)val28);

	}
	}
