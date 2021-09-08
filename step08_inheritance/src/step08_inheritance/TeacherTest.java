package step08_inheritance;

public class TeacherTest {

	public static void main(String[] args) {
		Teacher[] teachers =new Teacher[2];
		String[] subjects = {"수학","과학"};
		teachers[0] = new Teacher("선생1", 30, subjects);
		teachers[1] = new Teacher("선생2", 22,new String[] {"물리", "생물"});
		
		for(Teacher teacher: teachers) {
			System.out.println(teacher);
			
		}
		System.out.println("--선생1의 이름, 과목 변경 -- ");
		teachers[0].name = "선생이름변경";
		String[] subjects1 = {"영어","국어"};
		teachers[0].setSubject(subjects1);
		
		for(Teacher teacher : teachers) {
			System.out.println(teacher);
		}
	}

}
