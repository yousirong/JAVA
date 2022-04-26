package covid19project;

class Account {
	private int total = 0 ;
	//하나의 스레드만 접근가능하게 해줌
	
	synchronized void deposit(String name, int idx) {
		if(total < 500000) {
			System.out.println(name+":" +idx+"번째");
			total = total +1000;
		}
	}
	int getTotal() {
		return total;
	}
}

class Customer extends Thread {
	private Account account; // 계좌주소 저장 변수
	
	public Customer(Account account,String name) {
		super();
		this.account = account;
		setName(name);
	}
	@Override
	public void run() {
		for(int idx =1; idx<=500; idx++) {
			//1000원 씩 증가
			if(account.getTotal() >= 500000) {
				break;
			}else {
				account.deposit(getName(), idx);
			}
		}
	}
	
}

public class SynchronizedTest {

	public static void main(String[] args) {
		//Synchronized 동기화
		//서로 다른 스레드가 같은 데이터를 사용할 때 
		//한 번에 한 스레드만 접근 가능하게함.
		
		Account account = new Account();
		
		Customer[] customers = new Customer[5];
		customers[0] = new Customer(account,"철수");
		customers[1] = new Customer(account,"영이");
		customers[2] = new Customer(account,"숙희");
		customers[3] = new Customer(account,"영자");
		customers[4] = new Customer(account,"홍철");
		
		//실행 
		for(Customer customer : customers) {
			customer.start();
		}
		
		//다른 스레드들이 끝날때까지 기다림
		
		
			try {
				for(Customer customer : customers) {
				customer.join();
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			System.out.println("모금계좌 총액:" +account.getTotal());
		}
		
		
		
		
	}


