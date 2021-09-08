package step08_inheritance;

public class Student extends Person {
	private String major;
	
	public Student() {
		super();
	}
	public Student(String name, int age , String major) {
		super(name, age);
		this.major = major;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String toString() {
		String str ="이름="+ name +"나이 ="+ getAge() +"major ="+ major;
		return str;
	
	}
}
