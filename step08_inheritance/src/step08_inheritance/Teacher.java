package step08_inheritance;

public class Teacher extends Person {
	private String[] subject ;
	private int general =1111;
	
	
	public Teacher(String name,int age, String[] subject)
	{
		super(name, age);
		this.subject = subject;
		this.general = general++;
	}

	public int getAge() 	{
		return age;
	}
	public void setAge(int age) {
		this .age =age;
	}
	public String[] getSubject() {
		return subject;
	}

	public void setSubject(String[] subject) {
		this.subject = subject;
	}

	public int getGeneral() {
		return general;
	}

	public void setGeneral(int general) {
		this.general = general;
	}
	
	public String toString() {
		
		String str ="name= " + name +", age= "
		+getAge()+",{"+subject[0]+","+subject[1]+"},"+general;
	return str;
	}
	
	
	
	
	
	
	
	
}
