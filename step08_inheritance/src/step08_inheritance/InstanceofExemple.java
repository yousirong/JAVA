package step08_inheritance;

public class InstanceofExemple {

	public static void main(String[] args) {
		
		Student1 s = new Student1("홍길학", 17 , "20002149");
		printPersonInfo(s);
		
		
		Teacher1 t = new Teacher1 ( "홍길선 " , 29 , "JAVAPROGRAMMING");
		printPersonInfo(t);
		
		Employee e = new Employee("홍길직 ", 40 , "교무처");
		printPersonInfo(e);
	}
	
	public static void printPersonInfo(Person1 p) {
		if(p instanceof Student1) {
			System.out.println("*********Student Info*********");
		}else if(p instanceof Teacher1) {
			System.out.println("*********Teacher Info*********");
		}else if(p instanceof Employee) {
			System.out.println("*********Employee Info********");
		}else {
			System.out.println("**********Person**************");
		}
		System.out.println(p);
		System.out.println(p.getDetails());
		System.out.println("***************************");
	}
	
	
	
	
	

}
