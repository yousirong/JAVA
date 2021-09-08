package step10_collection;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StudentManager extends Student{
	
		
		List<Student> linkedList = new LinkedList<>();
	
	
		
		public void printAll() {
			
			for(Student student1 : linkedList) {
				System.out.println(student1);
			}
		}
		
		public void add(Student student) {
			linkedList.add(student);
		}
		
		public void delete(String name) {
			for(int idx = 0 ; idx < linkedList.size(); idx++ ) {
				if(linkedList.get(idx).getName().equals(name)) {
				     linkedList.remove(idx);
				}else {
					System.out.println("일치하는 이름이 없습니다.");
				}
			}
			
		}
		
		public void update(String name,double newScore)
		{
			for(int idx = 0 ; idx < linkedList.size(); idx++ ) {
				if(linkedList.get(idx).getName().equals(name)) {
				    linkedList.get(idx).setScore(newScore);
				}else {
					System.out.println("일치하는 이름이 없습니다.");
				}
			}
		}
		
		
		
		
}
