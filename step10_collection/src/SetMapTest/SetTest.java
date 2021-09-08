package SetMapTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		//Set - 저장 순서가 유지가 되지 않음. 중복저장x
		Set<String> names = new HashSet<>();
		
		//추가
		names.add("김영희");
		names.add("이철수");
		names.add("박영민");
		names.add("김영희");
		//출력
		System.out.println("---SET---");
		for(String name : names ) {
			System.out.println(name);
		}
		
		
		//크기
		int size = names.size();
		System.out.println("크기 : " + size);
		
		//검색 , 존재 여부
		//contains(object) : boolean
		boolean check = names.contains("이철수");
		System.out.println("이철수 존재:"+check );
		
		
		//삭제
		//remove(object) : boolean
		names.remove("이철수");
		System.out.println("---SET---");
		for(String name : names) {
			System.out.println(name);
		}
		
		System.out.println("---SET---");
		Iterator<String> iterator = names.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		
		
		
		
		//SET 전체 삭제 
		names.clear();
		
		
		//비어있는지 확인
		boolean isEmpty = names.isEmpty();
		System.out.println("비어있는가?" +  isEmpty);
	}

}
