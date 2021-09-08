package step10_collection;

public class ListPractice {

	public static void main(String[] args) {
		StudentManager studentManager = new StudentManager();
		studentManager.add(new Student("홍길동" ,21 , 4.5));
		studentManager.add(new Student("홍진경" ,39 , 4.0));
		studentManager.add(new Student("홍진영" ,28 , 2.5));
		
		
		studentManager.printAll();
		studentManager.delete("홍진경");
		studentManager.printAll();
		studentManager.update("홍길동", 1.0);
		studentManager.printAll();
	}

}
