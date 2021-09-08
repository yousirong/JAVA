package step10_Tosstest;

public class Account {
	private static int accNo =1111;
	private String name;
	private int accountNumber;
	private int balance;
	
	public Account() {
		super();
	}
	
	public Account (String name) {
		this.name = name;
		balance = 0;
	}
	
	public Account(String name, int amount) {
		this(name);
		accountNumber = accNo;
		accNo++;
		balance = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}

	

	
	
	
	
}
