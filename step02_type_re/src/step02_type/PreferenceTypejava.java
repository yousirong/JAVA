package step02_type;

public class PreferenceTypejava {

	public static void main(String[] args) {
		//String ��� Ŭ������ ù��° ���ڴ� �빮��
		
		String str;
		str ="123";
		
		String str1 = "123";
		
		String str2 = new String("123");   //��ü������ ���� ��ü����.   str1 �� str2�� �ּҸ� ����.
		String str3 = new String("456");
		
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		int val1 =1, val2 =2;
		
		System.out.println(val1 == val2);   //�ּҺ�   �� ��ü�� �޸� �ּҰ� �ٸ��Ƿ� false
		System.out.println(str1.equals(str2));  // ��ü�� ���빰�� ���� 123 123 ����   true
		
		System.out.println(str == str1);    //string��ü�� �����ϰ� �ȿ��ٰ� ���빰�� �ְų� �Ǵ� �������ڸ��� �ʱ�ȭ �Ұ�쿡 ���빰�� ���� ��� �ּҰ��� ��ġ�ϰ� ��.
	}

}
