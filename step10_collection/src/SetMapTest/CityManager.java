package SetMapTest;

import java.util.HashMap;

public class CityManager {
	//멤버변수 : HashMap<String , City>
	private HashMap<String, City> citymap = new HashMap<>();
	// 생성자() 

	
	//void add(City city) - map에 추가
	void add(City city) {
		citymap.put(city.name, city);
	}
	//void delete(String name) - map에서 삭제
	void delete(String name) {
		citymap.remove(name);
	}
	//void update(String oldName, String newName) - 시티어를 업데이트
	void update(String oldName, String newName) {
		int population = citymap.get(oldName).population;
		citymap.remove(oldName);
		citymap.put(newName, new City(newName, population));
	}
	void update(String name , int newPopulation) {
		City city = citymap.get(name);
		city.population = newPopulation;
		citymap.put(name, city);
	}
	
	//void print(String name) --값 출력
	void print (String name ) {
		System.out.println(citymap.get(name));
	}
	//void printAll() -- 맵 내용 전부 출력
	void printAll() {
		for(String city : citymap.keySet()) {
			System.out.println(city+ ":"+citymap.get(city));
		}
	}
	
}
