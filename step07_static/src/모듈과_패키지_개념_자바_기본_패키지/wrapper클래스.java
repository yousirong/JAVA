package 모듈과_패키지_개념_자바_기본_패키지;
/* wrapper 클래스
 * 이름이 Wrapper인 클래스는 존재하지 않음
 * 용도
 * 		기본 타입의 값을 객체로 다룰 수 있게함.
 * 		객체 또는 클래스가 제공하는 메소드 사용
 * 		클래스가 제공하는 상수 사용(MIN_VALUE and MAX_VALUE)
 * 		숫자, 문자로의 형 변환 또는 진법 변환시 사용
 */

/* wrapper 객체 생성
 * 기본 타입의 값으로 wrapper 객체 생성
 * 		정적 메소드인 valueOf()를 호출하여 생성
 * Integer i = Integer.valueOf(10);
 * Character c = Character.valueOf('c');
 * Double f = Double.valueOf(3.14);
 * Boolean b = Boolean.valueOf(true);
 * 
 * 문자열로 wrapper 객체 생성
 * Integer l = Integer.valueOf("10");
 * Double d = Double.valueOf("3.14");
 * Boolean b = Boolean.valueOf("false");
 * 
 * Float 객체는 double 타입의 값으로 생성 가능
 * Float f = Float.valueOf((double) 3.14);
 */

/* 주요 메소드 Wrapper 객체들은 거의 유사, 많은 메소드가 static 타입 
 * Integer 클래스의 주요 메소드
 * 			메소드								설명
 * static int bitCount(int i)				정수 i의 이진수 표현에서 1의 개수 리턴
 * float floatValue()						float 타입으로 값 리턴
 * int intValue()							int 타입으로 값 리턴
 * long longValue()							long 타입으로 값 리턴
 * short shortValue()                      short 타입으로 값 리턴
 * static int parseInt(String s)			문자열 s를 10진 정수로 변환한 값 리턴
 * static int parseInt(String s, int radix) 문자열 s를 지정된 진법의 정수로 변환한 값 리턴
 * static String to BinaryString(int i)		정수 i를 이진수 표현으로 변환한 문자열 리턴
 * static String toHexString(int i)			정수 i를 16진수 표현으로 변환한 문자열 리턴
 * static String toOctalString(int i)		정수 i를 8진수 표현으로 변환한 문자열 리턴
 * static String toString(int i)				정수 i를 문자열로 변환하여 리턴
 * static Integer valueOf(int i)			정수 i를 담은 Integer 객체 리턴
 * static Integer vlaueOf(String s)		문자열 s를 정수로 변환하여 담고 잇는 Integer 객체 리턴
 * 
 * Wrapper 객체로부터 기본 타입 값 알아내기
 * Integer i = Integer.valueOf(10);				Double f = Double.valueOf(3.14);
 * int ii = i.intValue(); 						double dd = d.doubleValue();
 * 
 * Character c = Character.valueOf('c');		Boolean b = Boolean.valueOf(true);
 * char cc = c.charValue();					boolean bb = b.booleanValue(); 
 * 
 * 문자열을 기본 데이터 타입으로 변환
 * int i = Integer.parseInt("123");	   // i =123
 * boolean b = Boolean.parseBoolean("true");  // b= true
 * double f = Double.parseDouble("3.14);     // d = 3.14
 * 
 */
public class wrapper클래스 {

	public static void main(String[] args) {
			
				System.out.println(Character.toLowerCase('A')); // 'A'를 소문자로 변환
				char c1='4', c2='F';
				if(Character.isDigit(c1)) // 문자 c1이 숫자이면 true
					System.out.println(c1 + "는 숫자");
				if(Character.isAlphabetic(c2)) // 문자 c2가 영문자이면 true
					System.out.println(c2 + "는 영문자");

				System.out.println(Integer.parseInt("-123")); // "-123"을 10진수로 변환
				System.out.println(Integer.toHexString(28)); // 정수 28을 2진수 문자열로 변환
				System.out.println(Integer.toBinaryString(28)); // 28을 16진수 문자열로 변환
				System.out.println(Integer.bitCount(28)); // 28에 대한 2진수의 1의 개수

				Double d = Double.valueOf(3.14);
				System.out.println(d.toString()); // Double을 문자열 "3.14"로 변환
				System.out.println(Double.parseDouble("3.14")); // 문자열을 실수 3.14로 변환

				boolean b = (4>3); // b는 true
				System.out.println(Boolean.toString(b)); // true를 문자열 "true"로 변환
				System.out.println(Boolean.parseBoolean("false")); // 문자열을 false로 변환
			}
		}

	


