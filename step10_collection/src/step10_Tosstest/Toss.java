package step10_Tosstest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Toss extends Account {
	
	
	List<String> accountList= new ArrayList<>();
	
	List<Account> linkedList = new LinkedList<>();
	
	public void printAll() {
		for(Account account1 : linkedList) {
			System.out.println(account1);
		}
	}
	public void add(Account account) {
		linkedList.add(account);
	}
	
	public void delete(int accNo) {
		for(int idx = 1111 ; idx <= accNo; idx++ ) {
			if(linkedList.get(idx).getName().equals(accNo)) {
			     linkedList.remove(idx);
			}else {
				System.out.println("일치하는 계좌가 없습니다.");
			}
		}
	}
	
	public void deposit(int accNo, int amount) {
		for(int idx = 1111 ; idx <= accNo; idx++ ) {
			if(linkedList.get(idx).equals(accNo)) {
			     amount +=getBalance();
			}else {
				System.out.println("일치하는 계좌가 없습니다.");
			}
		}
	}
	
	public void withdraw(int accNo, int amount) {
		for(int idx = 1111 ; idx <= accNo; idx++ ) {
			if(linkedList.get(idx).equals(accNo)) {
			     amount -=getBalance();
			}else {
				System.out.println("일치하는 계좌가 없습니다.");
			}
		}
	}
	
	void transfer(int sendingAccNo,int recievingAccNo,int amount ) 
	{
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		sendingAccNo =i;
		recievingAccNo = getAccountNumber();
		for(int idx=1111; idx <= sendingAccNo; idx++) {
			if(linkedList.get(idx).equals(recievingAccNo)) {
				amount =recievingAccNo;
			}
		}
	}
	
	void run() {
		 System.out.println("----TOSS----");
		 System.out.println("1.은행별 잔고 보기");
		 System.out.println("2.입금하기");
		 System.out.println("3.인출하기");
		 System.out.println("4.송금하기");
		 System.out.println("5.계좌생성");
		 System.out.println("6.종료");
		 Scanner sc = new Scanner(System.in);
		 System.out.println(">>");
		 int i =sc.nextInt();
		 switch(i) {
		 case 1:
			 System.out.println("1.은행별 잔고 보기");
			 break;
		 case 2:
			 System.out.println("2.입금하기");
			 break;
		 case 3:
			 System.out.println("3.인출하기");
			 break;
		 case 4:
			 System.out.println("4.송금하기");
			 break;
		 case 5:
			 System.out.println("5.계좌생성");
			 break;
		 case 6:
			 System.out.println("6.종료");
			 System.out.println();
			 break;
		default :
			System.out.println("잘못된 입력입니다.");
			 break;
		
		 }
		 
		 
	}
}
