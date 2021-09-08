package step10_Tosstest;

public class CheckingAccount extends Account implements AccountFunc{
	
	@Override
	public void deposit(int amount) {
		amount +=getBalance();
		
	}

	@Override
	public void withdraw(int amount) {
		
		setBalance(0);
		amount =0;
	}
	
	
	
}
