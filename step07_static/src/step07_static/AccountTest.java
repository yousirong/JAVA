package step07_static;

public class AccountTest {

	public static void main(String[] args) {
		Account[] accounts = new Account[3];
		accounts[0] = new Account("신한 ");
		accounts[1] = new Account("우리", 50000);
		accounts[2]= new Account("국민",100000);
		
		System.out.println("계좌 LIST");
		for(Account account : accounts) {
			System.out.println(account);
		}
	
		accounts[0].setBank("카카오");
		accounts[0].setBalance(10000);
		System.out.println(accounts[0].getBank()+","+accounts[0].getBalance());
		
		//index 1,2 변경해서 프린트 setter, getter 이용
		
		accounts[1].setBank("하나");
		accounts[1].setBalance(77777);
		System.out.println(accounts[1].getBank()+","+accounts[1].getBalance());

		System.out.println("계좌 LIST");
		for(Account account : accounts) {
			System.out.println(account);
		}
	}

}
