package 객체지향프로그래밍6주차;
/* static 메소드의 제약 조건 1
 * static 메소드는 non-static 멤버 접근할 수 없음
 * - 객체가 생성되지 않은 상황에서도 static 메소드는 실행될 수 있기 때문에, non-static 메소드와 필드 사용 불가
 * - 반대로, non- static 메소드는 static 멤버 사용 가능
 *
 * static 메소드의 제약 조건 2
 * static 메소드는 this 사용 불가
 * - static 메소드는 객체가 생성되지 않은 사황에서도 호출이 가능하므로, 현재 객체를 가리키는 this 레퍼런스 사용할 수 없음.
 */
import java.util.Scanner;
class CurrencyConverter {
	private static double rate;  // 한국 원화에 대한 환율
	public static double toDollar(double won) {
		return won/rate; // 한국 원화를 달러로 변환
	}
	public static double toKWR(double dollar) {
		return dollar * rate;  // 달러를 한국 원화로 변환
	}
	public static void setRate(double r) {
		rate = r; // 환율 설정. KWR/$1
	}
}
public class staticMember {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("환율(1달러)>> ");
		double rate = scanner.nextDouble();
		CurrencyConverter.setRate(rate); // 미국 달러 환율 설정
		System.out.println("백만원은 $"+ CurrencyConverter.toDollar(1000000) + "입니다.");
		System.out.println("$100는 " + CurrencyConverter.toKWR(100) + "원입니다.");
		scanner.close();
	}

}
/* final 클래스 - 클래스 상속 불가
 * final class FinalClass {
 * ....}
 * class SubClass extends FinalClass {// 컴파일 오류. FinalClass 상속 불가
 * ..... }
 * final 메소드 - 오버라이딩 불가
 * public class SuperClass {
 * 	protected final int finalMethod {...}
 * 
 *  class SubClass extends SuperClass { // subClass가 SuperClass 상속
 *  protected int finalMethod() {...} // 컴파일 오류, 오버라이딩 할 수 없음,
 */
