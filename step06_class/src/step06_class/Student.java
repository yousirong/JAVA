package step06_class;

import javax.sound.midi.Synthesizer;

public class Student {
	//멤버 변수 
	String name;
	double score;
	int studentNumber;
	
	
	//생성자 
	//클래스 생성될 때 한 번 실행 , 멤버 변수 초기화 위해 사용
	Student() { //Student student1 = new Student(); test 부분에서 불려오게됨
	}
	Student(String name1, double score1){
		this.name =name1;
		this.score =score1;
	}
	Student(String name, double score, int studentNumber){ //생정자가 있어야지만 student2를 만들수 있다.
		this.name =name;
		this.score =score;
		this.studentNumber=studentNumber;
	}
	//메소드 (함수)
	//리턴타입 메소드이름 (매개변수)
	char getGrade() { // 매개변수가 없고 , 리턴타입 :char
		//로컬 변수 = 자동초기화 X
		char grade = 'F';  //디폴드 값이 F
		
		if(score >= 4.0) {
			grade = 'A';
		}else if( score>= 3.0)	{
			grade= 'B';
		}else {
			grade= 'C';
		}
		
		
		return grade;  //자기를 호출한 쪽에 돌려줌
	}
	
	
	
	//return 타입이 없는 메소드
	//속성들을 프린트 하는 메소드
	void print() {  //void는 리턴 할 필요 없다.
		System.out.println(name+ ", "+score+", "+studentNumber);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
