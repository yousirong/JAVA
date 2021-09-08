package SetMapTest;

public class CityManagerTest {

	public static void main(String[] args) {
		CityManager cityManager = new CityManager();
		City city1 = new City("서울" ,2222);
		City city2 = new City("인천", 1313);
		cityManager.add(city1);
		cityManager.add(city2);
		cityManager.printAll();

		//cityManager.print(city1.name);
		//cityManager.delete(city1.name);
		cityManager.update("서울", "부산");
		cityManager.update("인천", 23143);
		cityManager.printAll();
	}

}
