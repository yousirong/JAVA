package 중간고사;
import java.util.Random;
import java.util.Scanner;

class Hufs {
	
	private String nameUniv;
	private int studentID;
	public String getter() {
		return nameUniv;
	}
	public void setter(String nameUniv){
		this.nameUniv = nameUniv;
	}
	public int getBalance(){
		return studentID;
	}
	public void setBalance(int studentID){
		this.studentID = studentID;
	}
	// 1) 프로그래밍 할 곳
  // setXXX(), getXXX() 메소드를 작성
	
	
}



public class 중간고사예비용 {

	public static void main(String[] args) {
		Hufs a = new Hufs();
		Scanner scanner = new Scanner(System.in);
		System.out.println("학교 이름을 입력하시오:");
		String name = scanner.nextLine();
		a.setter(name);
		System.out.println("학번을 입력하시오:");
		int ID = scanner.nextInt();
		a.setBalance(ID);
		System.out.println("학교 이름은"+ a.getter()+", 학번은"+a.getBalance()+"입니다.");
	}

}
