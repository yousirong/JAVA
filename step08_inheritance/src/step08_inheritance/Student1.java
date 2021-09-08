package step08_inheritance;

public class Student1 extends Person1 {
	private String studentId;
	
	public Student1 (String name, int age , String studentId) {
		super (name , age);
		this.studentId = studentId;
	}
	
	public String getDetails() {
		return super.getDetails() + "\tg학번:" + studentId;
	}
}
