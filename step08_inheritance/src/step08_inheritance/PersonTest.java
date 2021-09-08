package step08_inheritance;

public class PersonTest {

	public static void main(String[] args) {
		Person person = new Person("사람",13);
		person.personMethod();
		String name = person.name;
		int age = person.getAge();
		System.out.println(name+","+age);
		
		/*Student student = new Student("학생", 14,"컴공" );
		student.studentMethod();		
		String sname = student.name;
		int sage = student.getAge();
		String major = student.major;
		System.out.println(sname + ","+sage+","+major);
		*/
		Person.staticMethod();
		Student.staticMethod();
	}
	

}
