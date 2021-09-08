package step08_inheritance;

public class HeterCollectionExample {

	public static void main(String[] args) {
		Person1[] pArr = new Person1[4];
		
		pArr[0] = new Person1 ("사람",20);
		pArr[1] = new Student1 ("학생",17, "20174213");
		pArr[2] = new Teacher1("선생님",20,"JAVAsd");
		pArr[3] = new Employee("직원",20," 교무처");
		
		for(int i=0; i<pArr.length; i++)
		{
			System.out.println(pArr[i].getDetails());
		}
	}

}
