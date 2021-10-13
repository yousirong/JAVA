package 객체지향프로그래밍6주차;
/*
 * 지역 클래스(local class)
 * 메소드 안에 정의되는 클래스
 * 이 메소드는 접근 제어 지정자를 가질 수 없음 
 * 지역 클래스는 abstract 또는 final만 지정 가능
 * 
 * 지역 클래스는 메소드의 지역 변수에도 접근 가능
 * 지역변수는 반드시 final로 선언
 */
class localInner{
	private int data = 30;
	
	void display() {
		final String msg = "현재의 데이터 값은 ";
		
		class Local {
			void printMsg() {
				System.out.println(msg + data);
			}
		}
		Local obj = new Local();
		obj.printMsg();
	}
}
public class LocalInnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		localInner obj = new localInner();
		obj.display();
	}

}
