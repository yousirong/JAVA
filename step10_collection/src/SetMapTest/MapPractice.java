package SetMapTest;

import java.util.HashMap;
import java.util.Map;
class City{
	String name;
	int population;
	
	City(String name, int population){
		this.name = name;
		this.population = population;
	}
	
	public String toString() {
		return name + "," + population;
	}
}
public class MapPractice {
	public static void main(String[] args) {
		//String name, Cit city Map 자료구조로 작성
		Map<String, City> citymap = new HashMap<>();
		City city1 = new City("서울", 100000);
		City city2 = new City("인천", 200000);
		
		citymap.put(city1.name, city1);
		citymap.put(city1.name, city1);
		
		//출력
		for(String key : citymap.keySet()) {
			City value = citymap.get(key);
			System.out.println(key+ ":" + value);
		}
		
		//한개 삭제
		citymap.remove("인천");
		System.out.println("-----hashmap----");
		for(String key : citymap.keySet()) {
			System.out.println(key + ":" + citymap.get(key));
		}
		//전부 삭제
		citymap.clear();
		System.out.println("---hashmap---");
		for(String key : citymap.keySet()) {
			System.out.println(key+ ":"+citymap.get(key));
		}
	}


	

}
