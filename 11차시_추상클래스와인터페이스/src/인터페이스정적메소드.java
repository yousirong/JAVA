interface Employable {
	String getName();

	static boolean isEmpty(String str) {
		if (str == null || str.trim().length() == 0) {
			return true;
		} else {
			return false;
	        }
	}
}

class Employee implements Employable {
	private String name;

	public Employee(String name) {
	         if (Employable.isEmpty(name) == true) {
			  throw new RuntimeException("이름은 반드시 입력하여야 함!");
	         }
	         this.name = name;
	}

	@Override
	public String getName() {
	         return this.name;
	}
}

public class 인터페이스정적메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employable employee12 = new Employee("홍길동");

//		Employable employee2 = new Employee("");
	}

}
