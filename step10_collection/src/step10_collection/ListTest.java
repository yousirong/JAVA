package step10_collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		//List -- 배열하고 비슷
		System.out.println("------ArrayList------");
		List<String> stringList  = new ArrayList<>();
		
		//추가
		stringList.add("Jane");  //0	
		stringList.add(1,"1811187"); //1
		stringList.add("컴과"); //2
		stringList.add("010-1234-5678"); //3
		
		//크기 
		int size = stringList.size();
		System.out.println("크기:" +size);
		//get(index)
		String index2 = stringList.get(2);
		System.out.println("2번째 인덱스: "+index2);
		
		//remove(index)	
		String removedString = stringList.remove(3);
		System.out.println(removedString  + "이 삭제되었습니다.");
		
		//출력
		System.out.println("== list ==");
		for(String str : stringList) {
			System.out.println(str);
		}
		System.out.println("== list ==");
		for(int idx = 0 ; idx < stringList.size() ; idx++)
		{
			System.out.println(stringList.get(idx));
		}
		
		//-----------LinkedList----------
		List<Person> linkedList = new LinkedList<>();
		
		
		//추가
		Person person = new Person("홍길동", 30);
		linkedList.add(person);
		linkedList.add(new Person("김영자",20));
		
		//출력
		System.out.println("=======Person LinkedList========");
		for(Person person1 : linkedList) {
			System.out.println(person1.toString());
			System.out.println(person1);
		}
		
		//전부 삭제
		linkedList.clear();
		System.out.println("=======Person LinkedList========");
		for(Person person1 : linkedList) {
			System.out.println(person1.toString());
			System.out.println(person1);
		}		
				
				
				
				
				
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
