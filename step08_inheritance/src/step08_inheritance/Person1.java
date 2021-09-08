package step08_inheritance;

public class Person1 {
	public String name;
	public int age;
	
	public Person1 (String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public Person1(String name) {
		this(name,1) ;
		
	}
	public Person1() {
		
		this("이름없음", 1 );
		
	}
	public String getDetails() {
		return "이름 : " +name + "\t나이: "+ age;
	}

}
