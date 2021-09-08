package SetMapTest;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		//Map <Key, value> -key는 중복 x , value 중복가능
		Map<String, Integer	> maps = new HashMap<>();   //빨간줄뜨면 ctrl + shift + o
		
		//추가
		maps.put("김철수", 20);  //앞이 key 뒤에가 value
		maps.put("박영민", 24);
		maps.put("이영희", 21);
		maps.put("이영희", 23);
		
		//출력
		System.out.println("---hashmap---");
		for(String key : maps.keySet()) {
			System.out.println(key+ ":"+maps.get(key));
		}
		
		//크기
		int size = maps.size();
		
		//키 존재여부
		boolean isKey = maps.containsKey("박민영");
		boolean isValue = maps.containsValue(23);
		
		//값 가져오기
		//get
		int value = maps.get("박민영");
		
		
		//삭제 - remove(key) : integer
		maps.remove("박민영");
		System.out.println("---hashmap---");
		for(String key : maps.keySet()) {
			System.out.println(key+ ":"+maps.get(key));
		}
		
		//전부 삭제
		maps.clear();
		System.out.println("---hashmap---");
		for(String key : maps.keySet()) {
			System.out.println(key+ ":"+maps.get(key));
		}
	}

}
