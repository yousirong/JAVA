package step02_type;

public class PrimitiveType {
 public static void main(String[] args) {
	//byte 1byte (-128~127)
	byte b1 = -128;
	//byte b2 = -129; 
	byte b3 =127;
	//2진수, 8진수, 10진수, 16진수 
	byte b4 =0b11;
	byte b5 = 011;
	byte b6 = 12;
	byte b7 =0x11;
	System.out.println(b1);
	System.out.println(b3);
	System.out.println(b4);
	System.out.println(b5);
	System.out.println(b6);
	System.out.println(b7);
	
	//char 2byte ( 0 ~ 65535) 유니코드를 지정하기 위한 타입
    char c1 ='A';//문자로 직접 저장
    char c2 = 65;// 10진수 저장
    char c3 ='\u0041'; //16진수 저장
    
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    
    char h1 ='가';
    char h2 = 44032;
    char h3 ='\uac00';
   
    System.out.println(h1);
    System.out.println(h2);
    System.out.println(h3);
    
    //short 2byte(-32768~ 32767) java에서는 거의 사용하지 않음
    //long 8byte (-2^63 ~ 2^63-1) 큰 숫자를 다룰 때 사용 
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
    
    float val7 = 5e4F;  //f,F를 뒤에 넣어 줘야함.
    double val8 = 5e-3;
    double val9 = 5e-4;
    
System.out.println(val7);
System.out.println(val8);
  System.out.println(val9);

    //boolean 1byte (true, false)
    //boolean
    
 }
}
