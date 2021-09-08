package step08_inheritance;

public class PolyArgumentExample {

	public static void main(String[] args) {
		Student1 s = new Student1( "홍길동  ", 17 ,"20001234");
		printPersonInfo(s);
		
		Teacher1 t = new Teacher1("홍길선", 22, " JAVA Programming");
		printPersonInfo(t);
		
		Employee e =new Employee("홍길직",25, "교무처");
		printPersonInfo(e);
		
		
	}
	
	public static void printPersonInfo(Person1 p) {
		System.out.println("****************Person Info*********");
		System.out.println(p);
		System.out.println(p.getDetails());
		System.out.println("**********************************");
	}

}
