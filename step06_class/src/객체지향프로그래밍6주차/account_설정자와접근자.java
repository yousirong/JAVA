package 객체지향프로그래밍6주차;
/* 설정자와 접근자
 * - 설정자(mutator)
 * -> 필드의 값을 설정하는 메소드(setters)
 * -> setBalance()
 * 
 * - 접근자(accessor)
 * -> 필드의 값을 반환하는 메소드(getters_
 * -> getBalance()
 * 
 */
class account{
	private int regNumber;
	private String name;
	private int balance;


	public String getName() {    // getName() 인수 x
		return name;
	}
	public void setName(String name) {  // setName() 인수 String name을 getName()에서 받아오기
		this.name =name;
	}
	public int getBalance() {   // getBalance() 인수 x
		return balance;
	}
	public void setBalance(int balance) {  // getBalance() 인수 int balance을 getBalance()에서 받아오기
	this.balance = balance;
	}
}
public class account_설정자와접근자 {

	public static void main(String[] args) {
		account obj = new account();
		obj.setName("Tom");
		obj.setBalance(100000);
		System.out.println("이름은 " + obj.getName() + " 통장 잔고는 " + obj.getBalance() + "입니다.");
	}

}
