package step02_type;

public class StringMethod {

	public static void main(String[] args) {
		//String
		
		String str1 = new String("hello ");   //str1 과 str2는 문자열이 같다. hello_
		String str2 = "hello ";               // 0 h / 1 e / 2 l / 3 l / 4 0 / 5 빈칸
		
		//공백
		String str3 = new String();
		String str4 ="";
		
		//null
        // 자료형에는 기본형과 참조형이 있다. 
		String str5 = null;
		System.out.println("str3: " +str3);
		System.out.println("str4: " +str4);
		System.out.println("str5: " +str5);
		
		//문자열의 연산 , 문자 + 문자 = 문자  / 문자 + 숫자 = 문자
		String addString = str1 + str2;  //앞에 쓴것에 바로 뒤에 붙게됨.
		System.out.println("str1 + str2 : " +addString);
		System.out.println("str1 + str2 : " + 1000);   //자바에서는 c와 다르게 printf를 사용하지 않는다 위와 같은 장점이 있기 때문이다.
		
		//charAt(int index) : char
		//char charAt= str1.charAt(0);  //<- 이거 자체가 char형으로 반환이 된다.
		//System.out.println("charAt(0)" + charAt);		
		char charAt= str1.charAt(5);
		System.out.println("charAt(5)" + charAt);	 //빈칸 출력	

		//length() : int
		int length = str1.length();
		System.out.println("length: " + length); // 0~5 임 그래서 길이 6임.
		
		//equals(String comparingString) : boolean
		boolean equals = str1.equals(str2);
		System.out.println("str1 과 str2가 같은 문자열인가: " + equals);
		
		//indexOf(char), indexOf(str) : int  char의 index를 int형으로 반환하는 것
		int indexOfChar = str1.indexOf('e');
		int indexOfStr = str1.indexOf("lo");
		System.out.println("e의 인덱스: "+ indexOfChar);
		System.out.println("lo의 인덱스: "+ indexOfStr);
		
		//substring(int beginIndex, int endIndex) : String
		String subString = str1.substring(0, 2);
		System.out.println("0,2 인데스 부분 문자열: "+ subString);
		
		//replace(char oldChar, char newChar) : String
		String replace = str1.replace('l','k');  //메소드에 char형 문자를 넣을때 '' 작은 따옴표 사용한다.
		System.out.println("l을k로 대체한 문자열:"+ replace);
		
		//trim( ) : String   앞뒤에 있는 공백을 제거해주는 역할을 함. 공백을 제거하고 hello만 출력하게 해줌
		String trim = str1.trim();
		System.out.println("trim 사용한 문자열: "+ trim);
							
		//toLowerCase(), toUpperCase() : String
		String toUpperCase = str1.toUpperCase();
		System.out.println("toUpperCase을 사용한 문자열: "+ toUpperCase);
		
		String toLowerCase = toUpperCase.toLowerCase();
		System.out.println("toLowerCase를 사용한 문자열: "+ toLowerCase);
		
		//int =>String
		int int1 = 314;
		String intString1=int1 +"";
		String intString2=String.valueOf(int1);
		System.out.println(int1);
		System.out.println(intString1);
		System.out.println(intString2);
				
		//Stinrg => int
		String str6 = "314";
		int strToInt = Integer.parseInt(str6);  //지금 노란색 줄이 뜨는 경우는 변수를 만들어놓고 사용을 왜 안하느냐 라고이클립스에서 알려주는것, 메모리 낭비여.				
		System.out.println(strToInt);
		//String  => 	double
		String str7 = "3.14";
		double strToDouble = Double.parseDouble(str7);
		System.out.println(strToDouble);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
