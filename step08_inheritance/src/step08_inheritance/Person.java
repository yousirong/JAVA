package step08_inheritance;

public class Person {
	String name;
	int age;
	
	public Person() {}
	public Person(String name, int age) {
		this.name =name;
		this.age =age;
	}
	public int getAge() 	{
		return age;
	}
	public void setAge(int age) {
		this .age =age;
	}
	
	public String toString() {
		return "name= " + name +", age= " + age;
	}
	
	public void personMethod() {
		System.out.println("Person객체 메소드");
		
	}
	
	public static void staticMethod() {
		System.out.println("Person static Method");
	}
	
}
