package step08_inheritance;


public class Teacher1 extends Person1 {
	private String subject;
	
	public Teacher1 (String name, int age ,String subject) {
		super(name,age);
		this.subject = subject;
	}
	
	public String getDetails() {
		return super.getDetails() + "\t과목:" + subject;
	}
}
