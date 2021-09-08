package step06_class;

public class MyString {
	//멤버변수
	char[] charList;
	
	
	//생성자
	public MyString(String str ) {
		charList = str.toCharArray();
		//char[] = {H,e,l,l,o , , w, , ,...}
	
		
	}
	
	
	
	//메소드
	public String toString() {
		String result ="";   //char[] -> string으로 반환 해주는 메소드
		for(char c : charList) {
			result = result +c;
		}
		return result;
	}
	char charAt(int index) {
		return charList[index];
	}
	int length() {
		int length = charList.length;
		return length;
	}
	
	
	int indexOf(char searchchar ) {
		int result =-1;
		for(int i=0;i<charList.length; i++)
		{
			if(charList[i] == searchchar) {
				result =i;
			}
		}
		return result;
	}

	String reverse() {
		String rever= "";
		for(int i = charList.length-1;i>=0; i--)
		{
			 rever=rever +charList[i];
		}
		return rever;
	}
	
	String subString(int begin, int end) {
		String result = "";
		for(int i=begin; i<end +1; i++)
		{
			result = result +charList[i];
		}
		return result;
	}
	
	String replace(char oldChar,char newChar)
	{
		String result= "";
		for(int i=0; i<charList.length; i++)
		{
			if(charList[i]==oldChar)
			{
				charList[i]=newChar;
				result=result+charList[i];
			}
			else
			{
				result=result + charList[i];
			}
		}
		return result;
	}
	
	String Toupper() {
		String str ="";
		for(char c : charList) {
			if(c>='a'&& c<='z') {
				str +=(char)(c-('a'-'A'));
			}else {
				str +=c;
			}
		}
		
		return str;
	}
	
	String Tolower() {
		String str ="";
		for(char c : charList) {
			if(c>='A'&& c<='Z') {
				str +=(char)(c+('a'-'A'));
			}else {
				str +=c;
			}
		}
		
		return str;
	}
	
	String[] split(char splitChar) {
		String[] stringList = new String[charList.length];
		int cnt =0;
		for(int charidx=0 , stridx =0 ; charidx < charList.length ; charidx++) {
			if(stringList[stridx]==null)
				stringList[stridx] = new String();
			if(charList[charidx] != splitChar)
				stringList[stridx] += charList[charidx];
			if(charList[charidx]== splitChar || charidx == charList.length -1) {
				cnt++;
			    stridx++;
		}
	
		}
		String[] returnList = new String[cnt];
		for(int i =0; i<cnt; i++)
		{
			returnList[i] = stringList[i];  // ->???
		}
		return returnList;

	}
	
	}
	
