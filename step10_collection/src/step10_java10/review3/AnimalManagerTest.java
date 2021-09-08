package step10_java10.review3;


public class AnimalManagerTest {

	public static void main(String[] args) {
		AnimalManager amtest = new AnimalManager();
		
		amtest.add("소", "튼실이");
		amtest.add("참새", "날쌘돌이");
		amtest.add("소", "여을이");
		amtest.printAll();
		amtest.delete("튼실이");
		amtest.printAll();

	}

}
