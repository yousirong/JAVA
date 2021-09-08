package step02_type_practice;

public class PrimitiveTypePractice {
	public static void main(String[] args) {
		
	
		byte b1 = -128;
		
		byte b3 =127;
		//2����, 8����, 10����, 16���� 
		byte b4 =0b11;
		byte b5 = 012;
		byte b6 = 13;
		byte b7 =0x12;
		System.out.println(b1);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		System.out.println(b6);
		System.out.println(b7);
		
		//char 2byte ( 0 ~ 65535) �����ڵ带 �����ϱ� ���� Ÿ��
	    char c1 ='A';//���ڷ� ���� ����
	    char c2 = 65;// 10���� ����
	    char c3 ='\u0041'; //16���� ����
	    
	    System.out.println(c1);
	    System.out.println(c2);
	    System.out.println(c3);
	    
	    char h1 ='B';
	    char h2 = 0x42;
	    char h3 ='\uaa00';
	   
	    System.out.println(h1);
	    System.out.println(h2);
	    System.out.println(h3);
	    
	    //short 2byte(-32768~ 32767) java������ ���� ������� ����
	    //long 8byte (-2^63 ~ 2^63-1) ū ���ڸ� �ٷ� �� ��� 
	    long val1 = 10 ;
	    long val2 = 10L;
	    //long val3 = 10000000000; // 10 ^10
	    long val4 = 100000000000L;
	    System.out.println(val1);
	    System.out.println(val2);
	    System.out.println(val4);
	    
	    //float (4byte) & double (8byte)
	    float val5=50000;
	    double val6 = 5e4;
	    System.out.println(val5);
	    System.out.println(val6);
	    
	    float val7 = 5e4F;  //f,F�� �ڿ� �־� �����.
	    double val8 = 4e-3;
	    double val9 = 4e-4;
	    
	  System.out.println(val7);
	 System.out.println(val8);
	  System.out.println(val9);
}
}