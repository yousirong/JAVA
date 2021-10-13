package 모듈과_패키지_개념_자바_기본_패키지;
/*  패키지(package)
 * 서로 관련된 클래스와 인터페이스의 컴파일 된 클래스(.class) 파일들을 하나의 디렉터리에 묶어 놓은 것
 * 
 *  모듈(module)
 *  여러 패키지와 이미지 등의 자원을 모아 놓은 컨테이너
 *  
 *  자바 API를 여러 모듈로 분할하여 응용프로그램의 실행에 적합한 모듈들로만 실행 환경을 구축할 수 있도록함
 *  메모리 등의 자원이 열악한 작은 소형 기기에 꼭 필요한 모듈로 구성된 작은 크기의 실행 이미지를 만들기 위함
 *  
 *  패키지명과 클래스의 경로명
 *  (.)으로 연결
 *  Project.FileIO.Tools.class
 *  Project.UI.Tools.class
 */

/* java.lang 
 *  자바 language패키지
 *     스트링, 수학 함수, 입출력 등 자바 프로그래밍에 필요한 기본적인 클래스와 인터페이스
 *  자동으로 import -> import 문 필요없음
 * 
 * java.util
 *   자바유틸리티 패키지
 *      날짜, 시간, 벡터, 해시맵 등과 같은 다양한 유틸리티 클래스와 인터페이스 제공
 * 
 * java.io
 *   키보드, 모니터, 프린터, 디스크 등에 입출력을 할 수 있는 클래스와 인터페이스 제공
 *   
 * java.awt
 *   자바 GUI 프로그래밍을 위한 클래스와 인터페이스 제공
 * 
 * javax.swing 
 *   자바 GUI 프로그래밍을 위한 스위 패키지
 */

/* Object 클래스
 *   특징
 *   	java.lang 패키지에 포함
 *   	모든 클래스의 수퍼 클래스
 *   		- 모든 클래스에 강제 상속
 *   		- 모든 객체가 공통으로 가지는 객체의 속성을 나타내는 메소드 보유
 *    		- Object obj = new Object();
 * 주요 메소드
 * 	boolean equals(Object obj)  obj가 가리키는 객체와 현재 객체를 비교하여 같으면 true 리턴
 *  Class getClass() 			 현 객체의 런타임 클래스를 리턴
 *  int hashCode() 		     현 객체에 대한 해시 코드 값 리턴
 *  String toString() 			 현 객체에 대한 문자열 표현을 리턴
 *  void notify() 				 현 객체에 대해 대기하고 있는 하나의 스레드를 깨운다.
 *  void notifyAll()  			 현 객체에 대해 대기하고 있는 모든 스레드를 깨운다.
 *  void wait() 				 다른 스레드가 깨울 때까지 현재 스레드를 대기하게 한다.	
 *   
 * 
 */
class Point1 {
	private int x, y;
	public Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}
}



public class 패키지만들기 {
	public static void print(Object obj) {
		System.out.println(obj.getClass().getName());  // 클래스이름
		System.out.println(obj.hashCode()); // 해시 코드 값
		System.out.println(obj.toString()); // 객체를 문자열로 만들어 출력
		System.out.println(obj);  // 객체 출력
	}
	public static void main(String[] args) {
		Point1 p = new Point1(2,3);
		print(p);

	}

}
