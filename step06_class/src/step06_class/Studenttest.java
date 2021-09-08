package step06_class;

public class Studenttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student 변수 선언 및 생성 - 기본 생성자
		Student student1 = new Student();
		
		//student1에 변수타입@주소값 저장
		System.out.println(student1);
		
		//student1.변수이름( . 으로 변수 접근가능)
		System.out.println(student1.name);
		System.out.println(student1.score);
		System.out.println(student1.studentNumber);
		student1.name = "이준용";
		student1.studentNumber = 20178126;
		student1.score =2.0;
		//저장 후
		System.out.println();
		
		
		System.out.println(student1.name);
		System.out.println(student1.score);
		System.out.println(student1.studentNumber);
		
		
		Student student2 = new Student("서강준",4.0,20173888); //값을 초기화 시켜주면서 틀을 만듬
		//c++에서 생성자 생성과 비슷함. 
		
		System.out.println("---------------------------");
		System.out.println(student2.name);
		System.out.println(student2.score);
		System.out.println(student2.studentNumber);
		System.out.println("---------------------------");

		Student student3 = new Student("서강준", 4.0);
		System.out.println(student3.name);
		System.out.println(student3.score);
		
		//메소드 실행 - 다른 클래스에서 메소드 호출
		System.out.println("---------------------------");
		char grade1=student1.getGrade();
		System.out.println("student1의 학점:" +grade1);
		char grade2=student2.getGrade();
		System.out.println("student2의 학점:" +grade2);
		
		
		//return 타입이 없는 메소드
		System.out.println("---------------------------");
		student1.print();
		student2.print();
		
	}

}
