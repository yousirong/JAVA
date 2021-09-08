package step02_type;

public class PreferenceTypejava {

	public static void main(String[] args) {
		//String 모든 클래스의 첫번째 글자는 대문자
		
		String str;
		str ="123";
		
		String str1 = "123";
		
		String str2 = new String("123");   //객체생성을 통해 객체만듬.   str1 과 str2는 주소를 비교함.
		String str3 = new String("456");
		
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		int val1 =1, val2 =2;
		
		System.out.println(val1 == val2);   //주소비교   두 객체의 메모리 주소가 다르므로 false
		System.out.println(str1.equals(str2));  // 객체비교 내용물을 비교함 123 123 같음   true
		
		System.out.println(str == str1);    //string객체를 생성하고 안에다가 내용물을 넣거나 또는 생성하자마자 초기화 할경우에 내용물이 같은 경우 주소값이 일치하게 됨.
	}

}
