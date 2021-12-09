package step07_static;

public class Account {
	//멤버변수
	private static int accountCnt = 1111;  // static , 클래스 변수	
	private String bank;
	private int accountNumber;
	private int balance;
	
	//생성자
	public Account () {}
	public Account (String bank) {
		this.bank = bank;
		//accountNumber = accountCnt;
		//accountCnt = accoutnCnt +1;
		accountNumber = accountCnt++;
		balance = 0;
	}
	public Account(String bank, int amount)
	{
		this(bank);
		balance = amount;
	}
	
	
	//메소드 = getter, setter
	public String getBank() {
		return this.bank;
	}
	public void setBank(String bank) {
		this.bank =bank;
	}
	public int getAccountNumber() {
		return this.accountNumber;
		
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
		
	}
	public int getBalance() {
		return this.balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	//내용물 프린트하기 위한 toString메소드
	public String toString() {
		String result =bank + " ," + accountNumber + " ,"+balance;
		return result;
		
	}
}
