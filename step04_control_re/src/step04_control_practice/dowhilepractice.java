package step04_control_practice;

import java.util.Random;
import java.util.Scanner;

public class dowhilepractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int val1 = 1;
		
		do {
			int x=random.nextInt(10)+1;
			int y=random.nextInt(10)+1;
			int result = x+y;
			
			System.out.print(x+ "+"+y+"=");
			
			int user = sc.nextInt();
			if(user ==result)
			{
				System.out.println("정답입니다.");
				
			}else {
				System.out.println("틀린답입니다.");
				
				
			}
		val1++;
			
		}while (val1 <=5);
		
		sc.close();
	}

}
