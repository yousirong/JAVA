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
			  throw new RuntimeException("�̸��� �ݵ�� �Է��Ͽ��� ��!");
	         }
	         this.name = name;
	}

	@Override
	public String getName() {
	         return this.name;
	}
}

public class �������̽������޼ҵ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employable employee12 = new Employee("ȫ�浿");

//		Employable employee2 = new Employee("");
	}

}
