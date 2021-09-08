package step02_type;

public class StringMethod {

	public static void main(String[] args) {
		//String
		
		String str1 = new String("hello ");   //str1 �� str2�� ���ڿ��� ����. hello_
		String str2 = "hello ";               // 0 h / 1 e / 2 l / 3 l / 4 0 / 5 ��ĭ
		
		//����
		String str3 = new String();
		String str4 ="";
		
		//null
        // �ڷ������� �⺻���� �������� �ִ�. 
		String str5 = null;
		System.out.println("str3: " +str3);
		System.out.println("str4: " +str4);
		System.out.println("str5: " +str5);
		
		//���ڿ��� ���� , ���� + ���� = ����  / ���� + ���� = ����
		String addString = str1 + str2;  //�տ� ���Ϳ� �ٷ� �ڿ� �ٰԵ�.
		System.out.println("str1 + str2 : " +addString);
		System.out.println("str1 + str2 : " + 1000);   //�ڹٿ����� c�� �ٸ��� printf�� ������� �ʴ´� ���� ���� ������ �ֱ� �����̴�.
		
		//charAt(int index) : char
		//char charAt= str1.charAt(0);  //<- �̰� ��ü�� char������ ��ȯ�� �ȴ�.
		//System.out.println("charAt(0)" + charAt);		
		char charAt= str1.charAt(5);
		System.out.println("charAt(5)" + charAt);	 //��ĭ ���	

		//length() : int
		int length = str1.length();
		System.out.println("length: " + length); // 0~5 �� �׷��� ���� 6��.
		
		//equals(String comparingString) : boolean
		boolean equals = str1.equals(str2);
		System.out.println("str1 �� str2�� ���� ���ڿ��ΰ�: " + equals);
		
		//indexOf(char), indexOf(str) : int  char�� index�� int������ ��ȯ�ϴ� ��
		int indexOfChar = str1.indexOf('e');
		int indexOfStr = str1.indexOf("lo");
		System.out.println("e�� �ε���: "+ indexOfChar);
		System.out.println("lo�� �ε���: "+ indexOfStr);
		
		//substring(int beginIndex, int endIndex) : String
		String subString = str1.substring(0, 2);
		System.out.println("0,2 �ε��� �κ� ���ڿ�: "+ subString);
		
		//replace(char oldChar, char newChar) : String
		String replace = str1.replace('l','k');  //�޼ҵ忡 char�� ���ڸ� ������ '' ���� ����ǥ ����Ѵ�.
		System.out.println("l��k�� ��ü�� ���ڿ�:"+ replace);
		
		//trim( ) : String   �յڿ� �ִ� ������ �������ִ� ������ ��. ������ �����ϰ� hello�� ����ϰ� ����
		String trim = str1.trim();
		System.out.println("trim ����� ���ڿ�: "+ trim);
							
		//toLowerCase(), toUpperCase() : String
		String toUpperCase = str1.toUpperCase();
		System.out.println("toUpperCase�� ����� ���ڿ�: "+ toUpperCase);
		
		String toLowerCase = toUpperCase.toLowerCase();
		System.out.println("toLowerCase�� ����� ���ڿ�: "+ toLowerCase);
		
		//int =>String
		int int1 = 314;
		String intString1=int1 +"";
		String intString2=String.valueOf(int1);
		System.out.println(int1);
		System.out.println(intString1);
		System.out.println(intString2);
				
		//Stinrg => int
		String str6 = "314";
		int strToInt = Integer.parseInt(str6);  //���� ����� ���� �ߴ� ���� ������ �������� ����� �� ���ϴ��� �����Ŭ�������� �˷��ִ°�, �޸� ����.				
		System.out.println(strToInt);
		//String  => 	double
		String str7 = "3.14";
		double strToDouble = Double.parseDouble(str7);
		System.out.println(strToDouble);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
