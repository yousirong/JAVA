package step06_class;

public class MyStringtest {

	public static void main(String[] args) {
		MyString str =new MyString("Hello World");
		System.out.println(str);
		char c1 =str.charAt(3);
		System.out.println("charAt(3): "+c1);
		int length = str.length();
		System.out.println("length(): "+ length);
		
		int index =str.indexOf('W');
		System.out.println("w의 위치: "+ index);
		
		String reverse =str.reverse();
		System.out.println(reverse);
		
		String subString =str.subString(2,5);
		System.out.println(subString);
		
		String replace =str.replace('l', 'k');
		System.out.println(replace);
		
		String Toupper = str.Toupper();
		System.out.println(Toupper);
		
		String Tolower = str.Tolower();
		System.out.println(Tolower);
		
		String[] split = str.split('l');
		System.out.println(split);
	}

}
